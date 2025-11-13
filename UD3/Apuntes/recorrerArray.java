import java.util.Scanner;

public class recorrerArray 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Introduce el tamaño que desea para la lista: ");
        int tamañoLista = Integer.parseInt(sc.nextLine());

        recorrerArray(tamañoLista);
    }    
    public static void recorrerArray(int tamañoLista)
    {
        int[] lista = new int[tamañoLista];
        
        for(int i = 0;i < tamañoLista;i++)
        {
            System.out.printf("Introduzca el valor número %d de la lista: ", i +1);
            lista[i] = Integer.parseInt(sc.nextLine());
        }
        for(int i = 0;i < tamañoLista;i++)
        {
            System.out.print(lista[i] + " ");
        }
        System.out.println("");
    }
}
