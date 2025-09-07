package tde_um_estruturas;
// ALUNO: JOAQUIM DOS ANJOS FARACO

public class Pilha {

    private ListaEncadeada pilha;

    public Pilha() {
        this.pilha = new ListaEncadeada();
    }

    public void insereInteiro(int dado) {
        this.pilha.insereUltimo(dado);
    }

    public void removeElemento() {
        this.pilha.removeUltimo();
    }

    public void imprimePilha() {
        System.out.print("\nPilha: ");
        this.pilha.imprimeLista();
    }

}