import java.util.HashMap;
import java.util.Scanner;

public class EjercicioHashmap 
{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        HashMap<String, Integer> palabras = new HashMap<>();
        String palabra;
        int valor = 1;

        for(int i = 0; i < 5; i++)
        {
            palabra = leerPalabra();
            if(!palabras.containsKey(palabra))
            {
                palabras.put(palabra, valor);
            }
            else
            {
                palabras.put(palabra, valor + 1);
            }
            
        }
        
        palabras.forEach((k, v) -> 
        {
           System.out.println(k + " - " + v);
        });
    }
    public static String leerPalabra()
    {
        System.out.print("Introduce una palabra: ");
        return sc.nextLine();
    }
}
