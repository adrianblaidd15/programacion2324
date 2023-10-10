package Boletin1_1Java;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int sum = 0;

        do {
            System.out.println("Dame un número positvio");
            num = scan.nextInt();
        } while (num <= 0);

        for (int i = 1; i <= num; i++ ){
            sum += i;
        }
        scan.close();
        System.out.printf("La suma te da " + sum);
    }
}
