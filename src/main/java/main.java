import arvoreBinaria.ArvoreBinaria;
import fila.Fila;
import pilha.Pilha;

public class main {
    public static void main(String[] args) {
        Pilha Pilha = new Pilha();
        Fila Fila = new Fila();
        ArvoreBinaria arvore = new ArvoreBinaria();


//region PILHA

        Pilha.push(1);
        Pilha.push(3);
        Pilha.push(5);

        System.out.println("Elemento do topo da pilha:");
        System.out.println(Pilha.topo());
        System.out.println("Removendo o elemento do topo da pilha:");
        System.out.println(Pilha.pop());
        System.out.println("Elemento do topo da pilha:");
        System.out.println(Pilha.topo());
        System.out.println("A pilha está vazia?");
        System.out.println(Pilha.estaVazia() + "\n\n");

//endregion

//region FILA

        Fila.enqueue(2);
        Fila.enqueue(4);
        Fila.enqueue(6);
        System.out.println("Elemento da frente da fila:");
        System.out.println(Fila.frente());
        System.out.println("Removendo o elemento da frente da fila:");
        System.out.println(Fila.denqueue());
        System.out.println("Elemento da frente da fila:");
        System.out.println(Fila.frente());
        System.out.println("A fila está vazia?");
        System.out.println(Fila.estaVazia() + "\n\n");

//endregion

//region Árvore Binária

        arvore.inserir(5);
        arvore.inserir(3);
        arvore.inserir(7);
        arvore.inserir(2);
        arvore.inserir(4);
        arvore.inserir(6);
        arvore.inserir(8);

        System.out.println("Percurso em ordem:");
        arvore.percursoEmOrdem();
        System.out.println("\nPercurso pré ordem:");
        arvore.percursoPreOrdem();
        System.out.println("\nPercurso pós ordem:");
        arvore.percursoPosOrdem();
//endregion
    }
}
