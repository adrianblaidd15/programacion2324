package Boletin1_1Java;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            System.out.println("Escribe un número entre el 0 y el 10");
            num = scan.nextInt();
        } while (num <= 0 || num >= 10 );

        for (int i =0;i<=10;i++){
            System.out.printf("%2d * %2d = %3d\n", num, i, num * i);
        }
    }
}
