
import java.util.Scanner;
import java.io.RandomAccessFile;
import java.util.Random;

public class Boletin3
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        ej9();
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
        int min = 5;
        int max = 25;
        Random random = new Random();

        for(int i = 0;i <= 10;i++)
        {
            int num = random.nextInt((max - min) + 1) + min;
            System.out.println("Número aleatorio entre 5 y 25: " + num);
            if ((num % 5) == 0)
            {
                break;
            }
        }
    }
    public static void ej6()
    {
         int min = 5;
        int max = 25;
        Random random = new Random();
        int num = 1; // num comienza en 1 porque si comienza en 0 no entra en el for debido a que (0 % 5) = 0

        for(int i = 0;i <= 10 && ((num % 5) != 0);i++)
        {
            num = random.nextInt((max - min) + 1) + min;
            System.out.println("Número aleatorio entre 5 y 25: " + num);
        }
    }
    public static void ej7()//Al introducir 1 o 2 como valor de altura se rompe 
    {
        System.out.print("Introduzca la cantidad de alturas que va a facilitar: ");
        int numAlturas = Integer.parseInt(sc.nextLine());

        int suma = 0;
        int promedio;

        for(int i = 1;i < numAlturas; i++)
        {
            System.out.printf("Introduce la altura número %d: ", (i +1));
            suma += numAlturas = Integer.parseInt(sc.nextLine());
        }
    }
    public static void ej8()
    {
        int num = 0;
        int suma = 0;
        int contador = 0;

        do 
        { 
            System.out.print("Introduce un numero, se sumarán hasta que introduzcas el valor 999: ");
            num = Integer.parseInt(sc.nextLine());
            suma += num;
            contador++;
        } while (num != 999);
        System.out.printf("La suma total es %d\n", suma);
        if(contador > 0)
        {
            System.out.println("La cantidad de sumas que se han realizado es positiva");
        }
    }
    public static void ej9()
    {

    }
} 