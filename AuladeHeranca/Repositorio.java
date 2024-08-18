package AuladeHeranca;

public class Repositorio {
	private Veiculo [] BD;
	private int indice;
	
	public Repositorio () {
		BD = new Veiculo [5];
		indice = 0;
	}
	
	public void remover (Veiculo v) {
		for (int i=0 ; i<indice ; i++) {
			if (BD[i] == v) {
				BD[i] = BD[indice-1];
				BD[indice-1]=null;
				indice--;
			}
		}
	}
	
	public void inserir (Veiculo v) {
		BD[indice] = v;
		indice++;
	}
	
	public void relatorio () {
		for (int i=0 ; i<indice ; i++) {
			BD[i].mostrar();
		}
	}
}