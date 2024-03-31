package exercicio08;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base (B): ");
        double base = scanner.nextDouble();

        System.out.print("Digite o valor do expoente (E): ");
        int expoente = scanner.nextInt();

        double resultado = calcularPotencia(base, expoente);
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    public static double calcularPotencia(double base, int expoente) {
        double resultado = 1;

        if (expoente >= 0) {
            for (int i = 0; i < expoente; i++) {
                resultado *= base;
            }
        } else {
            for (int i = 0; i > expoente; i--) {
                resultado /= base;
            }
        }

        return resultado;
    }
}