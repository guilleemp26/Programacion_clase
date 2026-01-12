public class Main 
{
    public static void main(String[] args) 
    {
        // Usando diferentes constructores
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry");
        Libro libro3 = new Libro("Don Quijote de la Mancha");

        // Libro libro4 = new Libro();  ERROR
        // En Java, cuando no defines explícitamente ningún constructor en una clase, el compilador proporciona automáticamente 
        // un constructor por defecto sin parámetros. Sin embargo, en nuestro caso, hemos definido constructores explícitamente, 
        // lo que significa que el constructor por defecto no se crea automáticamente.

        // Mostrando información de los libros
        System.out.println("Información del libro 1:");
        libro1.mostrarInfo();

        System.out.println("\nInformación del libro 2:");
        libro2.mostrarInfo();

        System.out.println("\nInformación del libro 3:");
        libro3.mostrarInfo();

        // Usando método estático
        Libro.mostrarTotalLibros();
    }
}