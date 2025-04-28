public class Coche {
    String marca;
    String modelo;
    int año;

    Coche() { //Constructor sin parámetros
        this.marca = "Hyundai";
        this.modelo = "Sonata";
        this.año = 2017;
    }

    Coche(String marca, String modelo, int año) {//Constructor con parámetros
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }


    //Método

    public void mostrarinfo() {
        System.out.println("Resumen:\n" + marca + " " + modelo + " " + año+"\n");
    }

}
