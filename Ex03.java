public class Ex03{

static class Filme {

    String titulo;
    int anoLancamento;

public Filme(String titulo, int anoLancamento) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
}
}

static class Main {
    
    public static void main(String[] args) {

        Filme filme1 = new Filme("Matrix", 1999);
        System.out.println("Filme: " + filme1.titulo + ", Ano de Lançamento: " + filme1.anoLancamento);
}
}

}