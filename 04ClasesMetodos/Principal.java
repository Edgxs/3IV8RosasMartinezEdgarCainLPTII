import java.util.*;
import java.lang.Math;

public class Principal {
    public static void main(String[] args) {
        /* Vamos a haccer una instancia para llamar a el menu */
        int opcion;
        Scanner sc = new Scanner(System.in);

        System.out.println("Elija entre ejercicio y figura");
        System.out.println("1.- Ejercicio");
        System.out.println("2.- Figura");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                Ejercicio men = new Ejercicio();
                men.menu();
                break;
            case 2:
                Figura fi = new Figura();
                fi.menu();
                break;
            default:
                System.out.println("Ingrese una de las opciones mostradas");

        }

    }
}
