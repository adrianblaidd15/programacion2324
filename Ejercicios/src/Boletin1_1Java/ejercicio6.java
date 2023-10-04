package Boletin1_1Java;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Dame los dos números que quieras multipliclar");
        int numA = scan.nextInt();
        int numB = scan.nextInt();

        if (numB > numA) {
            //Intercambio de variables
            int numC = numB;
            numB = numA;
            numA = numC;
        }

        int result = 0;
        for (int i = 0; i <= numB; i++) {
            result += numA;
        }
        System.out.println("El resultado es " + result);


    }
}
