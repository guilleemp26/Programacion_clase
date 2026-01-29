public class Biblioteca 
{
    private String nombre;
    private Libro[] libros;
    private int contadorLibros = 0;
    
    public Biblioteca(String nombre, int maxLibros)
    {
        this.nombre = nombre;
        libros = new Libro[maxLibros];
    }

    public void agregarLibro(Libro libro)
    {
        if (contadorLibros < libros.length)
        {
            this.libros[contadorLibros] = libro;
            contadorLibros++;
            System.out.println("Se ha añadido el libro " + libro.getTitulo() + " a la biblioteca");
        }
        else
        {
            System.out.println("No caben más libros en la biblioteca");
        }
    }

    public void mostrarLibros()
    {
        for (int i = 0; i < contadorLibros; i++)
        {
            System.out.println("Libro " + (i + 1) + ": " + libros[i].getTitulo());
        }
    }
}
