import java.util.Scanner;

public class ParImpar 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Introduce un valor para saber si es par o impar: ");
        int num = Integer.parseInt(sc.nextLine());
        boolean comprobacion = comprobarPar(num);

        if(comprobacion)
        {
            System.out.println("El número introducido es par");
        }
        else
        {
            System.out.println("El número introducido es impar");
        }
    }   
    public static boolean comprobarPar(int num)
    {
        if((num % 2 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    } 
}
