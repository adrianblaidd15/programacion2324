package Boletin1_2;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km, vel;
        int h, s, m;

        System.out.print("Dame la distancia del sitio al que quieras llegar: ");
        km = Double.parseDouble(sc.nextLine());
        System.out.print("Dame la velocidad a la que vas a ir: ");
        vel = Double.parseDouble(sc.nextLine());
        double tiempo = km / vel;

        h = (int) tiempo;
        m = (int) ((tiempo - h) * 60);

        System.out.printf("El timepo es de %2d:%2d", h, m);
        sc.close();
    }
}
