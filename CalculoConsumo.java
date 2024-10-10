package Pacote2;

import java.util.Scanner;

public class CalculoConsumo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    System.out.print("Digite a quilometragem ao sair de viagem: ");
    double kmSaida = sc.nextDouble();

    System.out.print("Digite a quilometragem ao chegar de viagem: ");
    double kmChegada = sc.nextDouble();

    System.out.print("Digite a quantidade total de gasolina comprada (em litros): ");
    double litrosGasolina = sc.nextDouble();

    double quilometragemTotal = kmChegada - kmSaida;
    double quilometragemPorLitro = quilometragemTotal / litrosGasolina;

    System.out.printf("A quilometragem média por litro de gasolina foi de %.2f km/l", quilometragemPorLitro);

    sc.close();


	}

}
