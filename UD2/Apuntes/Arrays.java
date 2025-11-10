
import java.util.Scanner;


public class Arrays
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        

        System.out.print("Introduce la cantidad de filas que va a tener la lista: ");
        int filas = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce la cantidad de columnas que va a tener la lista: ");
        int columnas = Integer.parseInt(sc.nextLine());


        int[][] lista = new int[filas][columnas]; 

        for (int i = 0; i < lista.length; i++)
        {
            for (int j = 0; j < lista[i].length; j++)
            {
                System.out.printf("Introduce el valor de %d, %d: ", (i+1), (j+1));
                lista[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        for (int i = 0; i < lista.length; i++)
        {
            for (int j = 0; j < lista[i].length; j++)
            {
                System.out.print(lista[i][j] + "\t");
            }
            System.out.println("");
        }
        int total = 0;
        for (int i = 0; i < lista.length; i++)
        {
            for (int j = 0; j < lista[i].length; j++)
            {
                total =  total + lista[i][j];
            }
        }
        System.out.printf("El total de todos los números que conforman la lista es: %d\n", total);
    }
}