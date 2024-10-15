import java.util.Arrays;

public class Tax {
    private static final double MAX_DISCOUNT_PERCENT = 30;
    private double value;
    
    Tax(double value) {
        this.setValue(value);
    }
    
    public static double calculateDiscountedByExpenses(double totalTax, Expense[] expenses) {
        var totalExpenses = Arrays
            .stream(expenses)
            .filter(expense ->
                expense.getType() == ExpenseType.MEDICAL ||
                expense.getType() == ExpenseType.EDUCATIONAL
            )
            .mapToDouble(expense -> expense.getValue())
            .reduce(0, (subtotal, tax) -> subtotal + tax);

        var maxDiscountRate = (double) Tax.MAX_DISCOUNT_PERCENT / 100;
        var maxDiscount = totalTax * maxDiscountRate;

        return totalExpenses > maxDiscount ? maxDiscount : totalExpenses; 
    }
    
    public double getValue() {
        return this.value;
    }
    
    private void setValue(double value) {
        this.value = value;
    }
}