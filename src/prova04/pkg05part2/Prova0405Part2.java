package prova04.pkg05part2;

import java.util.Scanner;

/**
 * @author Denise
 */
public class Prova0405Part2 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        String nome;
	double salab,bonus,salab2,salal,ir;
	System.out.println("Digite o nome:");
	System.out.println("Digite o salario bruto:");
	nome = teclado.nextLine();
	salab = teclado.nextDouble();
	bonus = salab*5.5/100;
	salab2 = salab+bonus;
	if (salab2<3500) {
	ir = salab2*3.5/100;
	salal = salab2-ir;
	System.out.println("Nome: "+nome);
	System.out.println("Salario Bruto: R$ "+salab);
	System.out.println("Bônus: R$ "+bonus);
	System.out.println("I.R: R$ "+ir);
	System.out.println("Salario Liquido: R$ "+salal);
		   }
	else {
	ir = salab2*7.5/100;
	salal = salab2-ir;
	System.out.println("Nome: "+nome);
	System.out.println("Salario Bruto: R$ "+salab);
	System.out.println("Bônus: R$ "+bonus);
	System.out.println("I.R: R$ "+ir);
	System.out.println("Salario Liquido: R$ "+salal);
		   }
		   teclado.close();
    }
    
    
    
}
