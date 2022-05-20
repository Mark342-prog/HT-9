import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Reader rd = new Reader();
    Integer el = 0;
    while (el != 2) {
        System.out.println("Bienvenido al sistema de rutas eficiente");
        System.out.println("por favor ingresa una opción valida");
        System.out.println("1. ingresar ciudad");
        System.out.println("2. salir");
        el = sc.nextInt();
        if (el == 1) {
            System.out.println("Ciudades disponibles");
            System.out.println("por favor ingresa una opción valida");
            System.out.println("Ciudad, Flores, Antigua, Flores");
            rd.process();
            rd.target();
        }
    }
    }
    
}

