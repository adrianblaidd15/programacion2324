package Boletin1_2;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;

        System.out.println("Dame las calificaciones de tres examenes");
        for (int i = 1; i <= 3; i++) {
            result += sc.nextDouble();
        }
        System.out.printf("Tú media es de %.2f", result / 3);
    }
}
