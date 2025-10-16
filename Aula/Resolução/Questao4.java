import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        boolean bissexto = (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0);

        // Mostra o resultado
        System.out.println("O ano " + ano + " é " + (bissexto ? "bissexto" : "não bissexto"));

        sc.close();
    }
}
