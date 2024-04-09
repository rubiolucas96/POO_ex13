package model;

public class IngressoVIP extends Ingresso {
    public IngressoVIP(String identificador, float valor, String funcaoComprador) {
        super(identificador, valor);
    }

    @Override
    public float valorFinal(float taxaConveniencia) {
 
        return super.valorFinal(taxaConveniencia) * 1.18f;
    }


}
