package pacote;

public class MainPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(); 

       
        System.out.println("Empilhando elementos...");
        pilha.empilhar("Elemento 1");
        pilha.empilhar("Elemento 2");
        pilha.empilhar("Elemento 3");

        
        System.out.println("Tamanho da pilha: " + pilha.tamanho()); 
        System.out.println("Topo da pilha: " + pilha.topo()); 

       
        System.out.println("Desempilhando: " + pilha.desempilhar()); 
        System.out.println("Tamanho da pilha após desempilhar: " + pilha.tamanho()); 
        System.out.println("Novo topo da pilha: " + pilha.topo()); 
       
        System.out.println("Desempilhando todos os elementos...");
        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando: " + pilha.desempilhar());
        }       
        System.out.println("A pilha está vazia? " + pilha.estaVazia());
    }
}