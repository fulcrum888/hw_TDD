public class CreditCalculator {
    private double interestRate;
    private int loanAmount;
    private int loanMonths;

    public CreditCalculator(double interestRate, int loanAmount, int loanMonths) {
        this.interestRate = interestRate;
        this.loanAmount = loanAmount;
        this.loanMonths = loanMonths;
    }

    public double calculateAnnuity() {
        return -1;
    }

    public double calculateMonthlyPayment() {
        return -1;
    }

    public double calculateFullAmount() {
        return -1;
    }

    public double calculateOverpayment() {
        return -1;
    }

}
