package lista.exercicios.srp.violation.solution;

public class Piloto {

    private Veiculo veiculo;

    public Piloto(Veiculo veiculo ){
        this.veiculo = veiculo;
    }

    public void aumentaVelocidade(){
        veiculo.acelerar();
    }
    
    public void abastecer(int litros){
    	veiculo.setQuantidadeCombustivel(litros);
    }
    
}
