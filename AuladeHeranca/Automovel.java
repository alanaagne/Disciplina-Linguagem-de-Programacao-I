package AuladeHeranca;

public class Automovel extends Veiculo {
	private String tipo;
	
	public Automovel(int m, int nr, String t) {
		super(m, nr);
		tipo = t;
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("O tipo do veiculo é: " + tipo);
		
	}
	
}
