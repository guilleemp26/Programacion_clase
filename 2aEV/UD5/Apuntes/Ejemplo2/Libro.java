public class Libro 
{
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public static int totalLibros = 0;

    // Constructor completo
    public Libro(String titulo, String autor, int añoPublicacion) 
    {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        totalLibros++;
    }

    // Constructor sin año de publicación
    public Libro(String titulo, String autor) 
    {
        this(titulo, autor, 0); // Llamada al constructor completo
    }

    // Constructor solo con título
    public Libro(String titulo) 
    {
        this(titulo, "Autor desconocido", 0); // Llamada al constructor completo
    }

    // Métodos
    public void mostrarInfo() 
    {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + (autor.equals("Autor desconocido") ? "Desconocido" : autor));
        System.out.println("Año de publicación: " + (añoPublicacion == 0 ? "Desconocido" : añoPublicacion));
    }

    public static void mostrarTotalLibros() 
    {
        System.out.println("Total de libros en la biblioteca: " + totalLibros);
    }
}
