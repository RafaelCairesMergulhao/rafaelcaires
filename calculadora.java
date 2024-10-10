
import java.util.Scanner;
public class calculadora {
	
           public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        boolean executando = true;
	        while (executando) {
	            System.out.println("Escolha uma operação:");
	            System.out.println("1 - Adição");
	            System.out.println("2 - Subtração");
	            System.out.println("3 - Multiplicação");
	            System.out.println("4 - Divisão");
	            System.out.println("5 - Sair");
	            int escolha = input.nextInt();
	            switch (escolha) {
	                case 1:
	                    System.out.println("Digite o primeiro número:");
	                    double num1 = input.nextDouble();
	                    System.out.println("Digite o segundo número:");
	                    double num2 = input.nextDouble();
	                    double soma = num1 + num2;
	                    System.out.println("A soma é: " + soma);
	                    break;
	                case 2:
	                    System.out.println("Digite o primeiro número:");
	                    num1 = input.nextDouble();
	                    System.out.println("Digite o segundo número:");
	                    num2 = input.nextDouble();
	                    double diferenca = num1 - num2;
	                    System.out.println("A diferença é: " + diferenca);
	                    break;
	                case 3:
	                    System.out.println("Digite o primeiro número:");
	                    num1 = input.nextDouble();
	                    System.out.println("Digite o segundo número:");
	                    num2 = input.nextDouble();
	                    double produto = num1 * num2;
	                    System.out.println("O produto é: " + produto);
	                    break;
	                case 4:
	                    System.out.println("Digite o primeiro número:");
	                    num1 = input.nextDouble();
	                    System.out.println("Digite o segundo número:");
	                    num2 = input.nextDouble();
	                    if (num2 == 0) {
	                        System.out.println("Erro: divisão por zero");
	                    } else {
	                        double divisao = num1 / num2;
	                        System.out.println("A divisão é: " + divisao);
	                    }
	                    break;
	                case 5:
	                    executando = false;
	                    break;
	                default:
	                    System.out.println("Escolha inválida. Tente novamente.");
	                    break;
	            }
	        }
	        System.out.println("Programa encerrado.");
	    }
	}

