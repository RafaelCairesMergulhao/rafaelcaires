package pacote;

import java.util.LinkedList;

public class Pilha {
    private LinkedList<Object> elementos;

 
    public Pilha() {
        this.elementos = new LinkedList<>();
    }


    public boolean estaVazia() {
        return elementos.isEmpty();
    }


    public void empilhar(Object valor) {
        elementos.addLast(valor); 
    }

    
    public Object desempilhar() {
        if (estaVazia()) {
            return null; 
        }
        return elementos.removeLast();
    }

  
    public int tamanho() {
        return elementos.size(); 
    }

  
    public Object topo() {
        if (estaVazia()) {
            return null; 
        }
        return elementos.getLast(); 
    }
}