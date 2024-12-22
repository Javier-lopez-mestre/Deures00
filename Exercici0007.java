package com.exercicis;

import java.util.Locale;

public class Exercici0007 {

    public static double calculaCostLloc(String tipusLloc) {
        switch (tipusLloc) {
            case "sala estàndard":
                return 100.0;
            case "jardí amb piscina":
                return 200.0;
            case "saló gran amb escenari":
                return 500.0;
            default:
                throw new IllegalArgumentException("Tipus de lloc desconegut: " + tipusLloc);
        }

    }

    public static double calculaCostMenjar(String tipusMenjar, int numConvidats) {
        double preuMenjar;
        switch (tipusMenjar) {
            case "menú bàsic":
                preuMenjar = numConvidats * 15.0;
                break;
            case "menú premium":
                preuMenjar = numConvidats * 30.0;
                break;
            default:
                throw new IllegalArgumentException("Tipus de menú desconegut: " + tipusMenjar);        
        }
        if (numConvidats > 50){
            preuMenjar = preuMenjar * 0.95;
        }
        return preuMenjar;
    }

    public static double calculaCostEntreteniment(String tipusEntreteniment) {
        switch (tipusEntreteniment) {
            case "màgia":
                return 250.0;
            case "música en directe":
                return 500.0;
            case "cap":
                return 0.0;
            default:
                throw new IllegalArgumentException("Tipus d'entreteniment desconegut: " + tipusEntreteniment);        }
    }

    public static double calculaFesta(String tipusLloc, String tipusMenjar, String tipusEntreteniment, int numConvidats) {
        if (tipusEntreteniment.equals("música en directe") && tipusLloc.equals("saló gran amb escenari")){
            return (calculaCostEntreteniment(tipusEntreteniment) - 100) +
            calculaCostLloc(tipusLloc) + calculaCostMenjar(tipusMenjar, numConvidats);
        }else{
            return calculaCostEntreteniment(tipusEntreteniment) +
            calculaCostLloc(tipusLloc) + calculaCostMenjar(tipusMenjar, numConvidats);
        }
    }

    public static void main(String[] args) {
        
        String template = "%-75s%.2f€";

        System.out.println(String.format(Locale.US, template, "Cas 1 (\"sala estàndard\", \"menú bàsic\", \"cap\", 20):", calculaFesta("sala estàndard", "menú bàsic", "cap", 20)));
        System.out.println(String.format(Locale.US, template, "Cas 2 (\"jardí amb piscina\", \"menú premium\", \"màgia\", 60):", calculaFesta("jardí amb piscina", "menú premium", "màgia", 60)));
        System.out.println(String.format(Locale.US, template, "Cas 3 (\"jardí amb piscina\", \"menú bàsic\", \"música en directe\", 40):", calculaFesta("jardí amb piscina", "menú bàsic", "música en directe", 40)));
        System.out.println(String.format(Locale.US, template, "Cas 4 (\"saló gran amb escenari\", \"menú premium\", \"música en directe\", 70):", calculaFesta("saló gran amb escenari", "menú premium", "música en directe", 70)));
        System.out.println(String.format(Locale.US, template, "Cas 5 (\"sala estàndard\", \"menú premium\", \"màgia\", 15):", calculaFesta("sala estàndard", "menú premium", "màgia", 15)));
    }
}
