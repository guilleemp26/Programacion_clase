import java.util.Scanner;

public class Main 
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        
        Actividad2();
    }
    public static void Actividad1()
    {
        Temperatura temperatura = new Temperatura(leerTemperatura());
        temperatura.mostrarConversiones();
    }
    public static double leerTemperatura()
    {
        System.out.print("Introduce una temperatura en grados Celsius: ");
        return Double.parseDouble(sc.nextLine());
    }

    public static void Actividad2()
    {
        CuentaBancaria cuenta1 = new CuentaBancaria("Guillem", "111222333");

        cuenta1.depositar(200);
        
        
    }
    
}
