package Boletin1_2;

public class ejercicio5 {
    static int oro = 300;
    static int nivel = 35;
    static String arma = "Espada";
    static double salud = 100;

    public static void main(String[] args) {

    }
    public static double daño(double d) {
        if (d > 0) {
            return d - salud;
        }
        return 100;
    }
    public static void imprimeEstado (String [] args){
        System.out.printf("En tú inventario actual tienes: Oro:%2d, nivel:%2d, Arma:"+arma+ " Salud:"+salud, oro, nivel);
    }
}


