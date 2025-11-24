import java.util.Scanner;

public class Actividad2 
{
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("¿Cuantas asignaturas tiene el curso?: ");
        int alumnos = Integer.parseInt(sc.nextLine());
        double[] notas = leerNotas(alumnos);
        double promedio = calcularPromedio(alumnos, notas);
        int aprobados = contarAprobados(notas);

        mostrarInforme(alumnos, promedio, aprobados);
    }
    public static double[] leerNotas(int alumnos)
    {
        
        double[] notas = new double[alumnos];

        for(int i = 0;i < alumnos;i++)
        {
            System.out.printf("Introduce la nota número %d: ", i + 1);
            notas[i] = Double.parseDouble(sc.nextLine());
        }
        return notas;
    }
    public static double calcularPromedio(int alumnos, double[] notas)
    {
        double  suma = 0;

        for(int i = 0; i < alumnos; i++)
        {
            suma += notas[i];
        }
        double notaaMedia = (suma / alumnos);
        return notaaMedia;
    }
    public static int contarAprobados(double[] notas)
    {
        int contadorAprobados = 0;

        for(int i = 0; i < notas.length; i++)
        {
            if(notas[i] >= 5)
            {
                contadorAprobados++;
            }
        }
        return contadorAprobados;
    }
    public static void mostrarInforme(int alumnos, double notaaMedia, int contadorAprobados)
    {
        System.out.printf("\n" + 
                         "*****************************   \n" + 
                         "                                \n" + 
                         "     Informe de alumnos         \n" + 
                         "                                \n" + 
                         "*****************************   \n" +
                         "                                \n" + 
                         "1. Asignaturas impartidas: %d   \n" + 
                         "2. Asignaturas aprobadas: %d    \n" +
                         "3. Nota media: %.2f             \n", 
                         alumnos, contadorAprobados, notaaMedia
                        );
    }
}
