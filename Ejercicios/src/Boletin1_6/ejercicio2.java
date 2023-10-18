package Boletin1_6;

import Boletin1_4.MiEntradaSalida;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exponente;
        int result = 1;
        //Usando metodo que he creado
        base = MiEntradaSalida.leerEnteroPositivo("Introduce la base");
        exponente = MiEntradaSalida.leerEnteroPositivo("Introduce exponente");


        if (exponente == 0) {
            System.out.println("La potencia te sale 1");
        } else {
            for (int i = 0; i < exponente; i++) {
                result *= base;
            }
            System.out.printf("La potencia te sale %2d", result);
        }


    }
}
