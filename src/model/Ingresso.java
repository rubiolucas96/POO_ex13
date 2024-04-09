package model;

public class Ingresso {
    private float valor;

    public Ingresso(String identificador, float valor) {
        this.valor = valor;
    }

    public float valorFinal(float taxaConveniencia) {
        return this.valor + taxaConveniencia;
    }


}