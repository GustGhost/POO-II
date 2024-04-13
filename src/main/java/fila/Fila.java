package fila;

import java.util.LinkedList;

public class Fila {
    private LinkedList<Integer> fila;

    public Fila() {
        this.fila = new LinkedList<>();
    }

    public void enqueue(Integer item){
        this.fila.add(item);
    }

    public Integer denqueue(){
        if(estaVazia()){
            throw new IllegalArgumentException("A fila está vazia");
        }
        return this.fila.removeFirst();
    }

    public Integer frente(){
        if(estaVazia()){
            throw new IllegalArgumentException("A fila está vazia");
        }
        return this.fila.getFirst();
    }

    public Boolean estaVazia(){
       return this.fila.isEmpty();
    }

}
