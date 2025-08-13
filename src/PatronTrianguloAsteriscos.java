/*
* Escribe un programa en Java que pida al usuario un número n y dibuje un triángulo rectángulo de asteriscos (*) de altura n.
*/

import java.util.Scanner;

public class PatronTrianguloAsteriscos {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ejercicio para dibujar un triángulo rectángulo de asteriscos con altura n");


        while (true) {
            System.out.println("Ingrese un número para dibujar un triángulo");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Valor incorrecto, debe ingresar un número mayor a 0");
            } else {
                break;
            }
        }

        System.out.println("\nTriángulo común\n");
        for (int fila = 1; fila <= n; fila++) {
            for (int col = 1; col <= fila; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nTriángulo invertido\n");
        for (int fila = n; fila >= 1; fila--) {
            for (int col = 1; col <= fila; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        sc.close();
    }
}
