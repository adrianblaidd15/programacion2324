package Boletin1_6;

import Boletin1_4.MiEntradaSalida;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int INICIO = 1;
        final int FIN = 100;
        final int PERDER = 5;
        int intentos = 1;
        int r = (int) (Math.random() * 100) + 1;
        int num;

        System.out.println(r);
        num = MiEntradaSalida.leerEnteroDeRango("Dame un número entre 1 y 100", INICIO, FIN);

        do {
            if (num != r) {

                System.out.println("No has acertado, este es el intento " + intentos + " de " + PERDER);
                intentos++;
                if (num > r) {
                    System.out.println("El número magico es menor");
                }
                if (num < r) {
                    System.out.println("El número magico es mayor");
                }
                num = MiEntradaSalida.leerEnteroDeRango("Vuelve a probar", INICIO, FIN);
            }
        } while (num != r && intentos != PERDER);

        if (num == r) {
            System.out.println("Has acertado el número magico");
        } else if (intentos == PERDER) {
            System.out.println("Has perdido");
        }
    }


}
