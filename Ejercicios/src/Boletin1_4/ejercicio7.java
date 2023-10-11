package Boletin1_4;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        final int primeraFranja = 12;
        final double segundaFranja = 8.5;
        final double terceraFranja = 11.3;
        Scanner sc = new Scanner(System.in);
        char estado;
        int edad;

        do {
            System.out.println("Digame su estado civil, 'S'-Soltero, 'C'-Casado, 'V'-Viudo y 'D'-Divorciado");
            estado = sc.nextLine().charAt(0);
        } while (estado != 'S' && estado != 'C' && estado != 'V' && estado != 'D');

        System.out.println("Dime tu edad");
        do {
            edad = sc.nextInt();
            if (edad <= 0) {
                System.out.println("Dame una edad real");
            }
        } while (edad < 0);

        if (edad < 35 && estado == 'V' || estado == 'C') {
            System.out.println("El porcentaje que se le aplicara seran del " + primeraFranja);
        } else if (edad < 35 && estado == 'S' || estado == 'D') {
            System.out.println("El porcentaje que se le aplicara seran del " + terceraFranja);
        } else if (edad > 50) {
            System.out.println("El porcentaje que se le aplicara seran del " + segundaFranja);
        } else {
            System.out.println("El porcentaje que se le aplicara seran del 10.5");
        }


    }
}
