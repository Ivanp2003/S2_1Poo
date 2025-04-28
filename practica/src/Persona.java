//Creo la clase Persona con sus atributos
public class Persona {
    String nombreApellido;
    int edad;
    String numeroCedula;

    // Creo el constructor
    Persona(String nombreApellido, int edad, String numeroCedula) {
        this.nombreApellido = nombreApellido;
        this.edad = edad;
        this.numeroCedula = numeroCedula;
    }

    //Met0odo
    public void mostrarDatos(){
        System.out.println("Hola, me llamo "+ nombreApellido +" tengo "+edad+" años.\n"+"Mi número de cédula es: "+numeroCedula);
    }
}
