public class Ex04 {
  static class Carro{
    String marca;
    String modelo;
    int velocidade = 0;

    public Carro(String marca, String modelo){
      this.marca = marca;
      this.modelo = modelo;
    }

    void acelerar(){
      System.out.println("O carro está acelerando!");
      while(velocidade < 200){
        velocidade += 20;
        System.out.println("Velocidade: " + velocidade);
      }
         
  }
}

static class Main { 
  
  public static void main(String[] args) {
    Carro carro1 = new Carro("Chevrolet", "Onix");
    System.out.println("Marca: " + carro1.marca + ", Modelo: " + carro1.modelo);
    carro1.acelerar();
  }
}
}
