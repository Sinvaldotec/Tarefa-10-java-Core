package exercicio01;

public class Exercicio01 {

	public static void main(String[] args) {
		  // Loop de 15 a 200
        for (int i = 15; i <= 200; i++) {
            // Calcula o quadrado do número atual
            int quadrado = i * i;
            // Apresenta o número e seu quadrado
            System.out.println("O quadrado de " + i + " é: " + quadrado);
        }
    }
}