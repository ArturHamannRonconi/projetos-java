public class ServiceIncome extends Income {
    ServiceIncome(double income) {
        super(income);
    }
    
    protected int getIncomeTaxPercent() {
        return 15;
    }
}