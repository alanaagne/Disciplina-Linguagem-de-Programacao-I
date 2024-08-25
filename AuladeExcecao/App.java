package AuladeExcecao;

public class App {

	public static void main(String[] args) throws Exception {
		 Conta c1 = new Conta("123-4", 100.0);
	        Conta c2 = new Conta("444-4", 250.0);

	        try{
	            c1.debitar(1000.0);
	        }catch(SIException e){
	            System.out.println("Erro: " + e);
	        }

	        Repositorio BD = new Repositorio();
	        BD.inserir(c1);
	        BD.inserir(c2);
	        try{
	            BD.inserir(c1);
	        } catch (Exception e){
	            System.out.println("Erro: " + e);
	        } 
	       
	        BD.relatorio();
	}

}

