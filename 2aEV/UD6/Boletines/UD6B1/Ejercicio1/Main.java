import java.util.Scanner;

public class Main 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        Libro libro1 = new Libro(leerNombreLibro());
        Libro libro2 = new Libro(leerNombreLibro());
        Libro libro3 = new Libro(leerNombreLibro());

        Biblioteca biblioteca = new Biblioteca(leerNombreBiblioteca(), leerTamanyoLibreria());


        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        biblioteca.mostrarLibros();
    }


    public static String leerNombreLibro()
    {
        System.out.print("Introduce el nombre del libro: ");
        return sc.nextLine(); 
    }
    public static int leerTamanyoLibreria()
    {
        System.out.print("Introduce el tamaño de la biblioteca: ");
        return Integer.parseInt(sc.nextLine());
    }
    public static String leerNombreBiblioteca()
    {
        System.out.print("Introduce el nombre de la biblioteca: ");
        return sc.nextLine();
    }
}
