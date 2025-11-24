import java.util.Scanner;

public class Actividad3 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int num = leerNumero();
        boolean esPrimo = esPrimo(num);
        mostrarResultado(esPrimo, num);
    }
    public static int leerNumero()
    {
        System.out.print("Introduzca un número para saber si es un número primo: ");
        return Integer.parseInt(sc.nextLine());
    }
    public static boolean esPrimo(int num)
    {
        boolean esPrimo = false;
        for(int i = 2; i < num; i++)
        {
            if(num % 2 == 0)
            {
                esPrimo = false;
            }
            else
            {
                esPrimo = true;
            }
        }
        return esPrimo;
    }    
    public static void mostrarResultado(boolean esPrimo, int num)
    {
        if(esPrimo)
        {
            System.out.printf("El número %d es primo\n", num);
        }
        else
        {
            System.out.printf("El número %d no es primo\n", num);
        }
    }
}
