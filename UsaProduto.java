package pacote;
import java.util.ArrayList;
public class UsaProduto { public static void main(String[] args)
{
	ArrayList<Produto> produtos = 
	new ArrayList<>();
	
	produtos.add(new Produto(0, 0, 0, 0));
	produtos.add(new Produto(0, 0, 0, 0));
	produtos.add(new Produto(0, 0, 0, 0));
	produtos.add(new Produto(0, 0, 0, 0));
	produtos.add(new Produto(0, 0, 0, 0));
	 
	
	System.out.println("Produtos cadastrados: ");
	     for (Produto produto : produtos) {
	    	 System.out.printf(" Código : %d | Desconto %.2f | PreçoFinal ")
	     }
	     // professora eu tentei não sei fazer essa questão sobre array obrigado pela oportunidade.
	
}}
