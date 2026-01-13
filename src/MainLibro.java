public class MainLibro {
    public static void main(String[] args) {
        // Ponemos los sets
        // LIBRO 1
        Libro libro1 = new Libro();
        libro1.setTitulo("No entiendo nada de java");
        libro1.setAutor("Adrián");
        libro1.setNumPags(124);
        libro1.setValoracion(5);
        libro1.mostrarInfo();

        // LIBRO 2
        Libro libro2 = new Libro();
        libro2.setTitulo("Soy java");
        libro2.setAutor("Iván Sanz");
        libro2.setNumPags(400);
        libro2.setValoracion(10);
        libro2.mostrarInfo();

    }
}
