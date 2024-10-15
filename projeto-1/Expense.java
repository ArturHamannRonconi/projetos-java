public class Expense {
    private double value;
    private ExpenseType type;
        
    Expense(double value, String type) {
        this.setType(type);
        this.setValue(value);
    }
    
    public ExpenseType getType() {
        return this.type;
    }
    
    public double getValue() {
        return this.value;
    }
    
    private void setType(String type) {
        try {
            this.type = ExpenseType.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo de gasto inválido: " +  type);
            this.type = ExpenseType.DEFAULT;
        }
    }
    
    private void setValue(double value) {
        this.value = value;
    }
}