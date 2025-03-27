package exercicio2;


public class App {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("Paulo", "Don Quixote", 1566);
        System.out.println("Idade do livro: " + livro1.idadeDoLivro() + " anos.");
        livro1.exibirInformacoes();
        System.out.println(livro1);
    }
}
