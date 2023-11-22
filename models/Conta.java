package models;

public class Conta {
    private String nomeTitular;
    private String numConta;
    private double saldo;

    public String getNomeTitular() {
        return nomeTitular;
    }
    public String getNumConta() {
        return numConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public boolean sacar(double valor){
        if (saldo < valor) {
            return false;
        } else {
            saldo-=valor;
            return true;
        }
    }
    public boolean depositar(double valor){
        saldo+=valor;
        return true;
    }
}
