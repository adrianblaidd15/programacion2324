package Boletin1_1Java;

import javax.print.attribute.standard.Finishings;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 7 == 0 && i % 13 == 0) {
                System.out.println(i + " es de los dos ");
            }
            else if (i % 7 == 0) {
                System.out.println(i + " es multiplo de 7");
            }
            else if (i % 13 == 0) {
                System.out.println(i + " es multiplo de 13");
            }
        }
    }
}
