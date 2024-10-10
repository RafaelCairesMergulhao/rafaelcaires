package Pacote2;

import java.util.Scanner;

public class VelocidadeMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    System.out.print("Digite o nome do piloto: ");
    String nome = sc.nextLine();

    System.out.print("Digite a distância percorrida em km: ");
    double distancia = sc.nextDouble();

    System.out.print("Digite o tempo que o piloto levou para percorrer a distância em horas: ");
    double tempo = sc.nextDouble();

    double velocidadeMedia = distancia / tempo;

    System.out.printf("A velocidade média de %s foi %.2f km/h", nome, velocidadeMedia);

    sc.close();
	   

	}

}
