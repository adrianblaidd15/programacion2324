package Boletin1_7;

import Boletin1_4.MiEntradaSalida;

public class ejercicio1 {
    public static void main(String[] args) {
       int num = MiEntradaSalida.leerEnteroPositivo("Introduce un numero positivo");
       int a = num;

       int inv = 0;
        while (a != 0) {
            inv = inv * 10 + a % 10;
            a = a / 10;
        }
       if (num == inv) {
            System.out.println("Es capicua");
        } else {
            System.out.printf("El inverso de %d es %d", num, inv);
        }

    }

}