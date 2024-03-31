package exercicio03;

public class Exercicio03 {

	public static void main(String[] args) {
		int soma = 0;

        // Loop para somar os cem primeiros números inteiros
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }

        System.out.println("A soma dos cem primeiros números inteiros é: " + soma);
    }
}
