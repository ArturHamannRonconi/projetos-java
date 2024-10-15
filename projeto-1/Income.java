public abstract class Income {
    private double value;
    
    Income(double value) {
        this.setValue(value);
    }
    
    
    abstract protected int getIncomeTaxPercent();
    
    public Tax getTax() {
        var incomeTaxRate = (double) this.getIncomeTaxPercent() / 100;
        return new Tax(this.getValue() * incomeTaxRate);
    }
    
    public double getValue() {
        return this.value;
    }
    
    private void setValue(double value) {
        this.value = value;
    }
}