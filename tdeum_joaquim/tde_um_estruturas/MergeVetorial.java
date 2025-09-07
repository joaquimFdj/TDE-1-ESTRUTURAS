package tde_um_estruturas;
// ALUNO: JOAQUIM DOS ANJOS FARACO
public class MergeVetorial {

    private Fila filaUm; 
    private Fila filaDois;
    private int tamanhoFilaUm;
    private int tamanhoFilaDois;
    private int[] vetorOrdenados;

    public MergeVetorial(Fila filaUm, Fila filaDois) {
        this.filaUm = filaUm;
        this.filaDois = filaDois;

        this.tamanhoFilaUm = filaUm.tamanhoFila();
        this.tamanhoFilaDois = filaDois.tamanhoFila();
    }

    public int[] merge() {
        this.vetorOrdenados = new int[this.tamanhoFilaUm + this.tamanhoFilaDois];

        int i = 0;
        int j = 0;
        while (i < this.tamanhoFilaUm && i < this.tamanhoFilaDois) {
            int valorUm = this.filaUm.lerPorIndice(i);
            int valorDois = this.filaDois.lerPorIndice(i);

            if (valorUm <= valorDois) {
                this.vetorOrdenados[j] = valorUm;
                this.vetorOrdenados[j+1] = valorDois;
                j += 2;
            } else {
                this.vetorOrdenados[j] = valorDois;
                this.vetorOrdenados[j+1] = valorUm;
                j += 2;
            }

            i ++;
        }

        if (i < (this.tamanhoFilaUm)) {
            while (i < this.tamanhoFilaUm) {
                this.vetorOrdenados[j] = this.filaUm.lerPorIndice(i);
                i++;
                j++;
            }
        } else if (i < (this.tamanhoFilaDois)) {
            while (i < this.tamanhoFilaDois) {
                this.vetorOrdenados[j] = this.filaDois.lerPorIndice(i);
                i++;
                j++;
            }
        }

        return this.vetorOrdenados;
    }

}