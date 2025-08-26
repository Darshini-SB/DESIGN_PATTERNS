class PaymentAdapter implements Payment{
    private DollarPayment dollarPayment;
    public PaymentAdapter(DollarPayment dollarPayment){
        this.dollarPayment = dollarPayment;
    }
    public void payInRupees(int amount){
        int dollarAmount = amount / 80;
        dollarPayment.payInDollars(dollarAmount);
    }
}