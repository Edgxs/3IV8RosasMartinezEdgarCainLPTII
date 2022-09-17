/*ELABORA UN PROGRAMA DONDE SE INTRODUCE UNA SERIE DE 
NÚMEROS DEBERÁ CONTAR CUANTOS SON POSITIVOS  Y CUANTOS NEGATIVOS.  */

import java.util.Scanner;
class EnterosNegativos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rosas Matinez Edgar Cain 3IV8");
        int numero, positivo, negativo;
        positivo = 0;
        negativo = 0;

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
    } 
} 
