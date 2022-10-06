/*vamos a crear un programa que se encargue de realizar las siguientes operaciones 
    1- un bono o descuento por la edad
    2- convertir numeros a binarios
    3- convertir celsius a kelvin
    4- numero de positivos y negativos
    5- tiendita
    6- area y perimetro de figuras
    7- tabla
    8- factorial
    9- dibujo
    10- figura hueca
    11- patrones
    12- diamante
    13- calculadora
    14- salir
 */

import java.util.*;

class estructuradedatos {
  // programa 1
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, opcion, numbinario, n, a, b,numero;
        int positivo = 0;
        int negativo=0;
        char letras, operacion;
        float resultado = 0;
        String binario = "";
        String sexo = "";
        try {
            do {
                System.out.println("/****************  Bienvenido a la tarea que habia que hacer  ****************/");
                System.out.println("Por favor eliga la opcion deseada: ");
                System.out.println("1.  Descuento por edad");
                System.out.println("2.  Convertir numero decimal a binario");
                System.out.println("3.  Conversion de temperatura");
                System.out.println("4.  Numeros positivos y negativos");
                System.out.println("5.  Tiendita");
                System.out.println("6.  Area y perimetro");
                System.out.println("7.  Tabla");
                System.out.println("8.  Factorial");
                System.out.println("9.  Dibujitos");
                System.out.println("10. Figura hueca");
                System.out.println("11. Patrones");
                System.out.println("12. Diamante");
                System.out.println("13. Calculadora");
                System.out.println("14. Salir");

                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:// DESCUENTO POR EDAD

                        System.out.println("Ingrese su sexo M/H");
                        sc.nextLine();
                        sexo = sc.nextLine();
                        System.out.println(sexo);
                        String hombre = "h";
                        String mujer = "m";
                        if (sexo.equalsIgnoreCase(hombre) == true) {
                            System.out.println("Ingrese su edad");
                            edad = sc.nextInt();
                            if (edad >= 18) {
                                System.out.println("Usted es Hombre y es mayor de edad");
                            } else {
                                System.out.println("Usted es Hombre y es menor de edad");
                            }

                        }
                        if (sexo.equalsIgnoreCase(mujer) == true) {
                            System.out.println("Ingrese su edad");
                            edad = sc.nextInt();
                            if (edad >= 18) {
                                System.out.println("Usted es Mujer y es mayor de edad");
                            } else {
                                System.out.println("Usted es mujer y es menor de edad");
                            }
                        } else {
                            System.out.println("Ingrese una de las opciones mencionadas");
                        }

                        break;

                    case 2:// CONVERCION DECIMAL A BINARIO
                        System.out.println("Ingrese el numero positivo entero que desee convertir a binario");
                        numbinario = sc.nextInt();
                        binario = "";
                        if (numbinario > 0) {
                            while (numbinario > 0) {
                                if (numbinario % 2 == 0) {
                                    binario = '0' + binario;
                                } else {
                                    binario = '1' + binario;
                                }
                                numbinario = (int) numbinario / 2;
                            }
                        } else if (numbinario == 0) {
                            binario = "0";
                        } else {
                            binario = "No se pudo convertir     el numero, ingrese solo positivos";
                        }
                        System.out.println("El numero binario es: " + binario);
                        break;

                    case 3:// CONVERSIONES DE TEMPERATURA
                        boolean salir = false;
                        int opcion1, opcion2;
                        double f, c, k, r;

                        while (!salir) {

                            System.out.println("Cual es la temperatura que desea convertir");
                            System.out.println("1. Fahrenheit");
                            System.out.println("2. Celsius");
                            System.out.println("3. Kelvine");
                            System.out.println("4. Rankine");
                            System.out.println("5.Salir");

                            try {

                                opcion1 = sc.nextInt();

                                switch (opcion1) {
                                    case 1:// Fahrenheit
                                        try {
                                            System.out.println("Cual es la medida a la que deseas convertir");
                                            System.out.println("1. Celsius");
                                            System.out.println("2. Kelvine");
                                            System.out.println("3. Rankine");
                                            opcion2 = sc.nextInt();

                                            switch (opcion2) {
                                                case 1:// celsius
                                                    System.out.print("°F= ");
                                                    f = sc.nextDouble();
                                                    c = ((f - 32) * 5) / 9;
                                                    System.out.println("Su conversion de " + f + " °F a °C es igual a: "
                                                            + c + " °C");
                                                    break;
                                                case 2:// kelvine
                                                    System.out.print("°F= ");
                                                    f = sc.nextDouble();
                                                    k = ((f - 32) * 5) / 9 + 273.15;
                                                    System.out.println("Su conversion de " + f + " °F a K es igual a: "
                                                            + k + " K");
                                                    break;
                                                case 3:// rankine
                                                    System.out.print("°F= ");
                                                    f = sc.nextDouble();
                                                    r = f + 459.67;
                                                    System.out.println("Su conversion de " + f + " °F a °R es igual a: "
                                                            + r + " °R");
                                                    break;
                                                default:
                                                    System.out.println("Solo números entre 1 y 3");
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println("Debes insertar un número");
                                            sc.next();
                                        }
                                        break;
                                    //
                                    case 2:// Celsius
                                        try {
                                            System.out.println("Cual es la medida a la que deseas convertir");
                                            System.out.println("1. Fahrenheit");
                                            System.out.println("2. Kelvine");
                                            System.out.println("3. Rankine");
                                            opcion2 = sc.nextInt();

                                            switch (opcion2) {
                                                case 1:// fahrenheit
                                                    System.out.print("°C= ");
                                                    c = sc.nextDouble();
                                                    f = ((c * 9) / 5) + 32;
                                                    System.out.println("Su conversion de " + c + " °C a °F es igual a: "
                                                            + f + " °F");
                                                    break;
                                                case 2:// kelvine
                                                    System.out.print("°C= ");
                                                    c = sc.nextDouble();
                                                    k = c + 273.15;
                                                    System.out.println("Su conversion de " + c + " °C a K es igual a: "
                                                            + k + " K");
                                                    break;
                                                case 3:// rankine
                                                    System.out.print("°C= ");
                                                    c = sc.nextDouble();
                                                    r = (c * 9) / 5 + 491.67;
                                                    System.out.println("Su conversion de " + c + " °C a °R es igual a: "
                                                            + r + " °R");
                                                    break;
                                                default:
                                                    System.out.println("Solo números entre 1 y 3");
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println("Debes insertar un número");
                                            sc.next();
                                        }
                                        break;

                                    //
                                    case 3:// Kelvine
                                        try {
                                            System.out.println("Cual es la medida a la que deseas convertir");
                                            System.out.println("1. Fahrenheit");
                                            System.out.println("2. Clesius");
                                            System.out.println("3. Rankine");
                                            opcion2 = sc.nextInt();

                                            switch (opcion2) {
                                                case 1:// fahrenheit
                                                    System.out.print("K= ");
                                                    k = sc.nextDouble();
                                                    f = (k - 273.15 * 9) / 5 + 32;
                                                    System.out.println("Su conversion de " + k + " K a °F es igual a: "
                                                            + f + " °F");
                                                    break;
                                                case 2:// celsius
                                                    System.out.print("K= ");
                                                    k = sc.nextDouble();
                                                    c = k - 273.15;
                                                    System.out.println("Su conversion de " + k + " K a °C es igual a: "
                                                            + c + " °C");
                                                    break;
                                                case 3:// rankine
                                                    System.out.print("K= ");
                                                    k = sc.nextDouble();
                                                    r = k * 1.8;
                                                    System.out.println("Su conversion de " + k + " K a °R es igual a: "
                                                            + r + " °R");
                                                    break;
                                                default:
                                                    System.out.println("Solo números entre 1 y 3");
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println("Debes insertar un número");
                                            sc.next();
                                        }
                                        break;
                                    //
                                    case 4:// rankie
                                        try {
                                            System.out.println("Cual es la medida a la que deseas convertir");
                                            System.out.println("1. Fahrenheit");
                                            System.out.println("2. Clesius");
                                            System.out.println("3. Kelvine");
                                            opcion2 = sc.nextInt();

                                            switch (opcion2) {
                                                case 1:// fahrenheit
                                                    System.out.print("°R= ");
                                                    r = sc.nextDouble();
                                                    f = r - 459.67;
                                                    System.out.println("Su conversion de " + r + " °R a °F es igual a: "
                                                            + f + " °F");
                                                    break;
                                                case 2:// celsius
                                                    System.out.print("°R= ");
                                                    r = sc.nextDouble();
                                                    c = ((r - 491.67) * 5) / 9;
                                                    System.out.println("Su conversion de " + r + " °R a °C es igual a: "
                                                            + c + " °C");
                                                    break;
                                                case 3:// kelvine
                                                    System.out.print("°R= ");
                                                    r = sc.nextDouble();
                                                    k = (r * 5) / 9;
                                                    System.out.println("Su conversion de " + r + " °R a K es igual a: "
                                                            + k + " K");
                                                    break;
                                                default:
                                                    System.out.println("Solo números entre 1 y 3");
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println("Debes insertar un número");
                                            sc.next();
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
                                sc.next();
                            }
                        }
                        break;

                    case 4:// NUMEROS POSITIVOS Y NEGATIVOS
                        do {
                            
                            System.out.print("Introduce un número (0 para acabar): ");
                            numero = sc.nextInt();
                            if (numero > 0) {
                                System.out.print("Positivo");
                                positivo++;
                            } else {
                                System.out.print("Negativo");
                                negativo++;
                            }
                
                        }while (numero != 0);
                        negativo = negativo -1;
                        System.out.println("Positivos = "+ positivo);
                        System.out.println("Negativos = "+ negativo);
                        break;

                    case 5:// TIENDITA
                        break;

                    case 6:// AREA Y PERIMETRO
                        double radio=0, lado=0, base=0, altura=0, area=0, perimetro=0, volumen=0;
                        System.out.println("Ingresa una de las opciones");
                        System.out.println("A.- Area y perimetro de un rectangulo");
                        System.out.println("B.- Area y perimetro de un triangulo");
                        System.out.println("C.- Volumen de una esfera");
                        System.out.println("D.- Volumen de un cilidro");
                        operacion = sc.next().charAt(0);

                        switch(operacion){
                            
                            case 'A'://rectangulo
                                System.out.print("Ingrese el lado de su rectangulo: ");
                                lado = sc.nextDouble();
                                System.out.print("\n Ingrese la base de su rectangulo: ");
                                base = sc.nextDouble();

                                if(lado>0 && base>0){
                                    area = base*altura;
                                    perimetro = 2*base+2*lado;
                                    System.out.println("El area de tu rectangulo es: " + area);
                                    System.out.println("El perimetro de tu rectangulo es: "+ perimetro);
                                }else{
                                    System.out.println("Ingrese numeros mayores a 0");
                                }
                                break;

                            case 'B'://triangulo
                                System.out.print("Ingrese la altura de su triangulo: ");
                                altura = sc.nextDouble();
                                System.out.print("\n Ingrese la base de su triangulo: ");
                                base = sc.nextDouble();

                                if(lado>0 && base>0){
                                    area = (base*altura)/2;
                                    perimetro = Math.sqrt(Math.pow(base/2,2)+Math.pow(altura,2));
                                    System.out.println("El area de tu triangulo es: " + area);
                                    System.out.println("El perimetro de tu triangulo es: "+ perimetro);
                                }else{
                                    System.out.println("Ingrese numeros mayores a 0");
                                }
                                
                                break;
                            case 'C'://esfera
                              System.out.println("Ingrese el radio de su esfera ");
                              radio = sc.nextDouble();
                              volumen = (4*Math.PI*Math.pow(radio,3))/3;
                              System.out.println("El volumen de su esfera es: " + volumen);
                                break;
                            case 'D'://cilindro
                              System.out.println("Ingrese el radio de su cilindro: ");
                              radio = sc.nextDouble();
                              System.out.println("Ingrese la altura de su cilindro: ");
                              altura = sc.nextDouble();
                              volumen = Math.PI*Math.pow(radio,2)*altura;
                              System.out.println("El volumen de su cilindro es: " + volumen);
                              break;
                        }

                        break;
                    case 7:// TABLA
                        for (n = 1; n <= 10; n++) {

                            System.out.println(n + " " + (n * 10) + " " + (n * 100) + " " + (n * 1000));
                        }
                        break;

                    case 8:// Factorial
                      double factorial;
                      int nums;
                      System.out.println("Introduce un numero");
                      nums = sc.nextInt();
                      factorial=1;
                      for (int i=nums;i>0;i--){
                        factorial=factorial*i;
                      }
                    System.out.println("El factorial de " + nums + " es: " + factorial);
                        break;

                    case 9:// DIBUJITOS
                      System.out.print("Ingrese valor: ");
		                  int valor = sc.nextInt();
                      for (int fila = 1; fila <= valor; fila++) {
			                  for (int columna = 1; columna <= valor; columna++){
				                  System.out.print(" * ");
                        }
			                    System.out.println();//Salto de línea para pasar a la siguiente FILA
		                    
                      }
                        break;

                    case 10:// FIGURA HUECA
                        System.out.println("Cuadrado Magico, asi kawaii, bien hueco como tu kokoro despues de elle");
                        System.out.println("Inserta el numero de unidades entre el 1 y 20");
                        n = sc.nextInt();
                        // linea superior
                        if (n >= 1 && n <= 20) {
                            for (int i = 0; i < n; i++) {
                                System.out.print(" * ");

                            }
                            System.out.println("");
                            // cuadrado interno
                            for (int j = 0; j < n - 2; j++) {
                                // fila
                                System.out.print(" * ");
                                for (int p = 0; p < n - 2; p++) {
                                    // columna
                                    System.out.print("   ");
                                }
                                System.out.println(" * ");
                            }
                            // linea inferior
                            for (int i = 0; i < n; i++) {
                                System.out.print(" * ");

                            }
                            System.out.println("");

                        } else {
                            System.out.println("Error solo entre el 1 y 20, llegale");
                        }
                        break;

                    case 11://patrones
                      break;
                  case 12://diamante 
                    final int d = 5;
 
                    // imprime la mitad superior
                    for (int m= 1; m <= d; m++){
                      // espacio de impresión
                      for (int e = m; e < d; e++) {
                      System.out.print(' ');
                    }
 
                    // impresión '*'
                    for (int t = 1; t < 2*m; t++) {
                      System.out.print('*');
                    }
 
                    // pasar a la siguiente linea
                    System.out.print(System.lineSeparator());
                  }
 
                  // imprime la mitad inferior
                  for (int m = d - 1; m >= 1; m--){
                    // espacio de impresión
                    for (int e = d; e > m; e--) {
                      System.out.print(' ');
                    }
 
                    // impresión '*'
                    for (int t = 1; t < (m * 2); t++) {
                      System.out.print('*');
                    }
 
                    // pasar a la siguiente linea
                    System.out.print(System.lineSeparator());
                  }
                    break;
                    case 13:// CALCULADORA
                        System.out.println("Ingrese el primer numero");
                        int o = sc.nextInt();
                        System.out.println("Ingrese el segundo numero");
                        int g = sc.nextInt();
                        System.out.println("Ingrese el tipo de operacion ( + - * /)");
                        char ope = sc.next().charAt(0);
                        switch (ope) {
                            case '+':
                                resultado = o + g;
                                System.out.println("La suma es : " + resultado);
                                break;
                            case '-':
                                resultado = o - g;
                                System.out.println("La resta es : " + resultado);
                                break;
                            case '*':
                                resultado = o * g;
                                System.out.println("La multiplicacion es : " + resultado);
                                break;
                            case '/':
                                if (g != 0) {
                                    resultado = o / g;
                                    System.out.println("La division es : " + resultado);
                                } else {
                                    System.out.println("No se puede realizar una division entre cero");
                                }
                                break;
                            default:
                                System.out.println("Operacion no encontrada");
                        }
                        break;

                }
                System.out.println("¿Deseas repetir el progrma? Si lo desea escriba s");
                letras = sc.next().charAt(0);

            } while (letras == 's' || letras == 'S');
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un numero");
            sc.next();
        }
    }
}