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
        if (a == 0) {
            System.out.printf("La ecuacion que queries realizar es primer grado, no estoy diseñado para ello");
        }
        else if (result > 0) {
            System.out.printf("Hay dos soluciones reales distintas");
        }
        else if (result == 0){
            System.out.printf("Hay dos soluciones reales iguales");
        }
        else if (result < 0 ){
            System.out.printf("No hay soluciones reales");
        }

    }
}
