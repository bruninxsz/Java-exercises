
public class Ex02 {

    static class Aluno {

        String nome;
        String curso;
        int idade;

        void apresentar() {
            System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e estudo " + curso + "!");
        }
    }

    static class Main {

        public static void main(String[] args) {

          Aluno Bruno = new Aluno();
          Bruno.nome = "Bruno Henrique da Silva Pereira";
          Bruno.curso = "Análise e Desenvolvimento de Sistemas";
          Bruno.idade = 18;

          Bruno.apresentar();
        }
    }
}
