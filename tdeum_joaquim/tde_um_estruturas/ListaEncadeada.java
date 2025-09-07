package tde_um_estruturas;
// ALUNO: JOAQUIM DOS ANJOS FARACO

public class ListaEncadeada {

    private Node primeiro;

    public ListaEncadeada () {
        this.primeiro = null;
    }

    public boolean vazia() {
        return this.primeiro == null;
    }

    public void inserePrimeiro(int valor) {
        this.primeiro = new Node(valor, this.primeiro);
    }

    public void insereDepois(Node depoisDesse, int valor) {
        Node novoNode = new Node(valor, depoisDesse.getProximo());
        depoisDesse.setProximo(novoNode);
    }

    public void insereUltimo(int valor) {
        if (!vazia()) {
            Node ultimo = this.primeiro;
            while (ultimo.getProximo() != null) {
                ultimo = ultimo.getProximo();
            }
            Node novoNode = new Node(valor);
            ultimo.setProximo(novoNode);
        } else if (vazia()) {
            this.primeiro = new Node(valor);
        }
    }

    public int lerPrimeiro() {
        if (vazia()) {throw new IllegalStateException("Lista vazia: ");}
        return this.primeiro.getDado();
    }

    public int lerPorIndice(int indice) {
        if (vazia()) {throw new IllegalStateException("Lista vazia: ");}

        Node atual = this.primeiro;
        int contador = 0;
        while (contador < indice) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
                contador++;
            } else {throw new IndexOutOfBoundsException("Indice "+ indice + " invalido");}
        }

        return atual.getDado();
    }

    public int tamanhoLista() {
        if (vazia()) {return 0;}

        int tamanho = 0;
        Node atual = this.primeiro;

        while (atual != null) {
            tamanho += 1;
            atual = atual.getProximo();
        }

        return tamanho;
    }

    public void imprimeLista() {
        if (!vazia()) {
            Node ultimo = this.primeiro;

            System.out.println();
            while (ultimo != null) {
                System.out.print(ultimo.getDado() + " ");
                ultimo = ultimo.getProximo();
            }
        } else {
            System.out.println("Vazia.");
        }   
    }

    public Node removePrimeiro() {
        if (!vazia()) {
            Node aux = this.primeiro;
            this.primeiro = this.primeiro.getProximo();
            aux.setProximo(null);
            return aux;
        } else {
            System.out.println("Lista esta vazia");
            return null;
        }
    }

    public Node removeUltimo() {
        if (!vazia()) {
            if (this.primeiro.getProximo() != null) {

                Node penultimo = this.primeiro;
                Node ultimo = this.primeiro;
                while (ultimo.getProximo() != null) {
                    penultimo = ultimo;
                    ultimo = ultimo.getProximo();
                }

                penultimo.setProximo(null);
                return ultimo;
            } else {
                Node aux = this.primeiro;
                this.primeiro = null;
                return aux;
            }

        }
        else {
            System.out.println("Lista esta vazia");
            return null;
        }
    }

    public Node remove(Node node) {
        if (vazia()) {
            System.out.println("lista vazia.");
            return null;
        }

        if (this.primeiro.getProximo() != null) {
            if (this.primeiro == node) {
                Node aux = this.primeiro;
                this.primeiro = this.primeiro.getProximo();
                aux.setProximo(null);
                return aux;
            } else {
                Node anterior = this.primeiro;
                while (anterior.getProximo() != node && anterior.getProximo() != null) {
                    anterior = anterior.getProximo();
                }

                if (anterior.getProximo() == null) {
                    System.out.println("Elemento nao esta na lista");
                    return null;
                }

                Node aux = anterior.getProximo();
                anterior.setProximo(aux.getProximo());
                aux.setProximo(null);
                return aux;
            }
        }
        else {
            if (this.primeiro == node) {
                Node aux = this.primeiro;
                this.primeiro = null;
                aux.setProximo(null);
                return aux;
            } else {
                System.out.println("Elemento nao esta na lista.");
                return null;
            }
        }
    }  

    private static class Node {
        private int dado;
        private Node proximo;

        public Node() {
            this.proximo = null;
        }

        public Node(int dado) {
            this.dado = dado;
            this.proximo = null;
        }

        public Node(int dado, Node proximo) {
            this.proximo = proximo;
            this.dado = dado;
        }

        public Node getProximo() {
            return this.proximo;
        }

        public void setProximo(Node proximo) {
            this.proximo = proximo;
        }

        public int getDado() {
            return this.dado;
        }

        public void setDado(int dado) {
            this.dado = dado;
        }

    }
    
}