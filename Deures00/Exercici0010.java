package com.exercicis;

import java.util.ArrayList;
import java.util.Random;

public class Exercici0010 {

    public static ArrayList<Integer> generarNumerosAleatoris(int quantitat, int min, int max) {
        ArrayList<Integer> numerosAleatoris = new ArrayList<>();
        Random random = new Random();
        for (int contador = 0; contador < quantitat; contador++){
            numerosAleatoris.add(random.nextInt(max - min + 1) + min);
        }
        return numerosAleatoris;
    }

    public static ArrayList<Integer> multiplicarPerDos(ArrayList<Integer> llista) {
        ArrayList<Integer> resultat = new ArrayList<>();
        for (int num : llista) {
            resultat.add(num * 2);
        }
        return resultat;
    }

    public static ArrayList<Integer> filtrarImparells(ArrayList<Integer> llista) {
        ArrayList<Integer> imparells = new ArrayList<>();
        for (int num : llista){
            if (num % 2 != 0){
                imparells.add(num);
            }
        }
        return imparells;
    }

    public static ArrayList<Double> dividirPerDos(ArrayList<Integer> llista) {
        ArrayList<Double> dividits = new ArrayList<>();
        for (int num : llista){
            dividits.add(num / 2.0);
        }
        return dividits;
    }

    public static void main(String[] args) {

        ArrayList<Integer> llistaAleatoria = generarNumerosAleatoris(10, 0, 99);
        System.out.println("Llista inicial: " + llistaAleatoria);

        ArrayList<Integer> llistaMultiplicada = multiplicarPerDos(llistaAleatoria);
        System.out.println("Llista multiplicada per 2: " + llistaMultiplicada);

        ArrayList<Integer> llistaImparells = filtrarImparells(llistaAleatoria);
        System.out.println("Llista només amb números imparells: " + llistaImparells);

        ArrayList<Double> llistaDividida = dividirPerDos(llistaImparells);
        System.out.println("Llista imparells dividits per 2: " + llistaDividida);
    }
}
