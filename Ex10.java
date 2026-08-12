public class Ex10 {
    static class Produto {
        String nome;
        double preco;

        Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        void exibirDetalhes() {
            System.out.println("Nome: " + nome);
            System.out.println("Preço: R$ " + preco);
        }
    }

    static class Eletronico extends Produto {
        int voltagem;

        Eletronico(String nome, double preco, int voltagem) {
            super(nome, preco);
            this.voltagem = voltagem;
        }

        @Override
        void exibirDetalhes() {
            System.out.println("Eletrônico:");
            System.out.println("Nome: " + nome);
            System.out.println("Preço: R$ " + preco);
            System.out.println("Voltagem: " + voltagem + "V");
        }
    }

    static class Roupa extends Produto {
        String tamanho;

        Roupa(String nome, double preco, String tamanho) {
            super(nome, preco);
            this.tamanho = tamanho;
        }

        @Override
        void exibirDetalhes() {
            System.out.println("Roupa:");
            System.out.println("Nome: " + nome);
            System.out.println("Preço: R$ " + preco);
            System.out.println("Tamanho: " + tamanho);
        }
    }

static class Main {
    public static void main(String[] args) {

        Eletronico celular = new Eletronico(
            "Celular",
            1500.00,
            220
        );

        Roupa camiseta = new Roupa(
            "Camiseta",
            59.90,
            "M"
        );

        celular.exibirDetalhes();

        System.out.println();

        camiseta.exibirDetalhes();
    }
}
}
