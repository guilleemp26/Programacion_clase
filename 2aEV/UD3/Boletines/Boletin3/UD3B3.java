import java.util.Scanner;
import java.util.regex.*;

public class UD3B3
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        ej16();
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

        Pattern p = Pattern.compile("\\b\\d{2}[/-]?\\d{2}[/-]?\\d{4}\\b");
        Matcher m = p.matcher(fecha);

        while(m.find())
        {
            System.out.println("Fechas encontradas: " + m.group());
        }
    }
    public static void ej9()
    {
        System.out.print("Ingresa tu correo electrónico: ");
        String correo = sc.nextLine();

        String patron = "^[A-Za-z\\d]+[@][A-Za-z]+[.][A-Za-z]+$";
        boolean valido = Pattern.matches(patron, correo);

        System.out.println(valido);
    }
    public static void ej10()
    {
        System.out.print("Ingresa tu nombre completo: ");
        String correo = sc.nextLine();

        String patron = "\\b[A-ZÁÉÍÓÚ][a-záéíóúñ]+[ ][A-ZÁÉÍÓÚ][a-záéíóúñ]+[ ][A-ZÁÉÍÓÚ][a-záéíóúñ]+\\b";
        boolean valido = Pattern.matches(patron, correo);

        System.out.println(valido);
    }
    public static void ej11()
    {
        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine();

        Pattern p = Pattern.compile("([A-Za-z])\1{2,}");
        Matcher m = p.matcher(frase);

        while(m.find())
        {
            System.out.println("Letras tres veces repetidas encontradas: " + m.group());
        }
    }
    public static void ej12()
    {
        System.out.print("Ingresa un número hexadecimal: ");
        String num = sc.nextLine();

        String patron = "^[#][A-Za-z0-9]{6}$";
        boolean valido = Pattern.matches(patron, num);

        System.out.println(valido);
    }
    public static void ej13()
    {
        System.out.print("Ingresa una contraseña fuerte: ");
        String passwd = sc.nextLine();

        String patron = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{8,}$";
        boolean valido = Pattern.matches(patron, passwd);

        System.out.println(valido);
    }
    public static void ej14()
    {
        
    } 
    public static void ej16()
    {
        System.out.print("Introduce una IP con formato IPv4: ");
        String ipLeida = sc.nextLine();
        
        String patron = "^[\\d]{1,3}.[\\d]{1,3}.[\\d]{1,3}.[\\d]{1,3}$";
        boolean valido = Pattern.matches(patron, ipLeida);

        System.out.println(valido);
    }
}