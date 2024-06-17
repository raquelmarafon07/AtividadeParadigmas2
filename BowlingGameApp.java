import java.util.Scanner;

public class BowlingGameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        exibirRegras();
        
        while (true) {
            System.out.println("Escolha o modo de jogo:");
            System.out.println("1. Modo Automático");
            System.out.println("2. Modo Manual");
            int escolha = scanner.nextInt();

            boolean modoManual = (escolha == 2);

            BowlingGame jogo = new BowlingGame();
            jogo.jogar(modoManual);

            System.out.printf("  Pontuação final: %d\n", jogo.getPontuacaoFinal());
            System.out.println("\n  Obrigado por jogar!");

            System.out.println("Deseja jogar novamente? (s/n)");
            char resposta = scanner.next().charAt(0);
            if (resposta != 's' && resposta != 'S') {
                break;
            }
        }

        scanner.close();
    }

    private static void exibirRegras() {
        System.out.println("=============================================================================");
        System.out.println("|                     Regras do Jogo de Boliche                              |");
        System.out.println("=============================================================================");
        System.out.println("| - O objetivo é derrubar o maior número possível de pinos com uma bola em   |");
        System.out.println("|   cada lance, em um total de 10 lances por jogo.                           |");
        System.out.println("| - Pinos: Há 10 pinos dispostos em uma formação triangular na extremidade  |");
        System.out.println("|   oposta da pista de boliche.                                              |");
        System.out.println("| - Lances: Cada jogador tem a oportunidade de fazer dois lances por frame   |");
        System.out.println("|   (exceto em strikes e spares, que têm regras especiais).                   |");
        System.out.println("| - Strike: Se o jogador derrubar todos os 10 pinos com o primeiro lance, é  |");
        System.out.println("|   chamado de 'strike'. Nesse caso, não há segundo lance no frame atual e a  |");
        System.out.println("|   pontuação do próximo frame é adicionada ao strike.                        |");
        System.out.println("| - Spare: Se o jogador derrubar todos os 10 pinos com os dois lances de um   |");
        System.out.println("|   frame, é chamado de 'spare'. Nesse caso, a pontuação do próximo lance é  |");
        System.out.println("|   adicionada ao spare.                                                      |");
        System.out.println("| - Pontuação: A pontuação de cada lance é igual ao número de pinos          |");
        System.out.println("|   derrubados. A pontuação total de um frame é a soma dos pinos derrubados  |");
        System.out.println("|   nos dois lances, com bônus adicionais para strikes e spares.             |");
        System.out.println("| - Pontuação de Strike: Se o jogador faz um strike, a pontuação do próximo  |");
        System.out.println("|   frame (os próximos dois lances) é adicionada ao strike.                   |");
        System.out.println("| - Pontuação de Spare: Se o jogador faz um spare, a pontuação do próximo    |");
        System.out.println("|   lance (o primeiro lance do próximo frame) é adicionada ao spare.          |");
        System.out.println("| - Pontuação Máxima: A pontuação máxima em um jogo de boliche é de 300      |");
        System.out.println("|   pontos, que seria obtida com 12 strikes seguidos (cada strike recebe a   |");
        System.out.println("|   pontuação máxima de 30 pontos).                                           |");
        System.out.println("=============================================================================\n");
    }
}
