package Pacote2;
import java.util.Scanner;

public class AntecessorSucessor {

	private static final Scanner Sc = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
            System.out.println("Digite aqui um numéro inteiro: ");
            int num = sc.nextInt();
            System.out.println("Antecessor: "+ (num - 1));
            System.out.println("Sucessor: "+ (num + 1));
            Sc.close();
           
	}
}
