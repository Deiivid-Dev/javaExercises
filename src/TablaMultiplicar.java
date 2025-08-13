/*
* Pide al usuario un número entero y muestra su tabla de multiplicar del 1 al 10.
*/

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;

        System.out.println("------ Tabla de multiplicar ------");

        while (true) {
            System.out.println("Ingresa un número del 1 al 10 para generar su tabla de multiplicar");
            number = sc.nextInt();

            if (number < 1 || number > 10) {
                System.out.println("El número debe estar entre un rango del 1 al 10");
            } else {
                break;
            }
        }

        System.out.println("El número ingresado es: " + number);
        System.out.println("Tabla de multiplicar del " + number + ":\n");

        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + ((number) * (i + 1)));
        }
    }
}
