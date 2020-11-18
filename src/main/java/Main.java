import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ставку по кредиту в процентах");
        double interestRate = scanner.nextDouble();
        System.out.println("Введите сумму");
        int loanAmount = scanner.nextInt();
        System.out.println("Введите срок кредита в месяцах");
        int loanMonths = scanner.nextInt();

        CreditCalculator creditCalculator = new CreditCalculator(interestRate, loanAmount, loanMonths);

        System.out.printf("Ежемесячный платёж: %.2f\n" +
                "Полная стоимость кредита: %.2f\n" +
                "Переплата по кредиту: %.2f\n",
                creditCalculator.calculateMonthlyPayment(),
                creditCalculator.calculateFullAmount(),
                creditCalculator.calculateOverpayment());
    }
}
