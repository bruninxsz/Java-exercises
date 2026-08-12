public class Ex08 {
    static class Forma {
        void Desenhar(){
            System.out.println("Desenhando...");
        }
    }

    static class Circulo extends Forma {
        @Override
        void Desenhar(){
            System.out.println("Desenhando um círculo...");
        }
    }

    static class Quadrado extends Forma {
        @Override
        void Desenhar(){
            System.out.println("Desenhando um quadrado...");
        }
    }

    static class Main {
        public static void main(String[] args) {
            Quadrado quadrado = new Quadrado();
            Circulo circulo = new Circulo();

            quadrado.Desenhar();
            circulo.Desenhar();
        }
    }
}
