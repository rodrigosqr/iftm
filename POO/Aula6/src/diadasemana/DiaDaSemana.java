package diadasemana;

public class DiaDaSemana {

	
	public static void main(String[] args) {
		
		
		String mensagem = "";
		for (int i = 1; i < 8; i++) {
			switch (i) {
				case 1: mensagem = new Domingo().getMensagem(); break;
				case 2: mensagem = new Segunda().getMensagem(); break;
				case 3: mensagem = new Terca().getMensagem(); break;
				case 4: mensagem = new Quarta().getMensagem(); break;
				case 5: mensagem = new Quinta().getMensagem(); break;
				case 6: mensagem = new Sexta().getMensagem(); break;
				case 7: mensagem = new Sabado().getMensagem(); break;
				
			}
			System.out.println(mensagem);
		}
	}
}
