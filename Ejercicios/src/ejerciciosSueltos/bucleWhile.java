package ejerciciosSueltos;

import java.util.Scanner;

public class bucleWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int num2 = 2;

        System.out.println("Dime un número");
        num = sc.nextInt();

        while (num % num2 != 0) {
            num++;
        }
        System.out.println(num2);
    }
}
