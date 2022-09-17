/*El programa debe solicitar la edad del usuario. si esta es mayor de 65, 
al precio del abono se le aplica un descuento del 40%. Si la edad es menor que 21, 
se pregunta al usuario si sus padres son socios. Si la respueta es afirmativa, 
se les aplica un descuento del 45%; En caso contrario, se les aplica 25%*/

import java.util.*;
class abonos{
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Rosas Matinez Edgar Cain 3IV8");
		int edad;
		double precio,total;
		String respuesta, afirmativa;
		

		System.out.println("Ingrese su edad");
		edad = sca.nextInt();
		System.out.println("Ingrese el precio de su articulo");
		precio = sca.nextDouble();
		
		

		if(edad>65){
			total = precio * 0.60;
			System.out.println("El precio de su articulo es: "+total);
		}else{
			if(edad < 21){
				System.out.println("Tus padres son socios?");
				sca.nextLine();
				afirmativa = "si";
				respuesta = sca.nextLine();
				if (respuesta.equalsIgnoreCase(afirmativa) == true) {
					total = precio * 0.55;
					System.out.println("El precio de su articulo es: "+total);
					
				} else {
					total = precio *0.75;
					System.out.println("El precio de su articulo es: "+total);
					
				}
			}
			else{
				System.out.println("El precio de su articulo es: "+precio);
			}
		}
	}
}