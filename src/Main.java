public  class Main {
    public static void main(String[] args) {
        mostrarLibro("Nana vol. 1", "Ai Yazawa", 176);
        System.out.println(duracionMediaCanciones(120,67,240));
        System.out.println(tiempoRestanteAlquiler(4,12));
        calcularImpuestoYDescuento(22, 11, 25);
        System.out.println(porcentajeVideojuegos(270, 880) + "%");
    }
    //Ej1
    static void mostrarLibro(String titulo, String autor, int numPag) { //Como la función no me devuelve nada (no hay return) indico que es void
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPag);
    }
    //Ej2
    static double duracionMediaCanciones(int segCancion1, int segCancion2, int segCancion3) {
        return (double)(segCancion1 + segCancion2 + segCancion3)/3; //Sumo y divido entre 3 para obtener la media y hago cast a double para que el resultado sea decimal

    }
    //Ej3
    static int tiempoRestanteAlquiler(int semanasTotales, int diasTranscurridos) {
        return semanasTotales*7 - diasTranscurridos; //Convierto las semanas en días multiplicando por 7 y resto los días transcurridos para obtener los restantes
    }
    //Ej4
    static void calcularImpuestoYDescuento(double precio, int impuesto, int descuento) {
        //Calculo precio con impuesto y con descuento
        double precioImpuesto = precio + precio * impuesto / 100;
        double precioDescuento = precioImpuesto - precioImpuesto * descuento / 100;
        //Imprimo por consola concatenando texto con las variables
        System.out.println("Precio original: " + precio + "€");
        System.out.println("Impuesto: " + impuesto + "%");
        System.out.println("Precio con impuesto: " + precioImpuesto + "€");
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Precio con descuento: " + precioDescuento + "€");
    }
    //Ej5
    static double porcentajeVideojuegos(int juegos, int totalArticulos) {
        return (double) juegos / totalArticulos * 100; //Hago cast a double para obtener un número decimal y para obtener el porcentaje divido el número de juegos entre el número total de artículos y multiplico por 100
    }
}