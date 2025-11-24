import java.util.Scanner;

public class UD2B2
{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        ej20();

        sc.close();
    }
    public static void ej1()
    {
        int num = 100;
        int i = 1;

        while (i <= num)
        {
            System.out.println(i);
            i++;
        }
    }
    public static void ej2()
    {
        int num = 100;
        int i = 1;

        do 
        { 
            System.out.println(i);
            i++;
        } while (i <= num);
    }
    public static void ej3()
    {
        int num = 100;

        for (int i = 1; i <= num; i++)
        {
            System.out.println(i);
        }
    }
    public static void ej4()
    {
        int num = 1;
        int i = 100;

        while (i >= num)
        {
            System.out.println(i);
            i--;
        }
    }
    public static void ej5()
    {
        int num = 1;
        int i = 100;

        do 
        { 
            System.out.println(i);
            i--;    
        } while (i >= num);
    }
    public static void ej6()
    {
        int num = 1;

        for (int i = 100; i >= num; i--)
        {
            System.out.println(i);
        }
    }
    public static void ej7()
    {
        int num = 10;

        for (int i = 1;i <= num; i++)
        {
            System.out.println(i);
        }
    }
    public static void ej8()
    {
        int num = 10;
        while (num >= 1)
        {
            System.out.println(num);
            num--;
        }
    }
    public static void ej9()
    {
        int suma = 0;
        int num;
        for (;suma <= 1000;)
        {
            num = (int)(Math.random() * 100) + 1;
            suma += num;
        }
        System.out.println(suma);
    }
    public static void ej10()
    {
        int intento = 1;
        do
        {
            System.out.printf("Intento número %d\n", intento);
            intento++;
            if (Math.random() < 0.5)
            {
                System.out.println("¡Éxito!");
                break;
            }
        }while(intento <= 5);
    }
    public static void ej11()
    {
        String respuesta = "";
        do 
        { 
            System.out.print("¿Quieres salir! (si/no): ");
            respuesta = sc.nextLine();    
        } while (!respuesta.equalsIgnoreCase("si"));
        System.out.println("Hasta luego");
    }
    public static void ej12()
    {
        System.out.print("Introduzca una contraseña: ");
        String passwd = sc.nextLine();
        String passwd2 = "";

        while(!passwd.equalsIgnoreCase(passwd2))
        {
            System.out.print("Introduzca de nuevo la contraseña: ");
            passwd2 = sc.nextLine();
        }
    }
    public static void ej13()
    {
        System.out.print("Introduzca un número: ");
        int num = Integer.parseInt(sc.nextLine());
        int suma = 0;

        for(int i = 0;i <= num; i++)
        {
            suma += i;
        }
        System.out.println(suma);
    } 
    public static void ej14()
    {
        System.out.print("Introduzca un número del 1 al 10: ");
        int num = Integer.parseInt(sc.nextLine());
        int cuenta = 0;

        System.out.printf("\n" +
                          "Tabla del %d\n" +
                          "************\n",num
                         );
        for(int i = 1;i <= 10; i ++)
        {
            cuenta = i * num;
            System.out.printf("%d x %d = %d\n",num, i,cuenta );
        }
    }
    public static void ej15()
    {
        int num;
        do
        {
            System.out.print("Introduzca un número positivo: ");
            num = Integer.parseInt(sc.nextLine());
        }while(num >= 0);
    }
    public static void ej16()
    {
        System.out.print("Introduce un número entero positivo: ");
        int num = Integer.parseInt(sc.nextLine());
        int pares = 2;

        while(pares <= num)
        {
            System.out.println(pares);
            pares += 2;
        }
    }
    public static void ej17()
    {
        System.out.print("Introduce un número para saber su factorial: ");
        int num = Integer.parseInt(sc.nextLine());
        int factorial = 1;

        for (int i = num;i > 1; i--)
        {
            factorial *= i; 
            System.out.printf("%d x ",i);
        }
        System.out.print("1 = " + factorial);
        System.out.println("");
        
    }
    public static void ej18()
    {
        System.out.print("\n" +
                         "  Menú: \n" +
                         "1. Opción 1\n" +
                         "2. Opción 2\n" +
                         "3. Opción 3\n" +
                         "4. Salir\n" +
                         "\n"
                        );

        int eleccion;
        do
        {
            System.out.print("Elija una opción: ");
            eleccion = Integer.parseInt(sc.nextLine());

            switch (eleccion) 
            {
                case 1:
                    System.out.printf("Ha elegido la opción %d\n",eleccion);
                    break;
                case 2:
                    System.out.printf("Ha elegido la opción %d\n",eleccion);
                    break;
                case 3:
                    System.out.printf("Ha elegido la opción %d\n",eleccion);
                    break;
                case 4:
                    
                    break;
            }
            System.out.println("");
        }while(eleccion != 4);
        System.out.println("Ha salido del menú de opciones");
    }
    public static void ej19()
    {
        for(int i = 1;i <= 5; i++)
        {
            for(int j = 1;j <=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void ej20()
    {
        
      for(int i = 1;i <= 7;i+=2)
      {
        for(int j = 1;j <= i;j++)
        {
            System.out.print("*");
        }
        System.out.println("");
      }
    }
}