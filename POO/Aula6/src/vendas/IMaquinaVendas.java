package vendas;

public interface IMaquinaVendas {

	void depositar(double valor);
	
	String getProduto();

	double getTroco();
}
