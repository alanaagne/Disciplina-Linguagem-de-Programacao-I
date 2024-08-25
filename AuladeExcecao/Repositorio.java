package AuladeExcecao;

public class Repositorio {
    private Conta [] BD;
    private int indice;

    public Repositorio(){
        BD = new Conta[5];
        indice = 0;
    }

    public void inserir(Conta c) throws CEException{
        if(procurar(c)){
            CEException e = new CEException();
            throw e;
        } else {
            BD[indice] = c;
            indice++;
        }
    }

    public boolean procurar(Conta c){
        boolean temp = false;
        for (int i = 0; i < indice; i++){
            if(BD[i] == c){
                temp = true;
            }
        }
        
    
        return temp; }
   
    public void relatorio() {
    	System.out.println("Contas Cadastradas:");
    	for (int i=0 ; i < indice ; i++) {
    		BD[i].mostrar();
    	} 
    }
    
    
    
    }



