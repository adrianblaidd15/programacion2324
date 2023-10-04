package ejerciciosSueltos;

import java.util.Scanner;

public class bucledo_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contra;

        do {
            System.out.println("Dame una contraseña de 8 caracteres");
            contra = sc.nextLine();

        } while (contra.length() <= 8);

        System.out.println("Has introducido una contraseña correcta");
    }
}