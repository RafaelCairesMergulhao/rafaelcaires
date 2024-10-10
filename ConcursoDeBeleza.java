package atividade3;

import java.util.Scanner;
public class ConcursoDeBeleza {
	

public class ConcursoBeleza {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			double maiorAltura = 0;
			double segundaMaiorAltura = 0;
			double altura;
			
			do {
			    System.out.print("Digite a altura da moça (ou 0 para sair): ");
			    altura = sc.nextDouble();
			    
			    if (altura > maiorAltura) {
			        segundaMaiorAltura = maiorAltura;
			        maiorAltura = altura;
			    } else if (altura > segundaMaiorAltura) {
			        segundaMaiorAltura = altura;
			    }
			} while (altura != 0);
			
			System.out.println("As duas maiores alturas são: " + maiorAltura + " e " + segundaMaiorAltura);
		}
    }
}

}
