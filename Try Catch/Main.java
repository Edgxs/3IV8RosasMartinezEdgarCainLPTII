import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;
            
        while (!salir) {
            try{
                System.out.println("Seleccione la opcion requerida");
                System.out.println("1.- Ejercicio 1");
                System.out.println("2.- Ejercicio 2");
                System.out.println("3.- Ejercicio 3");
                System.out.println("4.- Ejercicio 4");
                System.out.println("5.- Salir");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        edades edad = new edades();
                        edad.menu();
                        break;

                    case 2:
                        Figuras fig = new Figuras();
                        fig.menu();

                        break;

                    case 3:
                        Llamadas llam = new Llamadas();
                        llam.menu();
                        break;

                    case 4:
                        empleado em = new empleado();
                        em.menu();
                        break;

                    case 5:
                        salir = true;
                        break;

                    default:
                        System.out.println("Seleccione una de las opciones");
                        break;
                }
            }catch (InputMismatchException e) {
                System.out.println("Debes insertar un numero");
                sc.next();
            }
        }

    }
}