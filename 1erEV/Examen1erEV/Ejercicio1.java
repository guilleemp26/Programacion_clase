import java.util.Random;
import java.util.Scanner;

public class Ejercicio1
{
    public static Scanner sc = new Scanner(System.in);
    public static final int minEdad = 1900;
    public static final int maxEdad = 2025;

    public static void main(String[] args) 
    {
        int opcion = mostrarMenu();

        switch (opcion) {
            case 1:
                opcion1();
                break;
            case 2:
                opcion2();
                break;
            default:
                break;
        }

        sc.close();
    }
    public static int mostrarMenu()
    {
        

        int opcion = 0;
        do
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

            System.out.print("Introduzca la opción deseada: ");
            opcion = Integer.parseInt(sc.nextLine());
            
        }while(opcion != 0 && opcion != 1 && opcion != 2 && opcion != 3);
        
        return opcion;
    }
    public static void opcion1()
    {
        boolean anyoCorrecto;
        int anyoIntroducido;
        boolean esBisiesto;
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        do
        {
            System.out.print("Introduce tu año de nacimiento: ");
            anyoIntroducido = Integer.parseInt(sc.nextLine());
            anyoCorrecto = validarAnyo(anyoIntroducido);
        }while(!anyoCorrecto);
        
        esBisiesto = esBisiesto(anyoIntroducido);

        imprimirNombreNacimiento(nombre, anyoIntroducido, esBisiesto);
    }
    public static boolean validarAnyo(int anyoIntroducido)
    {
        if(anyoIntroducido >= minEdad && anyoIntroducido <= maxEdad)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean esBisiesto(int anyoIntroducido)
    {
        if(anyoIntroducido % 4 == 0 || anyoIntroducido % 100 == 0 && anyoIntroducido % 400 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void imprimirNombreNacimiento(String nombre, int anyoIntroducidom, boolean esBisiesto)
    {
        if(esBisiesto)
        {
            System.out.printf("%s, has nacido en %d, que es unaño bisiesto\n", nombre, anyoIntroducidom);
        }
        else
        {
            System.out.printf("%s, has nacido en %d, que es no unaño bisiesto\n", nombre, anyoIntroducidom);
        }
    }
    public static void opcion2()
    {
        System.out.print("Introduce el tamaño de la lista: ");
        int tamanyoLista = Integer.parseInt(sc.nextLine());

        int[] lista = crearArrayRango(tamanyoLista);
    }
    public static int[] crearArrayRango(int tamanyoLista)
    {
        Random random = new Random();
        int[] lista = new int[tamanyoLista];

        for(int i = 0; i < lista.length; i++)
        {
            lista[i] = random.nextInt(20 - 10 + 1) + 10;
        }
        for(int i = 0; i < lista.length; i++)
        {
            System.out.println(lista[i]);
        }
        return lista;
    }
    public static int buscarPrimerIndice(int[] lista)
    {
        System.out.print("Introduce un número a buscar el la lista: ");
        int numIntroducido = Integer.parseInt(sc.nextLine());
        int posNum = 0;

        for(int i = 0; i < lista.length; i++)
        {
            if(lista[i] == numIntroducido)
            {
                posNum = i;
            }
        }
        return posNum;
    }
}