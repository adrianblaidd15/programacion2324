package ejerciciosSueltos;

public class metodo {
    public static void main(String[] args) {
        saluda();
        saluda("Pepe");
    }

    //Metodo sin parametros
    public static void saluda() {
        System.out.println("Hola mundo");
    }

    //Metodo que necesita parametro de tipo String
    public static void saluda (String nombre){
        System.out.println("Hola" + nombre);
    }
    public static void saluda (int a){

    }
}
