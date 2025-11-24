import java.util.Scanner;

public class Actividad1
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        
        double temperaturaInicial = leerTemperatura();
        double farenheit = celsiusAFarenheit(temperaturaInicial);
        double kelvin = celsiusAKelvin(temperaturaInicial);
        mostrarConversiones(farenheit, kelvin);

        sc.close();
    }
    public static double leerTemperatura()
    {
        System.out.print("Introduzca una temperatura inicial: ");
        double temperaturaInicial = Double.parseDouble(sc.nextLine());

        return temperaturaInicial;
    }
    public static double celsiusAFarenheit(double temperaturaInicial)
    {
        return (temperaturaInicial * 1.8) + 32;
    }
    public static double celsiusAKelvin(double temperaturaInicial)
    {
        return temperaturaInicial + 273.15;
    }
    public static void mostrarConversiones(double  farenheit, double kelvin)
    {
        System.out.printf("Farenheit: %.2f\n", farenheit);
        System.out.printf("Kelvin: %.2f\n", kelvin);
    }
}