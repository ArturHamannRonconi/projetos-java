/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    var taxaCouvert = 4;
        var custoCerveja = 5;
        var custoEspetinho = 7;
        var custoRefrigerante = 3;
        
        var scanner = new Scanner(System.in);        
        
        System.out.println("Informe o sexo (M ou F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);
        
        System.out.println("Quantidade de cervejas: ");
        var qtdCervejas = scanner.nextInt();
        
        System.out.println("Quantidade de espetinhos: ");
        var qtdEspetinhos = scanner.nextInt();

        System.out.println("Quantidade de refregerantes: ");
        var qtdRefrigerantes = scanner.nextInt();
        
        var custoIngresso = sexo == 'M' ? 10 : 8;
        var consumo = (qtdCervejas * custoCerveja) + (qtdEspetinhos * custoEspetinho) + (qtdRefrigerantes * custoRefrigerante);
        
        var valorPagar = consumo > 30
            ? consumo + custoIngresso 
	        : consumo + custoIngresso + taxaCouvert;
	   
	   System.out.println("O valor do consumo foi: R$ " + consumo);
	   System.out.println("O custo do ingresso é: R$ " + custoIngresso);
	   System.out.println("O valor a pagar é: R$ " + valorPagar);
	}
}