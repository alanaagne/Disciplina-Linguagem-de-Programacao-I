package AuladeHeranca;

public class Caminhao extends Veiculo {
	private int carga;
	
	public Caminhao(int m, int nr, int c) {
		super(m, nr);
		carga = c;
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("O peso da carga é: " + carga);
		
	}
	
}
