package Boletin1_4;

import java.util.Scanner;
import java.util.SortedMap;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int media = 0;
        int cant = 0;

        do {
            System.out.println("Introduce un número positivo, solo terminare cuando sea -1");
            num = sc.nextInt();

            if (num >= 0) {
                media += num;
                cant += 1;
            }
            if (num < min && num >= 0) {
                min = num;
            }
            if (num > max && num >= 0) {
                max = num;
            }

        } while (num != -1);
        double result = (double)media /cant;

        if (cant > 0) {
            System.out.println("La media es " + result + " el mayor es " + max + " el menor es " + min);
        }
        else  {
            System.out.println("No has introducido números");
        }
    }
}
