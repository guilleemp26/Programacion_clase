import java.util.Scanner;

public class Actividad4 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        String frase = leerFrase();
        System.out.println(contarVocales(frase));
    }    
    public static String leerFrase()
    {
        System.out.print("Introduzca una frase para saber cuantas vocales contiene: ");
        return sc.nextLine();
    }
    public static int contarVocales(String frase)
    {
        int contadorVocales = 0;

        for(int i = 0; i < frase.length(); i++)
        {
            char letra = frase.charAt(i);

            if(letra == 'a' || letra == 'e' && letra == 'i' || letra == 'o' || letra == 'u')
            {
                contadorVocales++;
            }
            if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')
            {
                contadorVocales++;
            }
        }
        return contadorVocales;
    }
}
