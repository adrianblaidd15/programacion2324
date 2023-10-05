package Boletin1_2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame una temperatura en grados Celsius");
        double cel = Double.parseDouble(sc.nextLine());
        sc.close();

        double fahren = (cel * 9 / 5) + 32;
        System.out.printf("%.2f grados celsius son %.2f grados Fahrenheit", cel, fahren);


    }
}
