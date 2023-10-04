package Boletin1_1Java;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multi = 1;
        int num;
        do {
            System.out.println("Introduce un número entero o cero");
            num = scan.nextInt();
        }while (num <= 0);

        for (int i = 2; i <=num;i++){
            multi = i * multi;

        }
        System.out.println("El fatorial de " +num+ " es " +multi);
    }
}
