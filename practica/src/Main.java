public class Main {
    public static void main(String[] args) {

        //Instancio el objeto
        Persona persona = new Persona("Ivan Andres Panchi Chávez",21,"175476899-0");
        Persona persona1 = new Persona("Camila Perez",20,"125678941-9");

        //Llamo al método
        persona.mostrarDatos();
        persona1.mostrarDatos();
    }
}
