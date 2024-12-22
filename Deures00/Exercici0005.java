package com.exercicis;


public class Exercici0005 {

    public static boolean isPalindrom(String text) {
        text = normalize(text);
        String reverso = "";
        for (int contador = text.length() - 1; contador >= 0; contador--){
            reverso = reverso + text.substring(contador, contador+1);
        }
        if (text.equals(reverso)){
            return true;
        }else{
            return false;
        }
    }

    public static String normalize(String text) {
        String cadenaMinuscules = text.toLowerCase();            
        
        String[] accents = {"à", "á", "è", "é", "í", "ò", "ó", "ú", "ù", " ", "'", "!", "\\.", ",", "·"};
        String[] senseAccents = {"a", "a", "e", "e", "i", "o", "o", "u", "u", "", "", "", "", "", ""};
    
        for (int contador = 0; contador < accents.length; contador++){
           cadenaMinuscules =cadenaMinuscules.replaceAll(accents[contador], senseAccents[contador]);
        }
        return cadenaMinuscules;
    }
   
    public static void main(String[] args) {
        String[] exemples = {
            "Anul·la la lluna",
            "Atrapa la lluna",
            "Atrapa'l o l'aparta",
            "Aparta'l o atrapa'l",
            "No sap pas on",
            "On sap pas qui",
            "Tramaran anar a Mart",
            "A Mart trobaràn art",
            "Un pop nu",
            "Nu pop un"
        };

        // Comprovar cada text
        for (String text : exemples) {
            boolean esPalindrom = isPalindrom(text);
            System.out.println(text + " (" + (esPalindrom ? "Si" : "No") + ")");
        }
    }
    }
