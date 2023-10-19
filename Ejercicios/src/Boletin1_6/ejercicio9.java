package Boletin1_6;

public class ejercicio9 {
    public static void main(String[] args) {
        int result;
        System.out.println("Te voy a mostrar todas las tablas de multiplicar:");
        for (int i = 0; i <= 10; i++) {

            for (int u = 0; u <= 10; u++) {
                if (u == 0) {
                    System.out.printf("Tabla del %1d\n", i);
                }
                result = u * i;

                System.out.printf("%1d x %1d = %1d\n", i, u, result);

            }
        }
    }
}
