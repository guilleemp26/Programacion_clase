import java.util.Scanner;
import java.util.regex.*;

public class UD3B3
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        ej1();
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
        
    }
}