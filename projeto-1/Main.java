/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        System.out.println("Informe sua renda mensal: ");
        var salaryIncomeValue = scanner.nextDouble();
        
        System.out.println("Informe sua renda com prestação de serviços: ");
        var serviceIncomeValue = scanner.nextDouble();
        
        System.out.println("Informe sua renda de capital: ");
        var capitalIncomeValue = scanner.nextDouble();
        
        
        var salaryIncome = new SalaryIncome(salaryIncomeValue);
        var serviceIncome = new ServiceIncome(serviceIncomeValue);
        var capitalIncome = new CapitalIncome(capitalIncomeValue);
        
        var salaryTax = salaryIncome.getTax();
        var serviceTax = serviceIncome.getTax();
        var capitalTax = capitalIncome.getTax();
        
        var totalTax = salaryTax.getValue() + serviceTax.getValue() + capitalTax.getValue();
        
        System.out.println("Informe quantos gastos teve: ");
        var amountExpenses = scanner.nextInt();
        
        var expenses = new Expense[amountExpenses];

        for (var i = 0; i < amountExpenses; i++) {
            System.out.println("Informe o valor do gasto: ");
            var value = scanner.nextDouble();
            
            System.out.println("Informe o tipo do gasto (MEDICAL, EDUCATIONAL ou ENTERTAINMENT): ");
            var type = scanner.next();
            
            expenses[i] = new Expense(value, type);
        }
        
        
        var totalDiscount = Tax.calculateDiscountedByExpenses(totalTax, expenses);
        
        System.out.println("Renda salarial: R$ " + salaryIncome.getValue());
        System.out.println("Renda de serviço: R$ " + serviceIncome.getValue());
        System.out.println("Renda de capital: R$ " + capitalIncome.getValue());
        
        System.out.println("Imposto sobre renda salarial: R$ " + salaryTax.getValue());
        System.out.println("Imposto sobre renda de serviço: R$ " + serviceTax.getValue());
        System.out.println("Imposto sobre renda de capital: R$ " + capitalTax.getValue());
        
        System.out.println("Imposto total: R$" + totalTax);
        
        for (var i = 0; i < amountExpenses; i++) {
            System.out.println("R$ " + expenses[i].getValue() + " gastos em " + expenses[i].getType());
        }
        
        
        System.out.println("Desconto total R$ " + totalDiscount);
            
        System.out.println("Imposto final R$ " + (totalTax - totalDiscount));
	}
}