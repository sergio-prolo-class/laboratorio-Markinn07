import java.util.Scanner;

public class Lista7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Entre com o número de linhas: ");
        int n = input.nextInt();

        int num = 1; // contador inicial
        
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d > ", i); // número da linha e sinal ">"
            
            for (int j = 1; j < i; j++) { // note: começa de j=1 até j<i
                System.out.printf("%d ", num);
                num++;
            }
            System.out.println(); // quebra de linha
        }

        input.close();
    }
}
