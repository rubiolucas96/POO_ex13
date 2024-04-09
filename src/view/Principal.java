package view;

import model.Ingresso;
import model.IngressoVIP;

public class Principal {
    public static void main(String[] args) {

        Ingresso ingressoComum = new Ingresso("001", 10.0f);


        float valorFinalComum = ingressoComum.valorFinal(5.0f);
        System.out.println("Valor final do ingresso comum: " + valorFinalComum);


        IngressoVIP ingressoVIP = new IngressoVIP("002", 100.0f, "VIP Guest");


        float valorFinalVIP = ingressoVIP.valorFinal(5.0f);
        System.out.println("Valor final do ingresso VIP: " + valorFinalVIP);
    }
}
