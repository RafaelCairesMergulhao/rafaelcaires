package Pacote2;

import java.util.Scanner;

public class mediaponderada2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3;
        float mp;

        System.out.print("Digite a primeira nota: ");
        n1 = sc.nextInt();
        System.out.print("Digite a segunda nota: ");
        n2 = sc.nextInt();
        System.out.print("Digite a terceira nota: ");
        n3 = sc.nextInt();

        mp = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10.0f;

        System.out.println("A media ponderada das notas eh: " + mp);

        sc.close();
    }
}