package arvoreBinaria;

public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esquerdo = inserirRecursivo(no.esquerdo, valor);
        } else if (valor > no.valor) {
            no.direito = inserirRecursivo(no.direito, valor);
        }

        return no;
    }

    public void percursoEmOrdem() {
        percursoEmOrdemRecursivo(raiz);
    }

    private void percursoEmOrdemRecursivo(No no) {
        if (no != null) {
            percursoEmOrdemRecursivo(no.esquerdo);
            System.out.print(no.valor + " ");
            percursoEmOrdemRecursivo(no.direito);
        }
    }

    public void percursoPreOrdem() {
        percursoPreOrdemRecursivo(raiz);
    }

    private void percursoPreOrdemRecursivo(No no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            percursoPreOrdemRecursivo(no.esquerdo);
            percursoPreOrdemRecursivo(no.direito);
        }
    }

    public void percursoPosOrdem() {
        percursoPosOrdemRecursivo(raiz);
    }

    private void percursoPosOrdemRecursivo(No no) {
        if (no != null) {
            percursoPosOrdemRecursivo(no.esquerdo);
            percursoPosOrdemRecursivo(no.direito);
            System.out.print(no.valor + " ");
        }
    }
}
