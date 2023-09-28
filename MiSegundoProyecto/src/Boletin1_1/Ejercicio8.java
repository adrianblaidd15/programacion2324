package Boletin1_1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nivel");
        int nivel = sc.nextInt();
        System.out.println("Dime las misiones completas");
        int mision = sc.nextInt();
        sc.nextLine();
        if (nivel > 10 && mision > 25) {
            System.out.println("Tienes acceso a la misión");
        } else {
            System.out.println("No tienes acceso a la misión");
        }
    }
}

