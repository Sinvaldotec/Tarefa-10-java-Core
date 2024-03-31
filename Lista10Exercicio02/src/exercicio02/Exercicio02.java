package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o número para o qual deseja-se a tabuada
        System.out.print("Digite um número para a tabuada: ");
        int numero = scanner.nextInt();
        
        // Apresenta a tabuada de multiplicação para o número fornecido
        System.out.println("Tabuada de multiplicação para " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        scanner.close();
    }
}
