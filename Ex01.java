public class Ex01 {

    static class Cachorro {
        String nome;
        String raca;

        void Latir(){
            System.out.println("Au Au!");
        }
    }

    static class Main {
        public static void main(String[] args) {

            Cachorro dog1 = new Cachorro();
            dog1.nome = "Paçoca";
            dog1.raca = "Salsicha";

            dog1.Latir();
        }

    }
}