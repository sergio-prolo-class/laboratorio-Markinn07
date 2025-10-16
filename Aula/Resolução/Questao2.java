

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, media, presenca; 
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite nota1");
        nota1 = sc.nextDouble();

        System.out.print("Digite nota2");
        nota2 = sc.nextDouble();

        System.out.print("Digite nota3");
        nota3 = sc.nextDouble();

        System.out.print("Digite nota4");
        nota4 = sc.nextDouble();

        System.out.print("Digite a porcentagem de presença do aluno: ");

        presenca = sc.nextDouble();


        media = (nota1 + nota2 + nota3 + nota4) / 4;

        boolean aprovado = media >= 6.0 && presenca >= 75.0;

        System.out.printf("Média: %.2f%n", media);

        System.out.println("Status: " + (aprovado ? "Aprovado" : "Reprovado"));

        sc.close();


    }
}