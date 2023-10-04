package Boletin1_1Java;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int cont = 0;


        do {
            System.out.println("Dame un número negativo");
            num = scan.nextInt();
            if (num >= 0) {
                cont++;
            }
        } while (num >= 0);

        if (cont > 0) {
            System.out.printf("Has sido pesado y has puesto %2d números positivos", cont);
        }
        else {
            System.out.println("Gracias por tu cooperación");
        }
        scan.close();
    }
}
