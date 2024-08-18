package AuladeHeranca;

public class Veiculo {
	protected int motor;
	protected int nRodas;
	
	public Veiculo (int m, int nr) {
		motor = m;
		nRodas = nr;
	}
	
	public void mostrar () {
		System.out.println("Potência do motor: " + motor);
		System.out.println("Número de rodas: " + nRodas);
	}
}
