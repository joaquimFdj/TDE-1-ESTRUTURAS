package tde_um_estruturas;
// ALUNO: JOAQUIM DOS ANJOS FARACO

public class Fila {
    
    private ListaEncadeada fila;

    public Fila() {
        this.fila = new ListaEncadeada();
    }

    public void insereInteiro(int dado) {
        this.fila.insereUltimo(dado);
    }

    public void removeElemento() {
        this.fila.removePrimeiro();
    }

    public void imprimeFila() {
        System.out.print("\nFila: ");
        this.fila.imprimeLista();
    }

    public int lerPrimeiro() {
        return this.fila.lerPrimeiro();
    }

    public boolean estaVazia() {
        return this.fila.vazia();
    }

    // ##### PARA A IMPLEMENTAÇÃO COM VETOR ###
    public int tamanhoFila() {
        return this.fila.tamanhoLista();
    }

    public int lerPorIndice(int indice) {
        return this.fila.lerPorIndice(indice);
    }
    //###########################################
}