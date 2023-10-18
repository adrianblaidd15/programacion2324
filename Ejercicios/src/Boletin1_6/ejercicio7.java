package Boletin1_6;

import Boletin1_4.MiEntradaSalida;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        int temp;


        num1 = MiEntradaSalida.leerEnteroPositivo("Dame un número positvo");
        num2 = MiEntradaSalida.leerEnteroPositivo("Dame el segund número postivo");

        int guar1 = num1;
        int guar2 = num2;

        if (num1 > num2) {
            num3 = num1;
            num1 = num2;
            num2 = num3;
        }
        while (num2 != 0) {
            temp = num1;
            num1 = num2;
            num2 = temp % num2;

        }

            System.out.println("El mayor divisor de " + guar1 + " y " + guar2 + " es " + num1);

    }
}
