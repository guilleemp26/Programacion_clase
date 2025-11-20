import java.util.Scanner;

public class Actividad5 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Introduzca la cantidad de valores que va a contener la lista: ");
        int numValores = Integer.parseInt(sc.nextLine());

        double[] lista = leerArray(numValores);
        double mayor = maximo(lista);
        double minimo = minimo(lista);
        double promedio = promedio(lista);

        mostrarResultados(mayor, minimo, promedio);
    }
    public static double [] leerArray(int numValores)
    {
        double[] lista = new double[numValores];

        for(int i = 0; i < numValores; i++)
        {
            System.out.printf("Introduce el valor número %d de la lista: ", i + 1);
            lista[i] = Double.parseDouble(sc.nextLine());
        }    
        return lista;
    }
    public static double maximo(double[] lista)
    {
        double mayor = lista[0];

        for(int i = 1; i < lista.length; i++)
        {
          if(lista[i] > mayor)
          {
            mayor = lista[i];
          }
        }
        return mayor;

    }  
    public static double minimo(double[] lista)
    {
        double menor = lista[0];

        for(int i = 1; i < lista.length; i++)
        {
          if(lista[i] < menor)
          {
            menor = lista[i];
          }
        }
        return menor;
    }
    public static double promedio(double[] lista)
    {
        double suma = 0;

        for(int i = 0; i < lista.length; i++)
        {
            suma += lista[i];
        }

        return (suma / lista.length);
    } 
    public static void mostrarResultados(double maximo, double minimo, double promedio)
    {
        System.out.printf("\n" +
                         "Mayor número introducido: %.2f\n" +
                         "Menor número introduciido: %.2f\n" +
                         "Promedio de los números introducidos: %.2f\n"
                         , maximo, minimo, promedio    
                        );

    }
}
