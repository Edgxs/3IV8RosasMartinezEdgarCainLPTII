import java.lang.Math;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Figuras {

    Scanner sc = new Scanner(System.in);

    int opcion;
    double radio, area, perimetro, lado, base, altura;

    public void menu() {
        try{
            System.out.println("Ingrese la opcion deseada");
            System.out.println("1.- Circulo");
            System.out.println("2.- Rectangulo");
            System.out.println("3.- Cuadrado");
            System.out.println("4.- Triangulo");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Circulo();
                    break;

                case 2:
                    Rectangulo();
                    break;

                case 3:
                    Cuadrado();
                    break;

                case 4:
                    Triangulo();
                    break;

                default:
                    System.out.println("");

            }
        }catch (InputMismatchException e) {
            System.out.println("Debes insertar un numero");
            sc.next();
        }
    }

    public void Circulo() {
        try{    
            System.out.println("Ingrese el radio de su circulo");
            radio = sc.nextDouble();
            area = (Math.PI)*Math.pow(radio, 2);
            perimetro = (radio*2)*Math.PI;

            System.out.println("El area de su circulo es: "+area);
            System.out.println("El perimetro de su circulo es: "+perimetro);
        }catch (InputMismatchException e) {
            System.out.println("Debes insertar un numero");
            sc.next();
        }
    }
    public void Rectangulo() {
        try{
            System.out.println("Ingrese la base de su rectangulo");
            base = sc.nextDouble();
            System.out.println("Ingrese la altura de su rectangulo");
            altura = sc.nextDouble();
            area = base*altura;
            perimetro = (base*2)+(altura*2);

            System.out.println("El area de su rectangulo es: "+area);
            System.out.println("El perimetro de su rectangulo es: "+perimetro);
        }catch (InputMismatchException e) {
            System.out.println("Debes insertar un numero");
            sc.next();
        }
    }
    public void Cuadrado() {
        try{
            System.out.println("Ingrese el lado de su cuadrado");
            lado = sc.nextDouble();
            area = Math.pow(lado, 2);
            perimetro = lado*4;

            System.out.println("El area de su cuadrado es: "+area);
            System.out.println("El perimetro de su cuadrado es: "+perimetro);
        }catch (InputMismatchException e) {
            System.out.println("Debes insertar un numero");
            sc.next();
        }
    }
    public void Triangulo() {
        try{
            System.out.println("Ingrese la base de su rectangulo");
            base = sc.nextDouble();
            System.out.println("Ingrese la altura de su rectangulo");
            altura = sc.nextDouble();
            area = (base*altura)/2;
            perimetro = (base)+(altura*2);

            System.out.println("El area de su triangulo es: "+area);
            System.out.println("El perimetro de su triangulo es: "+perimetro);
        }catch (InputMismatchException e) {
            System.out.println("Debes insertar un numero");
            sc.next();
        }
    }

}
