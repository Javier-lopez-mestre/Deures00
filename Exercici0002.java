package com.exercicis;

import java.util.Locale;
import java.util.Scanner;

public class Exercici0002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale localeUS = Locale.US;

        System.out.print("Escriu el valor en Euros: ");
        double euros = scanner.nextDouble();

        System.out.print("Escriu la tasa de conversió (ex: 1.25): ");
        double conversio = scanner.nextDouble();

        double dollars = euros*conversio;

        System.out.printf(localeUS, "El valor de %.2f€ són %.2f$%n", euros, dollars);

        scanner.close();
    }
}
