
import java.util.Scanner;
public class calculadora {
	
           public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        boolean executando = true;
	        while (executando) {
	            System.out.println("Escolha uma opera��o:");
	            System.out.println("1 - Adi��o");
	            System.out.println("2 - Subtra��o");
	            System.out.println("3 - Multiplica��o");
	            System.out.println("4 - Divis�o");
	            System.out.println("5 - Sair");
	            int escolha = input.nextInt();
	            switch (escolha) {
	                case 1:
	                    System.out.println("Digite o primeiro n�mero:");
	                    double num1 = input.nextDouble();
	                    System.out.println("Digite o segundo n�mero:");
	                    double num2 = input.nextDouble();
	                    double soma = num1 + num2;
	                    System.out.println("A soma �: " + soma);
	                    break;
	                case 2:
	                    System.out.println("Digite o primeiro n�mero:");
	                    num1 = input.nextDouble();
	                    System.out.println("Digite o segundo n�mero:");
	                    num2 = input.nextDouble();
	                    double diferenca = num1 - num2;
	                    System.out.println("A diferen�a �: " + diferenca);
	                    break;
	                case 3:
	                    System.out.println("Digite o primeiro n�mero:");
	                    num1 = input.nextDouble();
	                    System.out.println("Digite o segundo n�mero:");
	                    num2 = input.nextDouble();
	                    double produto = num1 * num2;
	                    System.out.println("O produto �: " + produto);
	                    break;
	                case 4:
	                    System.out.println("Digite o primeiro n�mero:");
	                    num1 = input.nextDouble();
	                    System.out.println("Digite o segundo n�mero:");
	                    num2 = input.nextDouble();
	                    if (num2 == 0) {
	                        System.out.println("Erro: divis�o por zero");
	                    } else {
	                        double divisao = num1 / num2;
	                        System.out.println("A divis�o �: " + divisao);
	                    }
	                    break;
	                case 5:
	                    executando = false;
	                    break;
	                default:
	                    System.out.println("Escolha inv�lida. Tente novamente.");
	                    break;
	            }
	        }
	        System.out.println("Programa encerrado.");
	    }
	}

