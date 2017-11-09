
public class MarioFlor implements MarioState {

	@Override
	public MarioState pegarPena() {
		System.out.println("Mario CAPA");
		return new MarioCapa();
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario FLOR");
		return this;
	}

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario FLOR");
		return this;
	}

	@Override
	public MarioState levarDano() {
		System.out.println("Mario vai para Grande");
		return new MarioGrande();
	}

}
