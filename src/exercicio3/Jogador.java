package exercicio3;

public class Jogador {
    private String nome;
    private int pontuacao, numeroDeBatalhas, nivel;

    public Jogador(String nome, int pontuacao, int numeroDeBatalhas, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.numeroDeBatalhas = 0;
        this.nivel = 0;
    }
    public void atualizarPontuacaoDeVitoria(int pontos){
        this.pontuacao = pontos;
    }

    public void subirNivel(){
        this.nivel++;
    }

    public void exibirJogador(){
        System.out.println(nome);
        System.out.println(pontuacao);
        System.out.println(numeroDeBatalhas);
        System.out.println(nivel);
    }

    public void batalhar(){
        this.numeroDeBatalhas++;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPontuacao() {
        return pontuacao;
    }
    public void setPontuação(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    public int getNumeroDeBatalhas() {
        return numeroDeBatalhas;
    }
    public void setNumeroDeBatalhas(int numeroDeBatalhas) {
        this.numeroDeBatalhas = numeroDeBatalhas;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int compararCom(Jogador outroJogador){
        if(this.nivel > outroJogador.getNivel()){
            return 1;
        } else if(this.nivel < outroJogador.getNivel()){
            return -1;
        } else {
            if (this.numeroDeBatalhas > outroJogador.getNumeroDeBatalhas()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    @Override
    public String toString() {
        return "Jogador [nome=" + nome + ", pontuação=" + pontuacao + ", númeroDeBatalhas=" + numeroDeBatalhas
                + ", nivel=" + nivel + "]";
    }
}
