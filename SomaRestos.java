package atividade3;

import java.util.Random;

public class SomaRestos {
    public static void main(String[] args) {
        int sum = 0;
        Random rand = new Random();
        for (int i = 0; i < 200; i++) {
            int num = rand.nextInt();
            int remainder = num % 3;
            sum += remainder;
        }
        System.out.println("A soma dos restos da divisão por 3 de 200 números inteiros é: " + sum);
    }
}


