public class Libro {
    // ATRIBUTOS
    private String titulo;
    private String autor;
    private int numPags;
    private int valoracion;

    // METODOS
    public void mostrarInfo() {
        System.out.println("El titulo del libro es --> " + titulo);
        System.out.println("El autor del libro es --> " + autor);
        System.out.println("El libro tiene " + numPags + " páginas");
        System.out.println("El libro tiene " + valoracion + " de valoración");
    }

    // CONSTRUCTOR
    // Creamos el constructor
    public Libro(String titulo, String autor, int numPags, int valoracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPags = numPags;
        this.valoracion = valoracion;
    }

    // GETTERS Y SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPags() {
        return numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }
}


