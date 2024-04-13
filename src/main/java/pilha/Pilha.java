package pilha;

import java.util.ArrayList;

public class Pilha {
    private ArrayList<Integer> arrayList;

    public Pilha() {
        this.arrayList = new ArrayList<>();
    }

    public void push(Integer item){
        this.arrayList.add(item);
    }

    public Integer pop() {
        if(estaVazia()){
            throw new IllegalArgumentException("A pilha está vazia");
        }
        return this.arrayList.remove(arrayList.size() -1);
    }

    public Integer topo(){
        if(estaVazia()){
            throw new IllegalArgumentException("A pilha está vazia");
        }
        return this.arrayList.get(arrayList.size()-1);
    }

    public Boolean estaVazia(){
        return this.arrayList.isEmpty();
    }

}
