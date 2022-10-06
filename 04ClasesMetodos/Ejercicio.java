import java.util.*;

public class Ejercicio {

    /*
     * vamos a hacer un programa desde el cual vamos a tener 4 opciones que son
     * 1-otra calculadora
     * 2-conversion de unidades
     * 3-creacion de cuadrito magico
     * 4-movimiento de un cuadro
     */

    // objetos
    Scanner entrada = new Scanner(System.in);

    // metodos o comportamientos de la clase
    // camos a cvrear un metodo para el menu

    /*
     * public es el acceso a el tipo de datro clase o metodo cualquier elemento de
     * programa puede acceder a el
     * prtivate es el acceso restrinfiodo solo mediante reglas se puede acceder a el
     * protected se ouede tener acceso solo desde la misma clase y aplicacando la
     * herencia de POO enre los hijos y padres
     */
    /* un mnetodo tambien es un tpo de dato aplicando */
    char op;

    public void menu(/* aqui van los parametros */ ) {
        System.out.println("Bienvenidos a los metodos");
        System.out.println("Elija una de las sigientes operaciones");
        System.out.println("a.- Calculadora");
        System.out.println("b.- Conversion de unidades");
        System.out.println("c.- Creacion de cuadros");
        System.out.println("d.- Movimiento de cuadro");
        op = entrada.next().charAt(0);

        switch (op) {

            case 'a':
                // vamos a hacer un metodo
                Ejercicio1();
                break;

            case 'b':
                // vamos a hacer un metodo
                Ejercicio2();
                break;

            case 'c':
                // vamos a hacer un metodo
                Ejercicio3();
                break;

            case 'd':
                // vamos a hacer un metodo
                Ejercicio4();
                break;

            default:
                System.out.println("Gracias por estar aqui, pero hay que mimie. Operacion no valida");
        }

    }

    public void Ejercicio1() {
        // suma
        // resta
        // multiplicacion
        // division
        double num1 = 0.00, suma = 0.00, multi = 0.00;
        char operacion;

        System.out.println("Seleccionar la operacion que deseas realizar");
        System.out.println("a.- Suma y resta");
        System.out.println("b.- Multiplicacion");
        System.out.println("c.- Division");
        operacion = entrada.next().charAt(0);

        switch (operacion) {
            case 'a':
                // Sumar tantos numeros como deseemos
                System.out.println("Para detenr la operacion presione 0");
                System.out.println("Escriba tantos numeros como quiera sumar o restar");
                do {

                    num1 = entrada.nextDouble();
                    suma += num1;
                    System.out.println("El resultado es: " + suma);

                } while (num1 != 0);
                break;

            case 'b':
                do {
                    System.out.println("Para detenr la operacion presione 0");
                    System.out.println("Escriba tantos numeros como quiera multiplicarlos");
                    num1 = entrada.nextDouble();
                    multi += num1;
                    System.out.println("El resultado es: " + multi);
                } while (num1 != 0);
                break;

            case 'c':
                System.out.println("Ingrese el numerador");
                num1 = entrada.nextDouble();
                System.out.println("INgrese el denominador");
                suma = entrada.nextDouble();

                if (suma == 0) {
                    System.out.println("No se puede realizar la division entre 0");
                } else {
                    multi = num1 / suma;
                }
                System.out.println("El resultado de la division es: " + multi);

        }

    }

    public void Ejercicio2() {
        double metros = 0.00, kg = 0.00, cm = 100.00, pulgadas = 39.37, gramos = 1000.00, libras = 2.20,
                ms = 0.00;
        double a, b;
        System.out.println("Seleccione la cantidad que desee convertir : ");
        System.out.println("a. Metros a cm y pulgadas");
        System.out.println("b. kg a libras y gramos");
        System.out.println("c. m/s a km/h");

        char op = entrada.next().charAt(0);
        switch (op) {
            case 'a':
                System.out.println("Ingrese la cantidad de metros");
                metros = entrada.nextDouble();
                a = metros * cm;
                b = metros * pulgadas;
                System.out.println(
                        "La cantidad de metros son: " + metros + " en cm son: " + a + " en pulgadas son: " + b);
                break;

            case 'b':
                System.out.println("Ingrese la cantidad de kilogramos");
                kg = entrada.nextDouble();
                a = kg * libras;
                b = kg * gramos;
                System.out.println(
                        "La cantidad de Kg son: " + kg + " en libras son: " + a + " en gramos son: " + b);
                break;

            case 'c':
                System.out.println("Ingrese la cantidad de m/s");
                ms = entrada.nextDouble();
                a = ms * 3.6;
                System.out.println(
                        "La cantidad de m/s son: " + ms + " en k/h son: " + a);
                break;
        }
    }

    public void Ejercicio3() {

    }

    public void Ejercicio4() {

    }

}