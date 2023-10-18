package Boletin1_6;

import Boletin1_4.MiEntradaSalida;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int cifras = 1;


        num = MiEntradaSalida.leerEntero("Introduce un número");
        int numI = num;

        while (num /10 != 0){
            num = num/10;
            cifras++;
        }
        System.out.println("El número "+numI+" tiene " +cifras+ " cifras");


    }
}
