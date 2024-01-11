package fundamentos;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
//		int a = 3 * 4 - 10;
//		int b = (int) Math.pow(a, 3);
//		double c = Math.pow(a, 3);
//		
//		System.out.println(b);
//		System.out.println(c);
		
		double cimaEsquerdo =  Math.pow(6 * (3 + 2) , 2); // 900
		double baixoEsquerdo = 3 * 2; // 6
		
		double cimaDiretira = (1 - 5) * (2 - 7); // 20
		double baixoDireita = 2; 

		double meioEsquerda = cimaEsquerdo / baixoEsquerdo; // 150
		double meioDireita = Math.pow((cimaDiretira / baixoDireita), 2); // 100
		
		double resultado = Math.pow((meioEsquerda - meioDireita), 3) / Math.pow(10, 3);		

		System.out.println("O resultado final é: " + resultado);
		
		
	}
}
