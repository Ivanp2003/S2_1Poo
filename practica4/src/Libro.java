class Libro {
    // Atributos
    String titulo;
    String autor;
    int paginas;
    // Constructor sin parámetros
    Libro() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.paginas = 0;
    }
    // Constructor con parámetros
    Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    // Creo el método
    public void imprimirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("------------------------");
    }
}
