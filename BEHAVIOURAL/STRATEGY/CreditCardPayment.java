package STRATEGY;

// Credit card payment strategy
public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;
    public CreditCardPayment(String cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    public void pay(int amount)
    {
        System.out.println("paid amount " + amount + " using credit card " + cardNumber);
    }
}
