package com.exercicis;

import java.util.Locale;

public class Exercici0006 {

    public static double calculaEntrada(int numeroAdults, int numNens, int numGrans, String dia) {
        if (dia.equals("dimarts")){
            return (numeroAdults * 10 * 0.8) + (numNens * 5 * 0.8) + (numGrans * 6 * 0.8);
        }else if (dia.equals("dijous")){
            if ((numeroAdults >= 1 || numGrans >= 1) && numNens > 0){
                return (numeroAdults * 10) + (numGrans * 6) + (5 * 0.5);
            }else{
                return (numeroAdults * 10) + (numGrans * 6) + (numNens * 5);
            }
        }else{
            return (numeroAdults * 10) + (numGrans * 6) + (numNens * 5);
        }
    }

    public static void main(String[] args) {

        String template = "%-35s%.2f€";

        System.out.println(String.format(Locale.US, template, "Cas 1 (2 adults, 2 nens, 1 gran):", calculaEntrada(2, 2, 1, "dimarts")));
        System.out.println(String.format(Locale.US, template, "Cas 2 (1 adult,  2 nens, 0 grans):", calculaEntrada(1, 2, 0, "dijous")));
        System.out.println(String.format(Locale.US, template, "Cas 3 (0 adults, 0 nens, 2 grans):", calculaEntrada(0, 0, 2, "dissabte")));
        System.out.println(String.format(Locale.US, template, "Cas 4 (1 adult,  0 nens, 0 grans):", calculaEntrada(1, 0, 0, "diumenge")));
        System.out.println(String.format(Locale.US, template, "Cas 5 (1 adult,  3 nens, 4 grans):", calculaEntrada(1, 3, 4, "dijous")));
        System.out.println(String.format(Locale.US, template, "Cas 6 (2 adults, 2 nens, 1 gran):", calculaEntrada(2, 2, 1, "diumenge")));

    }
}
