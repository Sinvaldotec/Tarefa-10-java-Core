package exercicio07;

public class Exercicio07 {

	public static void main(String[] args) {
		int base = 3;
        int resultado = 1; // Começa com 3 elevado a 0

        System.out.println("Potências de 3:");

        // Potências de 3 do expoente 0 até o expoente 15
        for (int expoente = 0; expoente <= 15; expoente++) {
            // Imprime o resultado atual
            System.out.println(base + " elevado a " + expoente + " = " + resultado);

            // Calcula o próximo resultado multiplicando a base pelo resultado anterior
            resultado *= base;
        }
    }
}