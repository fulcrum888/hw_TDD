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
        double monthlyRate = interestRate/(12*100);
        if (interestRate == 0) {
            return 1/loanMonths;
        } else {
            return monthlyRate * Math.pow(monthlyRate + 1, loanMonths) /
                    (Math.pow(monthlyRate + 1, loanMonths) - 1);
        }
    }

    public double calculateMonthlyPayment() {
        return loanAmount * this.calculateAnnuity();
    }

    public double calculateFullAmount() {
        return -1;
    }

    public double calculateOverpayment() {
        return -1;
    }

}
