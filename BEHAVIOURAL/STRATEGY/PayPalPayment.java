package STRATEGY;

// PayPal payment strategy
public class PayPalPayment implements PaymentStrategy{
    private String email;
    public PayPalPayment(String email)
    {
        this.email = email;
    }

    public void pay(int amount)
    {
        System.out.println("paid amount " + amount + " using paypal " + email);
    }
}
