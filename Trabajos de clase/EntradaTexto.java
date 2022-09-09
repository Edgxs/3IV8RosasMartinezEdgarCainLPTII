class EntradadeTexto {
    // los limites de la clase
    // toda clase debe tener un metodo principal mediante el cual podemos introducir

    // tipo de dato1
    public static void main(String[] args) {

        String nombre;

        // el ; es el fin de linea

        // instancia
        System.out.println("Por + favo introduce tu nombre: ");

        // vamos a obtener el nombre del usuario
        nombre = System.console().readLine();
        System.out.println("Por + favo introduce tu edad: ");
        int edad = Integer.parseInt(System.console().readLine());

        System.out.println("Hola " + nombre + " bienvenido a tu programa");
        System.out.println("Tu edad es: "+ edad);
    }
}