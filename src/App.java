import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Livro livro1 = new Livro();
        System.out.println("insira o nome do criador: ");
        String nome = scanner.nextLine();
        System.out.println("insira o nome do livro: ");
        String titulo = scanner.nextLine();
        System.out.println("ano de publicacao: ");
        int anoDePublicacao = scanner.nextInt();

        livro1.setNome(nome);
        livro1.setTitulo(titulo);
        livro1.setAnoDePublicacao(anoDePublicacao);

        System.out.println("livro: " +livro1.getTitulo());
        System.out.println("autor: " +livro1.getNome());
        System.out.println("publicacao: " +livro1.getAnoDePublicacao());
    }
}
