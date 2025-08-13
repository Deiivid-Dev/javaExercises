/*
* Pide una palabra o frase y cuenta cuántas vocales contiene (usa un ciclo for para recorrer el texto).
*/

import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {

        String word = "";
        int cantVocales = 0;
        int cantVocalesA = 0;
        int cantVocalesE = 0;
        int cantVocalesI = 0;
        int cantVocalesO = 0;
        int cantVocalesU = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese una palabra o frase, para determinar su cantidad de vocales:");
            word = sc.nextLine();

            if (word.isEmpty()) {
                System.err.println("Información no válida, debe ingresar un texto.");
            } else {
                break;
            }
        }

        System.out.println("El valor ingresado es: " + word);

        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cantVocales++;

                if (c == 'a') {
                    cantVocalesA++;
                } else if (c == 'e') {
                    cantVocalesE++;
                } else if (c == 'i') {
                    cantVocalesI++;
                } else if (c == 'o') {
                    cantVocalesO++;
                } else {
                    cantVocalesU++;
                }
            }
        }

        System.out.println("La cantidad de vocales de la frase o palabra '" + word + "' es: " + cantVocales);
        System.out.println("Vocales encontradas en la frase o palabra: ");

        if (cantVocalesA > 0) {
            System.out.println("Cantidad de vocales 'a': " + cantVocalesA);
        }

        if (cantVocalesE > 0) {
            System.out.println("Cantidad de vocales 'e': " + cantVocalesE);
        }

        if (cantVocalesI > 0) {
            System.out.println("Cantidad de vocales 'i': " + cantVocalesI);
        }

        if (cantVocalesO > 0) {
            System.out.println("Cantidad de vocales 'o': " + cantVocalesO);
        }

        if (cantVocalesU > 0) {
            System.out.println("Cantidad de vocales 'u': " + cantVocalesU);
        }
    }
}
