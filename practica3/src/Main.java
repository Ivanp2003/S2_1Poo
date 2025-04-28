public class Main {
    public static void main(String[] args) {

        //Cre las instancias
        Pelota pelota = new Pelota("rojo","grande");
        Pelota pelota1 = new Pelota("azul","mediano");
        Pelota pelota2 = new Pelota("amarillo","pequeño");


        //Llamo a los métodos
        pelota.mostrarDetalles();
        pelota1.mostrarDetalles();
        pelota2.mostrarDetalles();
    }
}

