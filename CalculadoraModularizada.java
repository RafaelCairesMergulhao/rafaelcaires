import java.util.Scanner;

public class CalculadoraModularizada {
    static Scanner entrada = new Scanner(System.in);
    static double num1, num2, resultado=0;

    public static void main(String args[]){
        int opcao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha uma das opções abaixo:\n"
                + "1 - Somar\n"
                + "2 - Subtrair\n"
                + "3 - Multiplicar\n"
                + "4 - Dividir\n"
                + "Opcão: ");
        opcao = entrada.nextInt();
        if(opcao==1){
            resultado = soma();
        }else if(opcao==2){
            resultado = subtracao();
        }else if(opcao==3){
            resultado = multiplicacao();
        }else if(opcao==4){
            resultado = divisao();
        }else{
            System.out.println("Opção inválida!");
        }
        System.out.println("Resultado: "+resultado);
        entrada.close();
    }

    public static void lerDados(){
        System.out.println("Informe o primeiro número: ");
        num1 = entrada.nextDouble();
        System.out.println("Informe o segundo número: ");
        num2 = entrada.nextDouble();
    }

    public static double soma(){
        lerDados();
        return num1+num2;
    }

    public static double subtracao(){
        lerDados();
        return num1-num2;
    }

    public static double multiplicacao(){
        lerDados();
        return num1*num2;
    }

    public static double divisao(){
        lerDados();
        if(num2!=0){
            return num1/num2;
        }else{
            System.out.println("Não há divisão por zero!");
            return 0;
        }
    }
}
