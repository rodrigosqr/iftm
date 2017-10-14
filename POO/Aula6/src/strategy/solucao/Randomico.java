package strategy.solucao;

import java.util.ArrayList;
import java.util.Random;

public class Randomico implements ITipoAmostrador {

	@Override
	public int[] subconjunto(int[] populacao, int tamanhoAmostra) {
		int[] subConjunto = new int[tamanhoAmostra];
		Random generator = new Random();

		ArrayList<Integer> tempArray = new ArrayList<Integer>();
		for (int i = 0; i < populacao.length; i++)
			tempArray.add(populacao[i]);

		for (int i = 0; i < tamanhoAmostra; i++)
			subConjunto[i] = tempArray.remove(generator.nextInt(tempArray.size()));

		return subConjunto;
	}

}
