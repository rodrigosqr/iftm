package strategy.solucao;

public class Main {

	public static void main(String[] args) {

		int[] zipCodes = new int[] { 66209, 64113, 10162, 90210, 61701, 55901, 48823, 62901, 50014 };
		
		
		Amostrador amostrador = new Amostrador(zipCodes, 3, new Randomico());
		int[] amostra = amostrador.selecionaSubconjunto();

		System.out.println("Randomico");
		for (int i = 0; i < amostra.length; i++) {
			System.out.println(amostra[i]);
		}

		System.out.println("Sistemica");
		amostrador = new Amostrador(zipCodes, 3, new Sistemico());
		amostra = amostrador.selecionaSubconjunto();
		for (int i = 0; i < amostra.length; i++) {
			System.out.println(amostra[i]);
		}
	}
}