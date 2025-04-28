public class Main {
    public static void main(String[] args) {

        //Instancias de la clase Coche sin y con parámetros
        Coche coche1 = new Coche();

        Coche coche2 = new Coche("Toyota","Fortuner",2016);

        //Llamo al método
        coche1.mostrarinfo();
        coche2.mostrarinfo();
    }
}
