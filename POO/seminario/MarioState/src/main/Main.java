package main;
import mario.Mario;

public class Main {

	public static void main(String[] args) {
		
		Mario mario = new Mario();
		mario.pegarCogumelo();
		mario.levarDano();
		mario.pegarPena();
		mario.pegarFlor();
		
		mario.levarDano();
		mario.levarDano();
		mario.levarDano();
	}
}
