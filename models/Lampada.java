package models;

public class Lampada{
    private String potencia;
    private String tipo;
    private boolean isAcesa = false;

    public Lampada(String potencia, String tipo, boolean isAcesa) {
        this.potencia = potencia;
        this.tipo = tipo;
        this.isAcesa = isAcesa;
    }
    public String getPotencia() {
        return potencia;
    }
    public boolean isAcesa() {
        return isAcesa;
    }
    public void setAcesa(boolean isAcesa) {
        this.isAcesa = isAcesa;
    }
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void acender(){
        isAcesa = true;
    }
}