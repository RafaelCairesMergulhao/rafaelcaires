package Pacote2;
import java.util.Scanner; 
public class ConversaoCelsiusFahrenheit {

	public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        System.out.print("Digite a temperatura em graus Celsius: ");
		        double celsius = input.nextDouble();

		        double fahrenheit = (9.0 / 5.0) * celsius + 32.0;

		        System.out.printf("%.2f graus Celsius correspondem a %.2f graus Fahrenheit.", celsius, fahrenheit);

		        input.close();
		    }
		}
