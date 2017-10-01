package leilao.model;

import java.util.ArrayList;
import java.util.List;

public class Leilao {
	private Bem bem;
	private boolean status;
	private Lance vencedor;
	private List<Lance> lances;

	public Leilao() {
	}

	public Leilao(Bem bem) {
		this.bem = bem;
		this.status = true;
		this.lances = new ArrayList<>();
	}

	public void registrarLance(Lance lance) {
		if (this.status) {
			if (this.vencedor == null) {
				if (lance.getValor() > this.bem.getValorInicial()) {
					this.lanceValido(lance);
				} else {
					this.lanceInvalido(lance);
				}
			} else if (lance.getValor() > this.vencedor.getValor()) {
				this.lanceValido(lance);
			} else {
				this.lanceInvalido(lance);
			}			
		} else {
			System.out.println(lance.getNomePessoa() + ", o Leilão está encerrado");
		}
	}

	public void finalizar() {
		this.status = false;

		System.out.println("\n########## BEM LEILOADO    ##########");
		System.out.println(bem);

		System.out.println("\n########## TODOS OS LANCES ##########");
		this.lances.forEach(System.out::println);

		System.out.println("\n########## LANCE VENCEDOR        ##########");
		System.out.println(vencedor + "\n");
	}

	private void lanceInvalido(Lance lance) {
		System.out.println(lance.getNomePessoa() + ", o valor do seu lance deve ser maior que " + (this.vencedor == null ? this.bem.getValorInicial() : this.vencedor.getValor()));
	}

	private void lanceValido(Lance lance) {
		this.vencedor = lance;
		this.lances.add(lance);
		System.out.println(lance.getNomePessoa() + ", o seu lance foi aceito");
	}

	public Bem getBem() {
		return bem;
	}

	public void setBem(Bem bem) {
		this.bem = bem;
	}

	public Lance getVencedor() {
		return vencedor;
	}

	public void setVencedor(Lance vencedor) {
		this.vencedor = vencedor;
	}

	public List<Lance> getLances() {
		return lances;
	}

	public void setLances(List<Lance> lances) {
		this.lances = lances;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
