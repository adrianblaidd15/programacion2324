package Boletin1_6;

import java.util.Random;

public class numerosaleatorios {
    public static void main(String[] args) {
        Random r = new Random();
        //creacion de numero aleatorio
        int aleatorio = r.nextInt(100) + 1;

        int aleatorio2 = (int)(Math.random() *100) + 1;
        //Necesito un alatirui del 50 al 100
        double ale = Math.random() * (100 - 50 + 1);
        int aleato = (int) ale + 50;
    }
}
