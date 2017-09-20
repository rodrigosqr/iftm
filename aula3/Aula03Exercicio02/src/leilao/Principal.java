package leilao;

import leilao.model.*;

public class Principal {

	public static void main(String[] args) {
		
		Leilao leilao1 = new Leilao(new Bem("Livro",20.0));
		leilao1.registrarLance(new Lance("João",10.0));
		leilao1.registrarLance(new Lance("Maria",30.0));
		leilao1.registrarLance(new Lance("Pedro",32.5));
		leilao1.registrarLance(new Lance("Joaquim",33.0));
		leilao1.finalizar();
		leilao1.registrarLance(new Lance("Felisberto",35.7));
		
		System.out.println("\n\n\n");
		
		Leilao leilaoBicicleta = new Leilao(new Bem("Bicicleta",10.0));
		leilaoBicicleta.registrarLance(new Lance("João",20.0));
		leilaoBicicleta.registrarLance(new Lance("Maria",30.0));
		leilaoBicicleta.registrarLance(new Lance("Pedro",12.0));
		leilaoBicicleta.registrarLance(new Lance("Joaquim",22.0));
		leilaoBicicleta.finalizar();

	}

}
