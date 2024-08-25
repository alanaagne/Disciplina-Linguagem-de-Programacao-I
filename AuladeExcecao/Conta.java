package AuladeExcecao;

public class Conta {
    private String numero;
    private double saldo;

    public Conta(String n, double s){
        numero =n;
        saldo = s;
    }

    public void creditar(double valor){
        saldo += valor;
    }

    public void debitar(double valor) throws SIException{
        if(saldo >= valor){
            saldo -= valor;
        } else {
            SIException e = new SIException();
            throw e;
        }
    }
    
    public void mostrar() {
    	System.out.println("Número da conta: " + numero);
    	System.out.println("Saldo da conta: " + saldo);
    }
    
}
