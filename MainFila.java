package pacote;

public class MainFila {
    public static void main(String[] args) {
        Fila fila = new Fila(); 
       
        System.out.println("Inserindo elementos na fila...");
        fila.inserir("Elemento 1");
        fila.inserir("Elemento 2");
        fila.inserir("Elemento 3");

       
        System.out.println("Tamanho da fila: " + fila.tamanho()); 
        System.out.println("Primeiro elemento da fila: " + fila.primeiro()); 

      
        System.out.println("Removendo: " + fila.remover()); 
        System.out.println("Tamanho da fila após remover: " + fila.tamanho()); 
        System.out.println("Novo primeiro elemento da fila: " + fila.primeiro()); 

       
        System.out.println("Removendo todos os elementos da fila...");
        while (!fila.estaVazia()) {
            System.out.println("Removendo: " + fila.remover());
        }

       
        System.out.println("A fila está vazia? " + fila.estaVazia()); // true
    }
}