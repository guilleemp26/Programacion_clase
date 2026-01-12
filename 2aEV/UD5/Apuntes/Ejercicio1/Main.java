import java.util.Scanner;

public class Main 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        double temperaturaLeida = leerTemperatura();

        Temperatura temperatura = new Temperatura(temperaturaLeida);

        temperatura.mostrarResultados();
    }

    public static double leerTemperatura()
    {
        System.out.print("Introduce una temperatura en Celsius: ");
        return Double.parseDouble(sc.nextLine());
    }
}
