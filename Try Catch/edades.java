import java.util.Scanner;
import java.util.InputMismatchException;

public class edades {
    Scanner sc = new Scanner(System.in);

    String nombre;
    int a;
    int edad;

    public void menu() {
        try{
            System.out.println("Ingrese su nombre: ");
            nombre = sc.next();
            System.out.println("En que año nacio");
            a = sc.nextInt();
            calcular();
        }catch (InputMismatchException e) {
            System.out.println("Debes insertar un numero");
            sc.next();
        }

    }

    public void calcular() {

        edad = 2022 - a;
        System.out.println(nombre + " tiene " + edad + " años");
    }

}
