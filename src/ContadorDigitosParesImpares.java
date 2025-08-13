import java.util.Scanner;
/*
* Escribe un programa en Java que reciba un número entero y cuente cuántos dígitos pares e impares contiene.
*/

public class ContadorDigitosParesImpares {
    public static void main(String[] args) {
        int numPares = 0;
        int numImpares = 0;
        String number;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese un número para determinar la cantidad de pares e impares");
            number = sc.nextLine();

            if (validateNumber(number)) {
                break;
            } else {
                System.out.println("Entrada inválida, solo se permiten números positivos");
            }
        }

        System.out.println("El número ingresado es: " + number);

        if (number.startsWith("-")) {
            number = number.substring(1); // Elimina el primer elemento
        }

        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            if (digit % 2 == 0) {
                numPares++;
            } else {
                numImpares++;
            }
        }

        System.out.println("La cantidad de pares e impares son: ");
        System.out.println("Pares: " + numPares);
        System.out.println("Impares: " + numImpares);
    }

    public static boolean validateNumber(String input) {
        return input.matches("-?\\d+"); // Esta línea verifica que solamente se ingresen números
    }
}