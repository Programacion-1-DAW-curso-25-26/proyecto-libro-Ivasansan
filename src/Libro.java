public class Libro {
    // ATRIBUTOS
    // Ponemos los atributos privados
    private String titulo;
    private String autor;
    private int numPags;
    private int valoracion;

    // METODOS
    // Arreglamos un error en de sintaxis en el apartado de autor
    public void mostrarInfo(){
        System.out.println("El titulo del libro es --> " + titulo);
        System.out.println("El autor del libro es -->" + autor);
        System.out.println("El libro tiene " + numPags + " páginas");
        System.out.println("El libro tiene " + valoracion + " de valoración");
    }
    // GETTERS Y SETTERS
    // Creamos los getters y los setters

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


