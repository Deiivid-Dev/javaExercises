import java.util.Scanner;

public class ContadorDigitosParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contPares = 0;
        int contImpares = 0;
        System.out.println("Digite un número para determinar la cantidad de dígitos pares o impares");
        String number = scanner.nextLine();

        if (esNumeroValido(number)) {
            for (int i = 0; i < number.length(); i++) {
                int digit = Character.getNumericValue(number.charAt(i));

                if (digit % 2 == 0) {
                    contPares++;
                } else {
                    contImpares++;
                }
            }
            System.out.println("Dígitos pares: " + contPares);
            System.out.println("Dígitos impares: " + contImpares);
        } else {
            System.out.println("Entrada inválida. Solo se permiten números");
        }
    }

    public static boolean esNumeroValido(String input) {
        return input.matches("-?\\d+");
    }
}
