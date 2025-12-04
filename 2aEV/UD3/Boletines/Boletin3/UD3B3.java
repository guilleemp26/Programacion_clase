import java.util.Scanner;
import java.util.regex.*;

public class UD3B3
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        ej7();
    }   
    public static void ej1()
    {
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(frase);
        
        while(m.find())
        {
            System.out.println("Número encontrado: " + m.group());
        }
    } 
    public static void ej2()
    {
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        Pattern p = Pattern.compile("hola|hi|hello");
        Matcher m = p.matcher(frase);

        while (m.find()) 
        { 
            System.out.println("Palabra encontrada: " + m.group());
        }
    }
    public static void ej3()
    {
        System.out.print("Introduce una cadena de caracteres: ");
        String frase = sc.nextLine();
        
        String patron = "^[A-Za-z]+$";

        boolean valido = Pattern.matches(patron, frase);
        

        System.out.println("¿La cadena introducida solo contiene letras? " + valido);
    }
    public static void ej4()
    {
        System.out.print("Introduce una cadena de caracteres: ");
        String frase = sc.nextLine();

        String patron = "^\\d+";

        boolean valido = Pattern.matches(patron, frase);

        System.out.println(valido);
    }
    public static void ej5()//no acabado
    {
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        Pattern p = Pattern.compile("\\b[A-Za-z]{4}\\b");
        Matcher m = p.matcher(frase);

        while(m.find())
        {
            System.out.println("Palabra de 4 letras encontrada: " + m.group());
        }
    }
    public static void ej6()
    {
        System.out.print("Introduce un número de teléfono: ");
        String num = sc.nextLine();

        String patron = "^\\d{3}[ ]?[-]?\\d{3}[ ]?[-]?\\d{3}$";
        boolean valido = Pattern.matches(patron, num);

        System.out.println(valido);
    }
    public static void ej7()
    {
        System.out.print("Introduce una contraseña: ");
        String num = sc.nextLine();

        String patron = "[A-Za-z0-9]{8,}";
        boolean valido = Pattern.matches(patron, num);

        System.out.println(valido);
    }
    public static void ej8()
    {
        System.out.print("Introduce una fecha: ");
        String fecha = sc.nextLine();

        Pattern p = Pattern.compile("");
        Matcher m = p.matcher(fecha);
    }
}