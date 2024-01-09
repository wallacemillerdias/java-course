package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Wallace";
		var sobrenome = "Miller";
		var idade = 33;
		var salario = 12345.987;
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: "
		+ sobrenome + "\nIdade: " + idade + "\nSalário: " 
				+ salario;
		System.out.println(maisUmaFrase);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f"
				, nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("frase qualquer".contains("qual"));
		System.out.println("frase qualquer".indexOf("qual"));
		System.out.println("frase qualquer".substring(6));
		System.out.println("frase qualquer".substring(1, 4));
	}
	
}
