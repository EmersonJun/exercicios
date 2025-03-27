package exercicio2;



import java.time.LocalDate;

public class Livro {
    private String nome, titulo;
    private int anoDePublicacao;

    public Livro() {
        this.nome = nome;
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
    }

    public void exibirInformacoes(){
        System.out.println(nome);
        System.out.println(titulo);
        System.out.println(anoDePublicacao);
    }

    public int idadeDoLivro(){
        int anoAtual = LocalDate.now().getYear();  
        return anoAtual - anoDePublicacao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }
    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }
    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", titulo=" + titulo + ", anoDePublicacao=" + anoDePublicacao + "]";
    }
    

    
}
