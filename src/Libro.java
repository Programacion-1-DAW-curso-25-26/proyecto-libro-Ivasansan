public class Libro {
    // ATRIBUTOS
    // Creamos los atributos
    public String titulo;
    public String autor;
    public int numPags;
    public int valoracion;

    // METODOS
    // Creamos el metodo mostrarInformacion
    public void mostrarInfo(){
        System.out.println("El titulo del libro es --> " + titulo);
        System.out.println("El autor del libro es --> >" + autor);
        System.out.println("El libro tiene " + numPags + " páginas");
        System.out.println("El libro tiene " + valoracion + " de valoración");
    }
}


