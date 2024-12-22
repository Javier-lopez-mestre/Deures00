package com.exercicis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Exercici0011 {

    public static ArrayList<String> escullNomsAleatoris(ArrayList<String> noms, int quantitat) {
        if (quantitat > noms.size()){
            throw new IllegalArgumentException("La quantitat no pot ser més gran que " + noms.size()+".");
        }
        ArrayList<String> copiaNoms = new ArrayList<>();
        Random random = new Random();

        for (int contador = 0; contador < noms.size(); contador++){
            copiaNoms.add(noms.get(contador));
        }
        ArrayList<String> cincNoms = new ArrayList<>();

        for (int contador = 0; contador < quantitat; contador++){
            int numRandom = random.nextInt(copiaNoms.size());
            cincNoms.add(copiaNoms.get(numRandom));
            copiaNoms.remove(numRandom);
        }
        return cincNoms;
    }
   
    public static ArrayList<String> nomsAcabenVocal(ArrayList<String> noms) {
        
        ArrayList<String> acabenVocal = new ArrayList<>();
        for (int contador = 0; contador < noms.size(); contador++){
            if (noms.get(contador).endsWith("a") || noms.get(contador).endsWith("e") ||
            noms.get(contador).endsWith("i") || noms.get(contador).endsWith("o") || noms.get(contador).endsWith("u")){
                acabenVocal.add(noms.get(contador));
            }
        }

        return acabenVocal;
    }

    public static ArrayList<String> nomsCompostos(ArrayList<String> noms) {
        ArrayList<String> compostos = new ArrayList<>();
        for (int contador = 0; contador < noms.size(); contador++){
            if (!noms.get(contador).replace(" ", "").equals(noms.get(contador))){
                compostos.add(noms.get(contador));
            }
        }
        return compostos;
    }

    public static void main(String[] args) {

        ArrayList<String> noms = new ArrayList<>(Arrays.asList(
            "Mario", "Princess Peach", "Wario", "Luigi", "Iggy Koopa", "Toad", "Yoshi", "Donkey Kong", "Birdo"
        ));

        System.out.println("Noms escollits a l'atzar: " + escullNomsAleatoris(noms, 5));
    
        try {
            ArrayList<String> seleccionatsError = escullNomsAleatoris(noms, 25);
            System.out.println("Noms escollits: " + seleccionatsError);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        System.out.println("Noms que acaben amb vocal: " + nomsAcabenVocal(noms));
    
        System.out.println("Noms compostos: " + nomsCompostos(noms));
    }
}
