public class Main{
    public static void main(String[] args) {
        Payment payment = new PaymentAdapter(new DollarPayment());
        payment.payInRupees(8000);
    }
}