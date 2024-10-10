package pacote;

import java.util.LinkedList;

public class Fila {
    private LinkedList<Object> elementos;

   
    public Fila() {
        this.elementos = new LinkedList<>();
    }

    
    public boolean estaVazia() {
        return elementos.isEmpty();
    }

    
    public void inserir(Object valor) {
        elementos.addLast(valor); 
    }

    
    public Object remover() {
        if (estaVazia()) {
            return null;
        }
        return elementos.removeFirst(); 
    }

   
    public int tamanho() {
        return elementos.size();
    }

  
    public Object primeiro() {
        if (estaVazia()) {
            return null;
        }
        return elementos.getFirst(); 
    }
}