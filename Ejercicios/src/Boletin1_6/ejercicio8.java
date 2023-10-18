package Boletin1_6;

import Boletin1_4.MiEntradaSalida;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, result;

        a = MiEntradaSalida.leerEntero("Introduce valor de a");
        b = MiEntradaSalida.leerEntero("Introduce el valor de b");
        c = MiEntradaSalida.leerEntero("Introduce el valor de c");

        result = (b * b) - 4 * a * c;

    }
}
