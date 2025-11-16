import java.util.Scanner;
import java.util.Random;

public class B1UD3
{
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) 
    {
        ej15();

        sc.close();
    }
    public static void ej1()
    {
        System.out.print("Introduzca un número: ");
        int num = Integer.parseInt(sc.nextLine());
        int suma = 0;

        for(int i = 1;i <= 20;i++)
        {
            suma += i;

            if(suma > num)
            {
                break;
            }
        }
        System.out.println(suma);
    }
    public static void ej2()
    {
        int[] lista = new int[5];

        for(int i = 0;i < lista.length; i++)
        {
            System.out.printf("Ingrese el número de la posición %d de la lista: ", i + 1);
            lista[i] = Integer.parseInt(sc.nextLine());
        }
        for(int i = lista.length - 1;i >= 0; i --)
        {
            System.out.println(lista[i]);
        }
    }
    public static void ej3()
    {
        int[] lista = new int[10];
        int suma = 0;

        for(int i = 0;i < lista.length;i++)
        {
            System.out.printf("Ingrese el valor número %d de la lista: ", i + 1);
            lista[i] = Integer.parseInt(sc.nextLine());
            suma += lista[i];
        }
        System.out.printf("La suma de todos los valores de la lista es: %d", suma);
    }
    public static void ej4()
    {
        double[] calificaciones = new double[6];
        double suma = 0;

        for(int i = 0; i < calificaciones.length; i++)
        {
            System.out.printf("Introduce la calificación número %d: ", i + 1);
            calificaciones[i] = Double.parseDouble(sc.nextLine());
            suma += calificaciones[i];
        }
        double media = suma / calificaciones.length;
        System.out.printf("La media de las calificaciones es %.2f", media);
    }
    public static void ej5()
    {
        System.out.print("Introduce un número para saber si se encuentra dentro de la lista: ");
        int num = Integer.parseInt(sc.nextLine());
        int[] lista = new int[8]; 
        boolean comprobarNum = false;
        int posicionNum = 0;
        
        for(int i = 0;i < lista.length; i++)
        {
            lista[i] = (random.nextInt(20) + 1);
        }
        for(int i = 0;i < lista.length; i++)
        {
            if(num == lista[i])
            {
                comprobarNum = true;
                posicionNum = i +1;
            }
            
        }
        if(comprobarNum)
        {
            System.out.println("El número que has introducido está en la posición " + posicionNum);
        }
        else
        {
            {
                System.out.println("El número que has introducido no está dentro de la lista ");
            }
        }
    }
    public static void ej6()
    {
        System.out.print("Introduce un número entre el 1 y el 10 para saber cuantas veces se encuentra dentro de la lista: ");
        int num = Integer.parseInt(sc.nextLine());
        int[] lista = new int[10]; 
        int comprobarNum = 0;
        
        
        for(int i = 0;i < lista.length; i++)
        {
            lista[i] = (random.nextInt(10 - 1) + 1);
        }
        for(int i = 0;i < lista.length; i++)
        {
            if(num == lista[i])
            {
                comprobarNum++;
            }
        }
        System.out.printf("El número que has introducido se encuentra %d veces en la lista", comprobarNum);
    }
    public static void ej7()
    {
        System.out.print("Introduce el valor más pequeño de la lista: ");
        int minLista = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce el valor más alto de la lista: ");
        int maxLista = Integer.parseInt(sc.nextLine());
        int[] lista = new int[10];

        for(int i = 0; i < lista.length; i++)
        {
            lista[i] = (random.nextInt(maxLista - minLista) + minLista);
            System.out.println(lista[i]);
        }
    }
    public static void ej8()
    {
        int[] lista1 = new int[5];
        int[] lista2 = new int[5];
        int[] lista3 = new int[10];

        for(int i = 0; i < lista1.length; i++)
        {
            System.out.printf("Introduce el valor %d de la primera lista: ", i + 1);
            lista1[i] = Integer.parseInt(sc.nextLine());
        }
        for(int i = 0; i < lista2.length; i++)
        {
            System.out.printf("Introduce el valor %d de la segunda lista: ", i + 1);
            lista2[i] = Integer.parseInt(sc.nextLine());
        }
        for(int i = 0; i < 5; i++)
        {
            lista3[i] = lista1[i];
            lista3[i + 5] = lista2[i];
        }
        for(int i = 0; i < lista3.length; i++)
        {
            System.out.println(lista3[i]);
        }
    }
    public static void ej9()
    {
        int[] lista = new int[10];
        int[] lista2 = new int[9];
        int posDel;

        for (int i = 0; i < lista.length; i++)
        {
            System.out.printf("Introduce la posición %d de la lista: ", i + 1);
            lista[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("Introduce la posicion que desees borrar: ");
        posDel = Integer.parseInt(sc.nextLine());
        for (int i = posDel; i < lista2.length - 1; i++)
        {
            lista2[i] = lista[i + 1];
        }
        lista2 = lista;
        for (int i = 0; i < lista2.length; i++)
        {
            System.out.println(lista2[i]);
        }
    }

    public static void ej10()
    {
        int[] lista = new int[8];
        int aux;

        for (int i = 0; i < lista.length; i++)
        {
            System.out.printf("Introduce la posición %d de la lista: ", i + 1);
            lista[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < 8; i += 2)
        {
            aux = lista[i];
            lista[i] = lista[i + 1];
            lista[i + 1] = aux;
        }

        for (int i = 0; i < lista.length; i++)
        {
            System.out.println(lista[i]);
        }
    }
    public static void ej11()
    {
        int[] lista1 = new int[10];
        int[] listaPares;
        int[] listaImpares;
        int contadorPares = 0;
        int contadorImpares = 0;
        int contadorAux = 0;

        for(int i = 0; i < lista1.length; i++)
        {
            System.out.printf("Ingresa el valor %d de la lista: ", i + 1);
            lista1[i] = Integer.parseInt(sc.nextLine());
            if((lista1[i] % 2) == 0)
            {
                contadorPares++;
            }
            else
            {
                contadorImpares++;
            }
        }
        listaPares = new int[contadorPares];
        listaImpares = new int[contadorImpares];

        for(int i = 0;i < lista1.length; i++)
        {
            if((lista1[i] % 2) == 0)
            {
                listaPares[contadorAux] = lista1[i];
                contadorAux++;
            }
        }
        contadorAux = 0;
        for(int i = 0;i < lista1.length; i++)
        {
            if((lista1[i] % 2) != 0)
            {
                listaImpares[contadorAux] = lista1[i];
                contadorAux++;
            }
        }
        System.out.printf("Los números pares de la lista son: ");
        for(int i = 0;i < listaPares.length; i++)
        {
            System.out.print(listaPares[i] + " ");
        }
        System.out.println("");
        System.out.printf("Los números impares de la lista son: ");
        for(int i = 0;i < listaImpares.length; i++)
        {
            System.out.print(listaImpares[i] + " ");
        }
    }
    public static void ej12()
    {
        int[] lista = new int[6];
        int numVeces;
        int aux;

        for(int i = 0; i < lista.length; i++)
        {
            System.out.printf("Ingresa el valor número %d de la lista: ", i + 1);
            lista[i] = Integer.parseInt(sc.nextLine());
        }


        System.out.print("¿Cuantas veces desea desplazar a la izquierda los valores de la lista?: ");
        numVeces = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < lista.length; i++)
        {
            System.out.print(lista[i]);
        }
        System.out.println("");

        for(int i = 0; i < numVeces; i++)
        {
            for(int j = 0; j < (lista.length - 1); j++)
            {
                aux = lista[i];
                lista[i] = lista[i + 1];
                lista[i + 1] = aux;
            }
        }
        for(int i = 0; i < lista.length; i++)
        {
            System.out.print(lista[i]);
        }
    }
    public static void ej13()
    {
        int[] lista = new int[10];
        boolean comprobarMayor = false;
        int contador = 0;
        int aux;

        for(int i = 0; i < lista.length; i++)
        {
            System.out.printf("Ingresa el valor número %d de la lista: ", i + 1);
            lista[i] = Integer.parseInt(sc.nextLine());
        }
        
        for(int i = 0; i < lista.length; i++)
        {
            System.out.print(lista[i] + " ");
        }
        System.out.println("");

        for(int i = 0; i < lista.length - 1; i++)
        {
            for(int j = 0; j < (lista.length - 1 - i); j++)
            {
                if(lista[j] > lista[j + 1])
                {
                    aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                }
            }
        }
        for(int i = 0; i < lista.length; i++)
        {
            System.out.print(lista[i] + " ");
        }
    }
    public static void ej14()
    {
        System.out.println("Introduce las tres dimensiones del vector: ");
        System.out.print("Introduce la cantidad de filas: ");
        int filas = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce la cantidad de columnas: ");
        int columnas = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce la profundidad: ");
        int profundidad = Integer.parseInt(sc.nextLine());
        int valorPos;
        int suma = 0;

         int[][][] lista = new int[filas][columnas][profundidad];

         for(int x = 0; x < filas; x++)
         {
            for(int y = 0; y < columnas; y++)
            {
                for(int z = 0; z < profundidad; z++)
                {
                    System.out.printf("Introduce el valor de la posición %d,%d,%d: ", x + 1, y + 1, z + 1);
                    valorPos = Integer.parseInt(sc.nextLine());
                    suma += valorPos;
                    lista[x][y][z] = valorPos;
                }
            }
         }
         System.out.printf("La suma de toddos los valores del vector es: %d", suma);
    }
    public static void ej15()
    {
        System.out.println("Introduce las tres dimensiones de los vectores: ");
        System.out.print("Introduce la cantidad de filas: ");
        int filas = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce la cantidad de columnas: ");
        int columnas = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce la profundidad: ");
        int profundidad = Integer.parseInt(sc.nextLine());
        int valorPos;
        int suma = 0;

         int[][][] lista1 = new int[filas][columnas][profundidad];
         int[][][] lista2 = new int[filas][columnas][profundidad];
         int[][][] lista3 = new int[filas][columnas][profundidad];

         System.out.println("Introduce los valores del vector 1; ");
         for(int x = 0; x < filas; x++)
         {
            for(int y = 0; y < columnas; y++)
            {
                for(int z = 0; z < profundidad; z++)
                {
                    System.out.printf("Introduce el valor de la posición %d,%d,%d: ", x + 1, y + 1, z + 1);
                    valorPos = Integer.parseInt(sc.nextLine());
                    suma += valorPos;
                    lista1[x][y][z] = valorPos;
                }
            }
         }
         System.out.println("Introduce los valores del vector 2; ");
         for(int x = 0; x < filas; x++)
         {
            for(int y = 0; y < columnas; y++)
            {
                for(int z = 0; z < profundidad; z++)
                {
                    System.out.printf("Introduce el valor de la posición %d,%d,%d: ", x + 1, y + 1, z + 1);
                    valorPos = Integer.parseInt(sc.nextLine());
                    suma += valorPos;
                    lista2[x][y][z] = valorPos;
                }
            }
         }
         for(int x = 0; x < filas; x++)
         {
            for(int y = 0; y < columnas; y++)
            {
                for(int z = 0; z < profundidad; z++)
                {
                    lista3[x][y][z] = lista1[x][y][z] + lista2[x][y][z];
                }
            }
         }
         System.out.println("La suma de los valores posición a posición de los dos vectores es: ");
         for(int x = 0; x < filas; x++)
         {
            for(int y = 0; y < columnas; y++)
            {
                for(int z = 0; z < profundidad; z++)
                {
                    System.out.print(lista3[x][y][z] + " ");
                }
            }
         }
    }
}
