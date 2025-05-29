/*
*Crear un programa en Java que determine si un número entero ingresado por el usuario es un número primo.
*
* */

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("Digite un número para determinar si es primo: ");
        int num = scanner.nextInt();

        if (num < 2) {
            System.out.println("El número deber ser mayor que 1");
            return;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                contador++;
            }
        }

        if (contador > 1) {
            System.out.println("No es primo");
        } else {
            System.out.println("Es primo");
        }
    }
}
