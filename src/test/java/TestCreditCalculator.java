import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestCreditCalculator {
    @Test
    public void testCalculateAnnuity() {
        //given
        final CreditCalculator original =
                new CreditCalculator(6, 1_000_000, 12);
        double argument = 0.086;
        //when
        final double result = original.calculateAnnuity() - argument;

        //then
        Assertions.assertTrue(Math.abs(result) < 0.001,
                "Неверное вычисление аннуитентого кэффициента");
    }

    @Test
    public void testCalculateMonthlyPayment() {
        //given
        final CreditCalculator original =
                new CreditCalculator(6, 1_000_000, 12);
        double argument = 86066.43;

        //when
        final double result = original.calculateMonthlyPayment() - argument;

        //then
        Assertions.assertTrue(Math.abs(result) < 0.01,
                "Неверное вычисление размера ежемесячного платежа");
    }

    @Test
    public void testCalculateFullAmount() {
        //given
        final CreditCalculator original =
                new CreditCalculator(6, 1_000_000, 12);
        double argument = 1032797.16;

        //when
        final double result = original.calculateFullAmount() - argument;

        //then
        Assertions.assertTrue(Math.abs(result) < 0.01,
                "Неверное вычисление полной стоимости кредита");
    }

    @Test
    public void testCalculateOverpayment() {
        //given
        final CreditCalculator original =
                new CreditCalculator(6, 1_000_000, 12);
        double argument = 32797.16;

        //when
        final double result = original.calculateOverpayment() - argument;

        //then
        Assertions.assertTrue(Math.abs(result) < 0.01,
                "неверное вычисление размера переплаты");
    }
}
