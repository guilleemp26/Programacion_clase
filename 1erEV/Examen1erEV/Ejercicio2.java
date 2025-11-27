import java.util.Scanner;

public class Ejercicio2 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println(leerNumeroImpar());
    }
    public static int leerNumeroImpar()
    {
        int numIntroducido;

        do
        {
            System.out.print("Introduzca un número impar: ");
            numIntroducido = Integer.parseInt(sc.nextLine());

        }while(!validador(numIntroducido));

        return numIntroducido;
    }
    public static boolean validador(int numIntroducido)
    {
        if(numIntroducido % 2 == 0)
        {
            System.out.println("ha introducido un número par");
            return false;
        }
        else
        {
            return true;
        }
    }
}
