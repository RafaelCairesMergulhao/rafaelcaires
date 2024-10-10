package Pacote2;

import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantidade de chopes: ");
        int chopes = sc.nextInt();
        System.out.print("Quantidade de coberturas da pizza: ");
        int coberturas = sc.nextInt();

        double valorChopes = chopes * 1.8;
        double valorPizza = 25 + (coberturas * 3.5);
        double valorTotal = valorChopes + valorPizza;

        double valorGarcom = valorTotal * 0.1;
        valorTotal += valorGarcom;

        System.out.print("Quantidade de pessoas na mesa: ");
        int pessoas = sc.nextInt();
        double valorPorPessoa = valorTotal / pessoas;

        System.out.printf("Cada pessoa deve pagar R$%.2f", valorPorPessoa);

        sc.close();
    }
}




