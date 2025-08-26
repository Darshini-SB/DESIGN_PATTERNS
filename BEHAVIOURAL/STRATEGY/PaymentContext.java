package STRATEGY;

// Context class that uses payment strategies
public class PaymentContext {
    private PaymentStrategy payment;
    public void setPayment(PaymentStrategy payment)
    {
        this.payment = payment;
    }
    public void executePayment(int amount)
    {
        if(payment != null)
        {
           payment.pay(amount);
        }
        else{
            System.out.println("No payment strategy selected");
        }
    }
}
