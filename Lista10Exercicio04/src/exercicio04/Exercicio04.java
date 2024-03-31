package exercicio04;

public class Exercicio04 {

	public static void main(String[] args) {
		 int soma = 0;

	        // Loop de 1 até 500
	        for (int i = 1; i <= 500; i++) {
	            // Verifica se o número é par
	            if (i % 2 == 0) {
	                // Se for par, adiciona ao somatório
	                soma += i;
	            }
	        }

	        // Exibe o somatório
	        System.out.println("O somatório dos valores pares de 1 até 500 é: " + soma);
	    }
	}
