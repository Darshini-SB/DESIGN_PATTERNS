package STRATEGY;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setPayment(new CreditCardPayment("123-145-777"));
        paymentContext.executePayment(100);

        paymentContext.setPayment(new GooglePayPayment("1234567890"));
        paymentContext.executePayment(200);

        paymentContext.setPayment(new PayPalPayment("abc2gmail.com"));
        paymentContext.executePayment(300); // Strategy pattern in action
    }
}
