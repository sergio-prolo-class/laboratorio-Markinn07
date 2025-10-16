

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        double celsius, Fahrenheit;
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite graus fahrenheit (°F): ");
        Fahrenheit = sc.nextDouble();

        celsius = (Fahrenheit - 32 ) / 1.8; 
        

        System.out.printf("Celsius: %.2f%n", celsius);


        sc.close();
 


    }
}
