import java.util.Scanner;
import java.util.InputMismatchException;

public class Llamadas {
    Scanner sc = new Scanner(System.in);
    
    private int opcion;
    private double credito, minutos,costo;
    public void menu(){
        try{
            System.out.println("Ingrese su credito");
            credito =sc.nextInt();
            do{
                System.out.println("Selecciona la opcion deseada");
                System.out.println("1.- Llamada Local Nacional");
                System.out.println("2.- Llamada Local Internacional");
                System.out.println("3.- Llamada Celulares");
                System.out.println("4.- Consultar credito");
                System.out.println("5.- Salir");
                opcion = sc.nextInt();
                

                switch(opcion){
                    case 1:
                        llamada_local();
                        break;
                    case 2:
                        llamada_internacional();
                        break;
                    case 3:
                        llamada_celulares();
                        break;
                    case 4:
                        credito();
                        break;
                    
                    default:
                }
            }while(opcion != 5);
        }catch (InputMismatchException e) {
            System.out.println("Debes insertar un numero");
            sc.next();
        }
    }

    public void llamada_local(){
        //0.5
        try{
            System.out.println("¿Cuantos minutos estuvo realizando su llamada?");
            minutos = sc.nextInt();
            costo = minutos*0.5;
            System.out.println("El costo de su llamada fue de: " + costo);
            credito = credito - costo;
            costo = 0; minutos = 0;
        }catch (InputMismatchException e) {
            System.out.println("Debes insertar un numero");
            sc.next();
        }

    }
    public void llamada_internacional(){
        //0.6
        try{
            System.out.println("¿Cuantos minutos estuvo realizando su llamada?");
            minutos = sc.nextInt();
            costo = minutos*0.6;
            System.out.println("El costo de su llamada fue de: " + costo);
            credito = credito - costo;
            costo = 0; minutos = 0;
        }catch (InputMismatchException e) {
            System.out.println("Debes insertar un numero");
            sc.next();
        }
    }
    public void llamada_celulares(){
        //0.2
        try{
            System.out.println("¿Cuantos minutos estuvo realizando su llamada?");
            minutos = sc.nextInt();
            costo = minutos*0.2;
            System.out.println("El costo de su llamada fue de: " + costo);
            credito = credito - costo;
            costo = 0; minutos = 0;
        }catch (InputMismatchException e) {
            System.out.println("Debes insertar un numero");
            sc.next();
        }
    }
    public void credito(){
        System.out.println("Su credito es de: " + credito);
    }
}
