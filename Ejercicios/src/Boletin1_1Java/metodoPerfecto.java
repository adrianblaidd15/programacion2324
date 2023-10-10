package Boletin1_1Java;

public class metodoPerfecto {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (esPerfecto(i)) {
                System.out.printf("%2d es perfecto\n", i);
            }
        }
    }


    public static boolean esPerfecto(int num) {

        int sum = 0;

        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;


    }
}
