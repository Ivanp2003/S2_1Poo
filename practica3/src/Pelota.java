public class Pelota {
    //Atributos
    String color;
    String tamaño;

    //Creo al constructor
    Pelota(String color, String tamaño) {
        this.color = color;
        this.tamaño = tamaño;
    }
    //Creo el método
    public void mostrarDetalles(){
        System.out.println("Pelota "+color +" y "+tamaño);
    }

}
