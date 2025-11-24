import java.util.Scanner;

public class Ejercicio1
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int opcion = 0;
        do
        {
            mostrarMenu();
            System.out.print("Introduzca la opción deseada: ");
            opcion = Integer.parseInt(sc.nextLine());
            
        }while(opcion != 0 && opcion != 1 && opcion != 2 && opcion != 3);
            
        sc.close();
    }
    public static void mostrarMenu()
    {
        System.out.print("\n" +
                         "----- Menú principal -----\n" +
                         "1. Comprobación de año bisiesto\n" +
                         "2. Búsqueda en array\n" +
                         "3. Cálculo de áreas\n" +
                         "\n" +
                         "0. Salir\n" +
                         "\n" +
                         "Seleccione una opción: "
                        );
    }
    public static void opcion1()
    {
        
    }
}