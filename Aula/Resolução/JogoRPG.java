import java.util.Scanner;

public class JogoRPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com a classe (1-arqueiro, 2-bárbaro, 3-druida, 4-mago): ");
        int codigoClasse = input.nextInt();

        int vidaInicial;
        int incremento;

        // Define a vitalidade inicial e incremento usando switch
        switch (codigoClasse) {
            case 1: // Arqueiro
                vidaInicial = 150;
                incremento = 10;
                break;
            case 2: // Bárbaro
                vidaInicial = 200;
                incremento = 15;
                break;
            case 3: // Druida
                vidaInicial = 100;
                incremento = 5;
                break;
            case 4: // Mago
                vidaInicial = 80;
                incremento = 4;
                break;
            default:
                System.out.println("Classe inválida");
                input.close();
                return; // encerra o programa
        }

        System.out.print("Entre com a vitalidade desejada: ");
        int vitalidadeDesejada = input.nextInt();

        int nivel = 0;
        int vitalidade = vidaInicial;

        // Loop para calcular o nível mínimo
        while (vitalidade < vitalidadeDesejada) {
            nivel++;
            // Verifica se o nível é múltiplo de 5 para aplicar bônus
            int bonus = (nivel % 5 == 0) ? 2 : 1;
            vitalidade += incremento * bonus;
        }

        System.out.println("Nível necessário: " + nivel);

        input.close();
    }
}
