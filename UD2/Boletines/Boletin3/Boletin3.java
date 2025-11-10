
import java.util.Scanner;

public class UD2B3
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        ej4();
    }
    public static void ej1()
    {
        System.out.print("Introduce un número: ");
        int num = Integer.parseInt(sc.nextLine()); 
        int suma = 0;

        for(int i = 0; i <= 20;i++)
        {
            suma += i;
            if(suma >= num)
            {
                break;
            }
        }   
        System.out.println(suma);
    }
    public static void ej2()
    {
        System.out.print("Introduce un número: ");
        int num = Integer.parseInt(sc.nextLine()); 
        int suma = 0;

        for(int i = 0; suma <= num && i <= 20;i++)
        {
            suma += i;
        }   
        System.out.println(suma);
    }
    public static void ej3()
    {
        System.out.print("Introduce un número: ");
        int num = Integer.parseInt(sc.nextLine());

        for(int i = 0; i <= 50;i++)
        {
            if((i % num) == 0)
            {
                continue;
            }
            else
            {
                System.out.println(i);
            }
        }
    }
    public static void ej4()
    {
        System.out.print("Introduce un número: ");
        int num = Integer.parseInt(sc.nextLine());

        for(int i = 0; i <= 50;i++)
        {
            if ((i % num) != 0)
            {
                System.out.println(i);
            }
        }
    }
    public static void ej5()
    {
        
    }
}