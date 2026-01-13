public class MainLibro {
    public static void main(String[] args) {
        // Ponemos lo puesto en los sets dentro del paréntesis de los objetos
        // LIBRO 1
        Libro libro1 = new Libro("No entiendo nada de java", "Adrián", 124, 5);
        libro1.mostrarInfo();

        // LIBRO 2
        Libro libro2 = new Libro("Soy java", "Iván Sanz", 400, 10);
        libro2.mostrarInfo();

    }
}
