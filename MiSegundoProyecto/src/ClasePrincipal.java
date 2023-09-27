import java.util.Scanner;

public class ClasePrincipal {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tipo de vehículo");
        String tipoVehiculo = sc.nextLine();

        if (tipoVehiculo.equals("coche")){
            System.out.println("Velocidad = 120 km/h");
        }

        else if (tipoVehiculo.equals("moto")){
            System.out.println("Velocudad = 90 km/h");
        }

        else if (tipoVehiculo.equals("camión")) {
            System.out.println("Velocidad = 80 km/h");
        }
        else {
            System.out.println("No reconozco ese vehiculo");
        }
    }
}
