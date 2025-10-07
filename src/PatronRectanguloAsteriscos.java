/*
 * Escribe un programa en Java que pida al usuario dos números (n y M) y dibuje una figura de asteriscos de filas y columnas.
 * */

import java.util.Scanner;

public class PatronRectanguloAsteriscos {
    public static void main(String[] args) {
        int filas;
        int columnas;
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa para dibujar una figura de asteriscos de filas y columnas");

        do {
            System.out.println("Ingrese la cantidad de columnas que va a tener la figura: ");
            columnas = sc.nextInt();
            if (columnas <= 0) {
                System.err.println("El número de columnas debe ser mayor a 0");
            }
        } while (columnas <= 0);

        do {
            System.out.println("Ingrese la cantidad de filas que va a tener la figura: ");
            filas = sc.nextInt();
            if (filas <= 0) {
                System.err.println("El número de filas debe ser mayor a 0");
            }
        } while (filas <= 0);

        System.out.println("Figura común");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Figura con huecos");

        System.out.println("\nLa cantidad elegida es: ");
        System.out.println(columnas + " columnas.");
        System.out.println(filas + " filas. \n");

    }
}
