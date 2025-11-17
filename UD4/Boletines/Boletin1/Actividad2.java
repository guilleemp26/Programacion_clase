import java.util.Scanner;

public class Actividad2 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("");
    }
    public static double[] leerNotas()
    {
        System.out.print("¿Cuantos alumnos quiere evaluar?: ");
        int alumnos = Integer.parseInt(sc.nextLine());
        double[] notas = new double[alumnos];

        for(int i = 0;i <= alumnos;i++)
        {
            System.out.printf("Introduce la nota número %d: ", i + 1);
            notas[i] = Double.parseDouble(sc.nextLine());
        }
        return notas;
    }

}
