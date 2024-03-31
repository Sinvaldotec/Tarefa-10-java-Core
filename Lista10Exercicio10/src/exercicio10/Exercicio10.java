package exercicio10;

public class Exercicio10 {

	public static void main(String[] args) {
		// Iniciando a contagem em 10 graus Celsius
        int celsius = 10;
        // Finalizando a contagem em 100 graus Celsius
        int limiteCelsius = 100;

        // Apresentando cabeçalho
        System.out.println("Celsius\t\tFahrenheit");

        // Loop para converter e apresentar os valores de Celsius para Fahrenheit de 10 em 10 graus
        while (celsius <= limiteCelsius) {
            // Calculando Fahrenheit usando a fórmula de conversão
            double fahrenheit = (9.0 * celsius + 160.0) / 5.0;
            // Apresentando os valores
            System.out.println(celsius + "\t\t" + fahrenheit);
            // Incrementando a temperatura Celsius em 10 graus para o próximo loop
            celsius += 10;
        }
    }
}
