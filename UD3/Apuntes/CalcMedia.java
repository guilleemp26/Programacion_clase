import java.util.Scanner;


public class CalcMedia
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Introduzca la cantidad de alturas que va a facilitar: ");
        int numAlturas = Integer.parseInt(sc.nextLine());

        System.out.printf("La altura promedio es %d\n", mediaAltura(numAlturas));

    }
    public static int mediaAltura(int numAlturas)
    {
        int suma = 0;
        int promedio = 0;

        for(int i = 1;i <= numAlturas;i++)
        {
            System.out.printf("Introduce la altura número %d: ", (i));
            suma += Integer.parseInt(sc.nextLine());
        }
        promedio = suma / numAlturas;
        return promedio;
    }
}