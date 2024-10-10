import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = input.nextDouble();

        if (a == 0) {
            System.out.println("N�o � uma equa��o do segundo grau.");
            return;
        }

        System.out.print("Digite o valor de b: ");
        double b = input.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = input.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equa��o n�o possui ra�zes reais.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A equa��o possui uma raiz real: " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equa��o possui duas ra�zes reais: " + x1 + " e " + x2);
        }
    }
}