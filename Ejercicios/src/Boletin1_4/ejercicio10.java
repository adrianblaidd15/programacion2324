package Boletin1_4;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ope;
        double num1;
        double num2;
        System.out.print("Introduce que quieres realizar: +,-,*,/: ");
        do {
            ope = sc.nextLine().toUpperCase().charAt(0);
            if (ope != '+' && ope != '-' && ope != '*' && ope != '/') {
                System.out.print("Introduce uno de los tipo de cuenta que quieras realizar: ");
            }
        } while (ope != '+' && ope != '-' && ope != '*' && ope != '/');
        System.out.println("Introduce el primer número con el que quieres operar");
        num1 = Double.parseDouble(sc.nextLine());
        System.out.println("Introduce el segundo número con el que quieres operar");
        num2 = Double.parseDouble(sc.nextLine());
        boolean error = false;

        double result = switch (ope) {
            case '+':
                yield num1 + num2;
            case '-':
                yield num1 - num2;
            case '*':
                yield num1 * num2;
            case '/':
                if (num2 == 0){
                    System.out.println("No se puede dividir entre cero");
                    error = true;
                    yield 0;
                }
                yield num1 / num2;
            default:
                error = true;
                System.out.println("Esto no va a pasar nunca");
                yield 0;
        };
        if (!error){
            System.out.println("Te da " +result);
        }


    }
}
