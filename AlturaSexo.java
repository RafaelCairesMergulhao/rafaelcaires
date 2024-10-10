package atividade3;

import java.util.Scanner;

public class AlturaSexo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n, qtMulheres = 0, qtHomens = 0, qtHomensAltos = 0;
		float altura, somaAlturasMulheres = 0, mediaAlturasMulheres = 0;
		
		System.out.print("Digite o número de pessoas: ");
		n = entrada.nextInt();
		
		for(int i=1; i <= n; i++) {
			System.out.print("Digite a altura da pessoa" + i+": ");
			altura = entrada.nextFloat();
			System.out.println("Digite o sexo da pessoa"+i +"(M OU F):");
			String sexo = entrada.next();
			
			if (sexo.equalsIgnoreCase("M")) {
				qtHomens++;
				if (altura > 1.7) {
					qtHomensAltos++;
				}
			}else if (sexo.equalsIgnoreCase("F")) {
				qtMulheres++;
				somaAlturasMulheres += altura;
				
				}
			}
		
		mediaAlturasMulheres = somaAlturasMulheres / qtHomens;
		
		System.out.println("Quantidade de homens: "+ qtHomens);
		System.out.println("Quantidade de mulheres: "+ qtMulheres);
		System.out.println("Quantidade de homens acima de 1,70: "+ qtHomensAltos);
		System.out.println("Média das alturas das mulheres: "+ mediaAlturasMulheres);
		} 	}


