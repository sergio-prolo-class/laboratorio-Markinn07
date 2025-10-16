import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite o valor em centavos: ");
        int valor = sc.nextInt();

        int moedas; 

        
        moedas = valor / 50;
        System.out.println("50 centavos: " + moedas);
        valor %= 50;

        
        moedas = valor / 25;
        System.out.println("25 centavos: " + moedas);
        valor %= 25;

        moedas = valor / 10;
        System.out.println("10 centavos: " + moedas);
        valor %= 10;

        
        moedas = valor / 5;
        System.out.println("5 centavos: " + moedas);
        valor %= 5;

        moedas = valor;
        System.out.println("1 centavo: " + moedas);

        sc.close();
    }
}
