package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o seu primeiro salário: ");
		String salario1 = entrada.next().replace(",", ".");
		double s1 = Double.parseDouble(salario1);
		
		System.out.println("Informe o seu segundo salário: ");
		String salario2 = entrada.next().replace(",", ".");
		double s2 = Double.parseDouble(salario2);
		
		System.out.println("Informe o seu terceiro salário: ");
		String salario3 = entrada.next().replace(",", ".");
		double s3 = Double.parseDouble(salario3);
		
		double media = (s1 + s2 + s3) / 3;
		System.out.println("A média do salário é: " + media);
		
		entrada.close();
	}

}
