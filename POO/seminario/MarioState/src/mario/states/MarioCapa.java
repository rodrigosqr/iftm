package mario.states;
import mario.interfaces.MarioState;

public class MarioCapa implements MarioState {

	@Override
	public MarioState pegarPena() {
		System.out.println("Mario CAPA");
		return this;
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario FLOR");
		return new MarioFlor();
	}

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario CAPA");
		return this;
	}

	@Override
	public MarioState levarDano() {
		System.out.println("Mario vai para Grande");
		return new MarioGrande();
	}

}
