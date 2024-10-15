public class CapitalIncome extends Income {
    CapitalIncome(double income) {
        super(income);
    }

    protected int getIncomeTaxPercent() {
        return 20;
    }
}