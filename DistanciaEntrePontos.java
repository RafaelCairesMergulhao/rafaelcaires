package Pacote2;
import java.util.Scanner;

public class DistanciaEntrePontos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite as coordenadas do primeiro ponto (x1, y1):");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Digite as coordenadas do segundo ponto (x2, y2):");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("A distância entre os dois pontos é: " + distancia);
    }
}



