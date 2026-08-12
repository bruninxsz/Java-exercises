public class Ex06 {
    static class Funcionario {
        String nome;
        int salario;

        Funcionario(String nome, int salario){
            this.nome = nome;
            this.salario = salario;
        }
    }

    static class Gerente extends Funcionario { 

        String departamento;

        Gerente(String nome, int salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;
        }
    }

    static class Main {
        public static void main (String[] args){
            Gerente Bruno = new Gerente("Bruno", 15400, "TI");

            System.out.println("Nome: " + Bruno.nome + ", salário: " + Bruno.salario + ", Departamento: " + Bruno.departamento);
        }
    }

}
