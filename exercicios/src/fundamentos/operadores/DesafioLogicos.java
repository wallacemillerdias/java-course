package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		// trabalhar na terca e quinta = tv 50'
		// trabalhar na terca ou quinta = tv 32'
		// tv 50'ou tv 32' = sorvete
		// sem trabalho = ficar em casa sem sorvete
		
		boolean terca = true;
		boolean quinta = true;
		
		boolean comprouTV50 = terca && quinta ;
		boolean comprouTV32 = terca ^ quinta;
		boolean comprouSorvete = terca || quinta;
		
		// Operador Unário
		boolean maisSaudavel = comprouSorvete;
		
		System.out.println("Comprou TV 50' " + comprouTV50);
		System.out.println("Comprou TV 32' " + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		
		System.out.println("Mais saudável? " + !maisSaudavel);
	}

}
