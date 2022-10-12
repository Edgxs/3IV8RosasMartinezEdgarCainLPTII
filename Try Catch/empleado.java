import java.util.Scanner;
import java.util.InputMismatchException;

public class empleado {
    Scanner sc = new Scanner (System.in);

    private int ID_empleado;
    private String nombre, puesto;
    double [] sueldo = new double[2];
    String empleado = "empleado";
    String supervisor = "supervisor";
    int horas_diurnas, horas_nocturnas;

    public void menu(){
        datos();
        if(puesto.equalsIgnoreCase(empleado) == true){
            try{
                System.out.println("¿Cuantas horas extras diurnas trabajo?");
                horas_diurnas = sc.nextInt();
                System.out.println("¿Cuantas horas extras nocturnas trabajo?");
                horas_nocturnas = sc.nextInt();
                sueldo [0] = (5000) + (horas_diurnas*50) + (horas_nocturnas*60);
                System.out.println("Su sueldo es de: " +sueldo[0]);
            }catch (InputMismatchException e) {
                System.out.println("Debes insertar un numero");
                sc.next();
            }
        }else if(puesto.equalsIgnoreCase(supervisor) == true){
            sueldo[1] = (8000) - (8000*0.002) - (8000*0.001) - (8000 - 0.0016);
            System.out.println("Su sueldo es de: " + sueldo[1]);
        }
        System.out.println("Gracias por usar el programa " + nombre);
    }
    public void datos(){
        try{
            System.out.println("Ingrese su ID (solo numeros):");
            ID_empleado = sc.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Debes insertar un numero");
            sc.next();
        }

            sc.nextLine();

            System.out.println("Ingrese su nombre: ");
            nombre = sc.nextLine();

            System.out.println("Ingrese su puesto: ");
            puesto = sc.nextLine();
        
        
    }
}
