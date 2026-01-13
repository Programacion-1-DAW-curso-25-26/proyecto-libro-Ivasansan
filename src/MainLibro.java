public class MainLibro {
    public static void main(String[] args) {
       // Creamos los 2 objetos y les asignamos atributos
        // LIBRO 1
        Libro libro1 = new Libro();
        libro1.titulo = "No entiendo nada de java";
        libro1.autor = "Adrián";
        libro1.numPags = 124;
        libro1.valoracion = 5;
        libro1.mostrarInfo();

        // LIBRO 2
        Libro libro2 = new Libro();
        libro2.titulo = "Soy java";
        libro2.autor = "Iván Sanz";
        libro2.numPags = 400;
        libro2.valoracion = 10;
        libro2.mostrarInfo();

    }
}
