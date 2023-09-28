package Boletin1_1;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un número");
        num1 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Dame un segundo número");
        num2 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Dime que operacion quieres realizar, sumar, restar, multiplicar o dividir");
        String elec = teclado.nextLine();

        switch (elec) {
            case "sumar":
            case "+":
                System.out.println(num1 + num2);
                break;
            case "multiplicar":
            case "*":
                System.out.println(num1 * num2);
                break;
            case "restar":
            case "-":
                System.out.println(num1 - num2);
                break;
            case "dividir":
            case "/":
                System.out.println((double) num1 / num2);
                break;
            default:
                System.out.println("No es una opción");
        }
    }
}
