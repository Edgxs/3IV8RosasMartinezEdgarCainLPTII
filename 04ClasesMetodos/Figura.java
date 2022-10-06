import java.util.Scanner;

import java.lang.Math;

public class Figura {
    double lado, altura, area, perimetro, lado2, lado3;
    int opcion;
    char letra;

    Scanner sc = new Scanner(System.in);

    public void menu() {
        do {
            System.out.println("Programa de calculo de areas y perimetros");
            System.out.println("Elija una opcion");
            System.out.println("1.- Cuadrado");
            System.out.println("2.- Triangulo");
            System.out.println("3.- Circulo");
            System.out.println("4.- Pentagono");
            System.out.println("5.- Dodecagono");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    calcularCuadrado();
                    break;
                case 2:
                    calcularTriangulo();
                    break;
                case 3:
                    // calcularCirculo();
                    break;
                case 4:
                    // calcularPentagono();
                    break;
                case 5:
                    // calcularDodecagono();
                    break;
                default:
                    System.out.println("Gracias por su atencion");

            }

            System.out.println("Desea repetir el programa");

        } while (letra == 's' || letra == 'S');
    }

    public void calcularCuadrado() {
        try {
            System.out.println("Ingrese el valor del lado del cuadrado");
            lado = sc.nextDouble();

            perimetro = lado * 4;
            area = Math.pow(lado, 2);
            System.out.println("El perimetro es de : " + perimetro + "\nEl area es de: " + area);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Ingrese solo numeros");
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void calcularTriangulo() {
        try {
            System.out.println("Ingrese el valor de la base del triangulo");
            lado = sc.nextDouble();
            System.out.println("Ingrese el valor de su altrura");
            altura = sc.nextDouble();

            perimetro = lado * 4;
            area = Math.pow(lado, 2);
            System.out.println("El perimetro es de : " + perimetro + "\nEl area es de: " + area);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Ingrese solo numeros");
            System.out.println("Error: " + e.getMessage());
        }
    }

    /*
     * public void calcularCirculo() {
     * 
     * }
     * 
     * public void calcularPentagono() {
     * 
     * }
     * 
     * public void calcularDodecagono() {
     * 
     * }
     */

}
