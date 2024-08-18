package AuladeHeranca;

public class App {
	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo(5, 4);
		//v1.mostrar();
		Automovel au1 = new Automovel(10, 4, "hilux");
		//au1.mostrar();
		Caminhao c1 = new Caminhao(100, 4, 800);
		//c1.mostrar();
		
		Repositorio r1 = new Repositorio();
		
		r1.inserir(v1);
		r1.inserir(au1);
		r1.inserir(c1);
		
		r1.remover(au1);
		
		r1.relatorio();
	}

}
