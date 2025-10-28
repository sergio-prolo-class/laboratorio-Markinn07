import java.util.Scanner;

public class Calendario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mes, primeiroDia, diasNoMes;

        // Entrada do mês com validação
        do {
            System.out.print("Entre com o número do mês (1-12): ");
            mes = input.nextInt();
        } while (mes < 1 || mes > 12);

        // Entrada do primeiro dia da semana com validação
        do {
            System.out.print("Entre com o primeiro dia da semana (1-Dom, 2-Seg, ..., 7-Sab): ");
            primeiroDia = input.nextInt();
        } while (primeiroDia < 1 || primeiroDia > 7);

        // Determina o número de dias no mês usando switch
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasNoMes = 31;
                break;
            case 4: case 6: case 9: case 11:
                diasNoMes = 30;
                break;
            case 2:
                diasNoMes = 28; // ano não bissexto
                break;
            default:
                diasNoMes = 0; // segurança, não usado
        }

        // Imprime cabeçalho do calendário
        System.out.println("\nD S T Q Q S S");

        int diaSemana = 1;

        // Imprime espaços antes do primeiro dia do mês
        for (int i = 1; i < primeiroDia; i++) {
            System.out.print("   "); // 2 caracteres + 1 espaço
            diaSemana++;
        }

        // Imprime os dias do mês
        for (int dia = 1; dia <= diasNoMes; dia++) {
            System.out.printf("%2d ", dia);

            if (diaSemana % 7 == 0) { // quebra de linha a cada sábado
                System.out.println();
            }

            diaSemana++;
        }

        System.out.println(); // pular linha final
        input.close();
    }
}
