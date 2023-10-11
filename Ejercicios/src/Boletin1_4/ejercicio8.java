package Boletin1_4;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1, h2, m1, m2, s1, s2;
        do {
            System.out.print("Introduce las horas del primer marcador: ");
            h1 = sc.nextInt();
            System.out.print("Introduce los minutos del primer marcador: ");
            m1 = sc.nextInt();
            System.out.print("Introduce los segundos del primer marcador: ");
            s1 = sc.nextInt();
        } while (h1 < 0 || h1 > 23 || m1 < 0 || m1 > 59 || s1 < 0 || s1 > 59);

        do {
            System.out.print("Introduce las horas del segundo marcador: ");
            h2 = sc.nextInt();
            System.out.print("Introduce los minutos del segundo marcador: ");
            m2 = sc.nextInt();
            System.out.print("Introduce los segundos del segundo marcador: ");
            s2 = sc.nextInt();
        } while (h2 < 0 || h2 > 23 || m2 < 0 || m2 > 59 || s2 < 0 || s2 > 59);


    }
}
