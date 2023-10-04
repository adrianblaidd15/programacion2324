package Boletin1_1Java;

import java.util.Scanner;

public class ejerccio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int conta;
        int suma = 0;
        do {
            System.out.println("Dame una cantidad de números");
            conta = scan.nextInt();
        } while (conta <= 0);

        for (int i = 1; i <= conta; i++) {
            System.out.println("Dame los siguientes números");
            int num2 = scan.nextInt();
            suma += num2;
        }
        System.out.println("La media te sale " + (double) suma / conta);

    }
}
