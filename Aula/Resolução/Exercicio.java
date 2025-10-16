package aula;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        double peso, altura, imc; 
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        peso = sc.nextDouble();
        System.out.print("Digite sua altura em metros (m): ");
        altura = sc.nextDouble();
        

        imc =  peso / (altura * altura);
        

        System.out.printf( "imc: %.2f", imc); 

        sc.close();


    }
}