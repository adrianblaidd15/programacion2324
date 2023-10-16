package Boletin1_5;

import java.util.Scanner;

public class ejercicio2metodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exponente;
        int result = 1;

        leerEnteroPositovo("Introduce la base");

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
}
