package Boletin1_1Java;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cant;
        int num;

        System.out.println("Escribe la cantidad de números que querias introducir");
        cant = scan.nextInt();

        while (cant < 0) {
            System.out.println("La cantidad debe ser positva");
            cant = scan.nextInt();
        }
        System.out.println("Dime los numeros");
        for (int i = 1; i <= cant; i++) {

            num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.printf("%1d es par\n", num);
            } else {
                System.out.printf("%1d es impar\n", num);
            }
        }
        scan.close();
    }
}
