package Boletin1_1Java;

public class ejercicio10otraversion {
    public static void main(String[] args) {
        System.out.println(factorial(4));



    }
        //metodo recursivo
    public static int factorial(int a) {
        if (a == 0 || a == 1){
            return 1;
        }
        return a * factorial(a -1);
    }
}