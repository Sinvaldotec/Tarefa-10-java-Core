package exercicio09;

public class Exercicio09 {

	public static void main(String[] args) {
		int n = 15; // número de termos desejados

        int primeiroTermo = 1;
        int segundoTermo = 1;

        System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");

        System.out.print(primeiroTermo + ", " + segundoTermo);

        for (int i = 3; i <= n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(", " + proximoTermo);
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
