/*ELABORA UN PROGRAMA PARA CONVERTIR UN NÚMERO DECIMAL N DADO POR TECLADO A BINARIO.  */

import java.util.*;
class Binario{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rosas Matinez Edgar Cain 3IV8");
        int decimal;
        System.out.println("Ingrese su numero");
        decimal = sc.nextInt();

        String binario = Integer.toBinaryString(decimal);
        System.out.println(binario);
    }
}
