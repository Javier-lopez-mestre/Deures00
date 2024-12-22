package com.exercicis;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercici0008 {

    public static ArrayList<Integer> generaImparells(int numero) {
        ArrayList<Integer> imparells = new ArrayList<>();
        
        for (int contador = 2; contador <= numero; contador++){
            if (contador % 2 != 0){
                imparells.add(contador);
            }
        }
        
        return imparells;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix un número: ");
        int numero = scanner.nextInt();

        if (numero <= 2){
            System.out.println("No hi ha nombres imparells entre 2 i " + numero);
        }else{
            System.out.println("Nombres imparells entre 2 i " + numero + ": " + generaImparells(numero));
        }
        

        scanner.close();
    }
}
