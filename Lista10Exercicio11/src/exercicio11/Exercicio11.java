package exercicio11;

public class Exercicio11 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { // Verifica se o número é ímpar
                System.out.println("Fatorial de " + i + ": " + calcularFatorial(i));
            }
        }
    }

    public static int calcularFatorial(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
