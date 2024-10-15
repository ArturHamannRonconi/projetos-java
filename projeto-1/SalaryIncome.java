public class SalaryIncome extends Income {
    SalaryIncome(double income) {
        super(income);
    }
    
    protected int getIncomeTaxPercent() {
        return this.getValue() < 3000
            ? 0
            : this.getValue() >= 3000 && this.getValue() < 5000
            ? 10
            : 20;
    }
}