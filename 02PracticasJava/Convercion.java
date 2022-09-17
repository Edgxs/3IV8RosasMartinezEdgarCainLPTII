/*ELABORA UN PROGRAMA QUE CONVIERTA TEMPERATURA EN GRADOS FAHRENHEIT, 
EN GRADOS CELSIUS, KELVINE Y RANKINE. .( SE PODRÁ ELEGIR QUE CONVERSIÓN DESEA REALIZAR)  */
//Grados Fahrenheit = F
//Grados Celsius = C
//Grados Kelvine = K
//Grados Rankine = R

/*
F = C
F = K
F = R
C = F
C = K
C = R
K = F
K = C
K = R
R = F
R = C
R = K*/

import java.util.*;
class Convercion {
    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        System.out.println("Rosas Matinez Edgar Cain 3IV8");
        boolean salir = false;
        int opcion1,opcion2;
        double f,c,k,r;
 
        while (!salir) {
            
            System.out.println("Cual es la temperatura que desea convertir");
            System.out.println("1. Fahrenheit");
            System.out.println("2. Celsius");
            System.out.println("3. Kelvine");
            System.out.println("4. Rankine");
            System.out.println("5.Salir");
 
            try {
 
                opcion1 = sn.nextInt();
 
                switch (opcion1) {
                    case 1://Fahrenheit
                            try {
                                System.out.println("Cual es la medida a la que deseas convertir");
                                System.out.println("1. Celsius");
                                System.out.println("2. Kelvine");
                                System.out.println("3. Rankine");
                                opcion2 = sn.nextInt();
                 
                                switch (opcion2) {
                                    case 1://celsius
                                        System.out.print("°F= ");
                                        f = sn.nextDouble();
                                        c = ((f-32)*5)/9;
                                        System.out.println("Su conversion de "+f+" °F a °C es igual a: " + c + " °C");
                                        break;
                                    case 2://kelvine
                                        System.out.print("°F= ");
                                        f = sn.nextDouble();
                                        k = ((f-32)*5)/9+273.15;
                                        System.out.println("Su conversion de "+f+" °F a K es igual a: " + k + " K");
                                        break;
                                    case 3://rankine
                                        System.out.print("°F= ");
                                        f = sn.nextDouble();
                                        r = f + 459.67;
                                        System.out.println("Su conversion de "+f+" °F a °R es igual a: " + r + " °R");
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 3");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes insertar un número");
                                sn.next();
                            }
                        break;
                        //
                    case 2://Celsius
                            try {
                                System.out.println("Cual es la medida a la que deseas convertir");
                                System.out.println("1. Fahrenheit");
                                System.out.println("2. Kelvine");
                                System.out.println("3. Rankine");
                                opcion2 = sn.nextInt();
                
                                switch (opcion2) {
                                    case 1://fahrenheit
                                        System.out.print("°C= ");
                                        c = sn.nextDouble();
                                        f = ((c*9)/5)+32;
                                        System.out.println("Su conversion de "+c+" °C a °F es igual a: " + f + " °F");
                                        break;
                                    case 2://kelvine
                                        System.out.print("°C= ");
                                        c = sn.nextDouble();
                                        k = c+273.15;
                                        System.out.println("Su conversion de "+c+" °C a K es igual a: " + k + " K");
                                        break;
                                    case 3://rankine
                                        System.out.print("°C= ");
                                        c = sn.nextDouble();
                                        r = (c*9)/5 + 491.67;
                                        System.out.println("Su conversion de "+c+" °C a °R es igual a: " + r + " °R");
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 3");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes insertar un número");
                                sn.next();
                            }
                        break;

                        //
                    case 3://Kelvine
                            try {
                                System.out.println("Cual es la medida a la que deseas convertir");
                                System.out.println("1. Fahrenheit");
                                System.out.println("2. Clesius");
                                System.out.println("3. Rankine");
                                opcion2 = sn.nextInt();
                
                                switch (opcion2) {
                                    case 1://fahrenheit
                                        System.out.print("K= ");
                                        k = sn.nextDouble();
                                        f = (k-273.15*9)/5+32;
                                        System.out.println("Su conversion de "+k+" K a °F es igual a: " + f + " °F");
                                        break;
                                    case 2://celsius
                                        System.out.print("K= ");
                                        k = sn.nextDouble();
                                        c = k-273.15;
                                        System.out.println("Su conversion de "+k+" K a °C es igual a: " + c + " °C");
                                        break;
                                    case 3://rankine
                                        System.out.print("K= ");
                                        k = sn.nextDouble();
                                        r = k*1.8;
                                        System.out.println("Su conversion de "+k+" K a °R es igual a: " + r + " °R");
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 3");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes insertar un número");
                                sn.next();
                            }
                        break;
                        //
                    case 4://rankie
                            try {
                                System.out.println("Cual es la medida a la que deseas convertir");
                                System.out.println("1. Fahrenheit");
                                System.out.println("2. Clesius");
                                System.out.println("3. Kelvine");
                                opcion2 = sn.nextInt();
                
                                switch (opcion2) {
                                    case 1://fahrenheit
                                    System.out.print("°R= ");
                                        r = sn.nextDouble();
                                        f = r-459.67;
                                        System.out.println("Su conversion de "+r+" °R a °F es igual a: " + f + " °F");
                                        break;
                                    case 2://celsius
                                        System.out.print("°R= ");
                                        r = sn.nextDouble();
                                        c = ((r-491.67)*5)/9;
                                        System.out.println("Su conversion de "+r+" °R a °C es igual a: " + c + " °C");
                                        break;
                                    case 3://kelvine
                                        System.out.print("°R= ");
                                        r = sn.nextDouble();
                                        k = (r*5)/9;
                                        System.out.println("Su conversion de "+r+" °R a K es igual a: " + k + " K");
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 3");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes insertar un número");
                                sn.next();
                            }
                        break;
                        //
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    }
}
