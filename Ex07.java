public class Ex07 {
    static class Animal {

        void fazerSom() {
            System.out.println("Som genérico");
        }
    }

    static class Cachorro extends Animal {

        @Override
        void fazerSom() {
            System.out.println("Au Au");
        }
    }

    static class Vaca extends Animal {

        @Override
        void fazerSom() {
            System.out.println("Muuu");
        }
    }

    static class Main {

        public static void main(String[] args) {

            Cachorro cachorro = new Cachorro();
            Vaca vaca = new Vaca();

            cachorro.fazerSom();
            vaca.fazerSom();
        }
    }
}
