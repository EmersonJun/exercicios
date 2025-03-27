public class App {
        public static void main(String[] args) {
            Jogador jogador1 = new Jogador("joao", 1, 3, 9);
            Jogador jogador2 = new Jogador("paulo", 3, 2, 1);
            Jogador jogador3 = new Jogador("carlos", 3, 4, 7);
            Jogador jogador4 = new Jogador("ivone", 2, 9, 1);
            Jogador jogador5 = new Jogador("messi", 2, 3, 2);
    
            Jogador vencedor = batalhar(jogador1, jogador2);
            System.out.println("Vencedor da batalha entre " + jogador1.getNome() + " e " + jogador2.getNome() + ": " + vencedor.getNome());
            
            vencedor = batalhar(jogador3, jogador4);
            System.out.println("Vencedor da batalha entre " + jogador3.getNome() + " e " + jogador4.getNome() + ": " + vencedor.getNome());
            
            vencedor = batalhar(jogador5, jogador1);
            System.out.println("Vencedor da batalha entre " + jogador5.getNome() + " e " + jogador1.getNome() + ": " + vencedor.getNome());
            
            vencedor = batalhar(jogador2, jogador5);
            System.out.println("Vencedor da batalha entre " + jogador2.getNome() + " e " + jogador5.getNome() + ": " + vencedor.getNome());
            
            vencedor = batalhar(jogador3, jogador4);
            System.out.println("Vencedor da batalha entre " + jogador3.getNome() + " e " + jogador4.getNome() + ": " + vencedor.getNome());
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
