public class Ex05 {
    static class Animal {
    String nome;

    Animal(String nome) {
        this.nome = nome;
    }

    void comer() {
        System.out.println(nome + " está comendo!");
    }
}

static class Gato extends Animal {

    Gato(String nome) {
        super(nome);
    }

    void miar() {
        System.out.println(nome + " está miando: Miau!");
    }
}

static class Main {
    public static void main(String[] args) {

        Gato gato = new Gato("Mingau");

        gato.comer();
        gato.miar();
    }
}
}
