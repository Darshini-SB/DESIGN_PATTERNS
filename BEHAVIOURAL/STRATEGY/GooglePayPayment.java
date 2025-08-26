package STRATEGY;

// Google Pay payment strategy
public class GooglePayPayment implements PaymentStrategy{
    private String phoneNumber;
    public GooglePayPayment(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void pay(int amount)
    {
        System.out.println("paid amount " + amount + " using google pay " + phoneNumber);
    }
}
