package tde_um_estruturas;

public class MergeEncadeado {

    private Fila filaUm;
    private Fila filaDois;
    private Fila filaMerge;

    public MergeEncadeado(Fila filaUm, Fila filaDois) {
        this.filaUm = filaUm;
        this.filaDois = filaDois;
    }

    public Fila merge() {
        this.filaMerge = new Fila();

        while (!this.filaUm.estaVazia() && !this.filaDois.estaVazia()) {

            int atualUm = this.filaUm.lerPrimeiro();
            int atualDois = this.filaDois.lerPrimeiro();

            if (atualUm <= atualDois) {
                this.filaMerge.insereInteiro(atualUm);
                this.filaMerge.insereInteiro(atualDois);
            } else {
                this.filaMerge.insereInteiro(atualDois);
                this.filaMerge.insereInteiro(atualUm);
            }

            this.filaUm.removeElemento();
            this.filaDois.removeElemento();

        }

        if (!this.filaUm.estaVazia()) {

            while (!this.filaUm.estaVazia()) {
                int atual = this.filaUm.lerPrimeiro();
                this.filaMerge.insereInteiro(atual);
                this.filaUm.removeElemento();
            }

        }   else if (!this.filaDois.estaVazia()) {
            while (!this.filaDois.estaVazia()) {
                int atual = this.filaDois.lerPrimeiro();
                this.filaMerge.insereInteiro(atual);
                this.filaDois.removeElemento();
            }
        }

        return this.filaMerge;
    }

}