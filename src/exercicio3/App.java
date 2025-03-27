package exercicio3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogador[] jogadores = new Jogador[5];

        // Solicitando os dados dos jogadores
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do Jogador " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.println("Digite a pontuação inicial do " + nome + ": ");
            int pontuacao = scanner.nextInt();

            System.out.println("Digite o número de batalhas já realizadas pelo " + nome + ": ");
            int numeroDeBatalhas = scanner.nextInt();

            System.out.println("Digite o nível do " + nome + ": ");
            int nivel = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            jogadores[i] = new Jogador(nome, pontuacao, numeroDeBatalhas, nivel);
        }

        // Exibir os jogadores cadastrados
        System.out.println("\n=== Jogadores Cadastrados ===");
        for (Jogador jogador : jogadores) {
            jogador.exibirJogador();
        }

        // Simulando batalhas
        Jogador vencedor;
        vencedor = batalhar(jogadores[0], jogadores[1]);
        System.out.println("Vencedor da batalha entre " + jogadores[0].getNome() + " e " + jogadores[1].getNome() + ": " + vencedor.getNome());

        vencedor = batalhar(jogadores[2], jogadores[3]);
        System.out.println("Vencedor da batalha entre " + jogadores[2].getNome() + " e " + jogadores[3].getNome() + ": " + vencedor.getNome());

        vencedor = batalhar(jogadores[4], jogadores[0]);
        System.out.println("Vencedor da batalha entre " + jogadores[4].getNome() + " e " + jogadores[0].getNome() + ": " + vencedor.getNome());

        vencedor = batalhar(jogadores[1], jogadores[4]);
        System.out.println("Vencedor da batalha entre " + jogadores[1].getNome() + " e " + jogadores[4].getNome() + ": " + vencedor.getNome());

        vencedor = batalhar(jogadores[2], jogadores[3]);
        System.out.println("Vencedor da batalha entre " + jogadores[2].getNome() + " e " + jogadores[3].getNome() + ": " + vencedor.getNome());

        // Fechando o scanner
        scanner.close();
    }

    public static Jogador batalhar(Jogador jogador1, Jogador jogador2) {
        jogador1.batalhar();
        jogador2.batalhar();

        int resultado = jogador1.compararCom(jogador2);

        if (resultado == 1) {
            return jogador1;
        } else {
            return jogador2;
        }
    }
}
