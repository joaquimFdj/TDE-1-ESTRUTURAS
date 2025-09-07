package tde_um_estruturas;
// ALUNO: JOAQUIM DOS ANJOS FARACO

public class Main {

    public static void main(String[] args) {

        // ########## TESTES: ############

        Pilha pilha_teste = new Pilha();
        Fila fila_teste = new Fila();

        pilha_teste.imprimePilha();
        fila_teste.imprimeFila();

        pilha_teste.insereInteiro(457);
        pilha_teste.insereInteiro(665);
        pilha_teste.imprimePilha();

        fila_teste.insereInteiro(554);
        fila_teste.insereInteiro(11);
        fila_teste.imprimeFila();

        pilha_teste.removeElemento();
        pilha_teste.imprimePilha();

        fila_teste.removeElemento();
        fila_teste.imprimeFila();

        System.out.println("\n#########################");
        Fila fila_merge_um = new Fila();
        Fila fila_merge_dois = new Fila();

        fila_merge_um.insereInteiro(0);
        fila_merge_um.insereInteiro(4);
        fila_merge_um.insereInteiro(134);
        System.out.println("\n\nPrimeira fila para merge vetorial: "); fila_merge_um.imprimeFila();

        fila_merge_dois.insereInteiro(2);
        fila_merge_dois.insereInteiro(3);
        System.out.println("\n\nSegunda fila para merge vetorial: "); fila_merge_dois.imprimeFila();

        MergeVetorial mergeador = new MergeVetorial(fila_merge_um, fila_merge_dois);
        int[] vetorMergeado = mergeador.merge();
        System.out.println();
        for (int valor : vetorMergeado) {
            System.out.print(valor + " ");
        }

        System.out.println("\n#########################");
        System.out.println("\n\nPrimeira fila para merge encadeado: "); fila_merge_um.imprimeFila();
        System.out.println("\n\nSegunda fila para merge encadeado: "); fila_merge_dois.imprimeFila();

        MergeEncadeado mergeadorEncadeado = new MergeEncadeado(fila_merge_um, fila_merge_dois);
        Fila filaMergeada = mergeadorEncadeado.merge();
        filaMergeada.imprimeFila();

        // ##############################
    }

}

// javac -d bin tde_um_estruturas\*.java
// java -cp bin tde_um_estruturas.Main