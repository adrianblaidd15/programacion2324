package Boletin1_5;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exponente;
        int result = 1;

        System.out.println("Introduce la base");
        do {
            base = sc.nextInt();
            if (base < 0) {
                System.out.println("Debe der un número positivo");
            }
        } while (base < 0);
        System.out.println("Introduce exponente");
        do {
            exponente = sc.nextInt();
            if (exponente < 0) {
                System.out.println("Debe der un número positivo");
            }
        } while (exponente < 0);

        if (exponente == 0){
            System.out.println("La potencia te sale 1");
        }
       else{
           for (int i= 0; i < exponente; i++){
                result *=base;
            }
            System.out.printf("La potencia te sale %2d",result);
        }


    }
}
