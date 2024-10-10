package Pacote2;
import java.util.Scanner;
public class CalculadoraNumeros {

	public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int triplo = numero * 3;

        double metade = numero / 2.0;

        double raizCubica = Math.cbrt(numero);

        double potenciaFracionaria = Math.pow(numero, 2.0/3.0);

        System.out.println("Triplo: " + triplo);
        System.out.println("Metade: " + metade);
        System.out.println("Raiz Cúbica: " + raizCubica);
        System.out.println("Potência Fracionária 2/3: " + potenciaFracionaria);
    }
}