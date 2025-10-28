import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        final int SENHA_CORRETA = 314159;
        final int MAX_TENTATIVAS = 3;

        Scanner input = new Scanner(System.in);
        
        int tentativas = 0;
        boolean acessoAutorizado = false;
        int senha;

        while (tentativas < MAX_TENTATIVAS && !acessoAutorizado) {
            System.out.print("Entre com a senha: ");
            senha = input.nextInt();
            
            if (senha == SENHA_CORRETA) {
                System.out.println("Acesso autorizado");
                acessoAutorizado = true;
            } else {
                System.out.println("Acesso negado (senha incorreta)");
                tentativas++;
            }
        }

        if (!acessoAutorizado && tentativas == MAX_TENTATIVAS) {
            System.out.println("Sistema bloqueado");
        }

        input.close();
    }
}
