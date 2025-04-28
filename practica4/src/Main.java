public class Main {
    public static void main(String[] args) {

        // Instanciando un objeto usando el constructor sin parámetros
        Libro libro1 = new Libro();

        // Instanciando un objeto usando el constructor con parámetros
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 471);

        // Llamo al método
        libro1.imprimirInfo();
        libro2.imprimirInfo();
    }
}
