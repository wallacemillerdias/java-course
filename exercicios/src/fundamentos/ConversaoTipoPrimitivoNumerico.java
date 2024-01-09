package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
		
		float b = (float) 1.23456788888; // explícita (CAST)
		System.out.println(b);
		
		int c = 256;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e; // explícita (CAST)
		System.out.println(f);
	}

}
