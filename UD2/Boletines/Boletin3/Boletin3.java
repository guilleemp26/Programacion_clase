
import java.util.Random;
import java.util.Scanner;

public class Boletin3
{
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) 
    {
        ej20();
    }
    public static void ej1()
    {
        System.out.print("Introduce un número: ");
        int num = Integer.parseInt(sc.nextLine()); 
        int suma = 0;

        for(int i = 0; i <= 20;i++)
        {
            suma += i;
            if(suma >= num)
            {
                break; 
            }
        }   
        System.out.println(suma);
    }
    public static void ej2()
    {
        System.out.print("Introduce un número: ");
        int num = Integer.parseInt(sc.nextLine()); 
        int suma = 0;

        for(int i = 0; suma <= num && i <= 20;i++)
        {
            suma += i;
        }   
        System.out.println(suma);
    }
    public static void ej3()
    {
        System.out.print("Introduce un número: ");
        int num = Integer.parseInt(sc.nextLine());

        for(int i = 0; i <= 50;i++)
        {
            if((i % num) == 0)
            {
                continue;
            }
            else
            {
                System.out.println(i);
            }
        }
    }
    public static void ej4()
    {
        System.out.print("Introduce un número: ");
        int num = Integer.parseInt(sc.nextLine());

        for(int i = 0; i <= 50;i++)
        {
            if ((i % num) != 0)
            {
                System.out.println(i);
            }
        }
    }
    public static void ej5()
    {
        int min = 5;
        int max = 25;

        for(int i = 0;i <= 10;i++)
        {
            int num = random.nextInt((max - min) + 1) + min;
            System.out.println("Número aleatorio entre 5 y 25: " + num);
            if ((num % 5) == 0)
            {
                break;
            }
        }
    }
    public static void ej6()
    {
         int min = 5;
        int max = 25;
        int num = 1; // num comienza en 1 porque si comienza en 0 no entra en el for debido a que (0 % 5) = 0

        for(int i = 0;i <= 10 && ((num % 5) != 0);i++)
        {
            num = random.nextInt((max - min) + 1) + min;
            System.out.println("Número aleatorio entre 5 y 25: " + num);
        }
    }
    public static void ej7() 
    {
        System.out.print("Introduzca la cantidad de alturas que va a facilitar: ");
        int numAlturas = Integer.parseInt(sc.nextLine());

        int suma = 0;
        int promedio;

        for(int i = 1;i <= numAlturas; i++)
        {
            System.out.printf("Introduce la altura número %d: ", (i));
            suma += Integer.parseInt(sc.nextLine());
        }
        promedio = suma / numAlturas;
        System.out.printf("La altura promedio es %d", promedio);

    }
    public static void ej8()
    {
        int num = 0;
        int suma = 0;
        int contador = 0;

        do 
        { 
            System.out.print("Introduce un numero, se sumarán hasta que introduzcas el valor 999: ");
            num = Integer.parseInt(sc.nextLine());
            suma += num;
            contador++;
        } while (num != 999);
        System.out.printf("La suma total es %d\n", suma);
        if(contador > 0)
        {
            System.out.println("La cantidad de sumas que se han realizado es positiva");
        }
    }
    public static void ej9()
    {
        String contrasenya = "password";
        String input = "";
        int intentos = 3;

        while (intentos > 0) 
        { 
            System.out.printf("Introduzca la contraseña, le quedan %d intentos: ", intentos);
            input = sc.nextLine();
            intentos--;
            if(input.equals(contrasenya))
            {
                System.out.println("hola");
                break;
            }
        }
    }
    public static void ej10()
    {
        System.out.print("Introduzca menor número del intervalo para la generación de los números: ");
        int min = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el mayor número del intervalo: ");
        int max = Integer.parseInt(sc.nextLine());
       

        for(int i = 0;i <= 10;i++)
        {   
            int num = (int)(Math.random() * max) + min;
            System.out.println(num);
        }
    }
    public static void ej11()
    {
        System.out.print("Introduzca menor número del intervalo para la generación de los números: ");
        int min = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el mayor número del intervalo: ");
        int max = Integer.parseInt(sc.nextLine());
        Random random = new Random();

        for(int i = 0;i <= 10;i++)
        {   
            int num = random.nextInt((max - min) + 1) + min;
            System.out.println(num);
        }
    }
    public static void ej12()
    {
        System.out.print("Introduce la cantidad de primos a mostrar: ");
        int num = sc.nextInt();

        int contador = 0;
        int numActual = 2;   

        while (contador < num) 
        {
            boolean esPrimo = true;

            for (int i = 2; i < numActual; i++) 
            {
                if (numActual % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo == true) 
            {
                System.out.println(numActual);
                contador++;
            }
            numActual++;
        }
    }
    public static void ej13()
    {
        String continuar = "si";
        int mayor = 0;
        int menor = 0;
        int sumaPos = 0;
        int sumaNeg = 0;
        int positivos = 0;
        int negativos = 0;
        int impares = 0;
        int pares = 0;
        int contador = 0;
        int suma = 0;
        int media = 0;

        do
        {
            System.out.print("Introduzca un número: ");
            int num = Integer.parseInt(sc.nextLine());
            System.out.print("Quieres introducir más números? si/no: ");
            continuar = sc.nextLine();
            contador++;
            suma += num;
            if(num > mayor)
            {
                mayor = num;
            }
            if(num < menor)
            {
                menor = num;
            }
            if(num > 0)
            {
                sumaPos += num;
                positivos++;
            }
            if(num < 0)
            {
                sumaNeg += num;
                negativos++;
            }
            if((num % 2) == 0)
            {
                pares++;
            }
            if((num % 2) != 0)
            {
                impares++;
            }
        }while(continuar.equals("si"));
        media = suma / contador;

        System.out.printf("mayor = %d%n", mayor);
        System.out.printf("menor = %d%n", menor);
        System.out.printf("sumaPos = %d%n", sumaPos);
        System.out.printf("sumaNeg = %d%n", sumaNeg);
        System.out.printf("positivos = %d%n", positivos);
        System.out.printf("negativos = %d%n", negativos);
        System.out.printf("impares = %d%n", impares);
        System.out.printf("pares = %d%n", pares);
        System.out.printf("contador = %d%n", contador);
        System.out.printf("suma = %d%n", suma);
        System.out.printf("media = %d%n", media);
    }
    public static void ej14()//Profe no se como hacerlo
    {
       System.out.print("Introduce un número para saber si es un \"número Armstrong: \" ");
        int num = Integer.parseInt(sc.nextLine());
        int aux = num;
        int contador = 0;
        int miles = 0;
        int centenas = 0;
        int decenas = 0;

        for(int i = 0;num > 0;i++)
        {
            int digito = num % 10;
            System.out.println(digito);
            num = num / 10;
            contador++;
        }
        System.out.println(contador);
        System.out.println(num);
    }
    public static void ej15()//Ni idea profe lo siento
    {

    }
    public static void ej16()//XD
    {

    }
    public static void ej17()//solo funciona ocn operandos de un decimal
    {
        System.out.print
        ("                    \n" + 
         "********************\n" + 
         "                    \n" + 
         "    Calculadora     \n" + 
         "                    \n" +
         "********************\n" + 
         "1. Sumar: +         \n" + 
         "2. Restar: -        \n" + 
         "3. Multiplicar: *   \n" + 
         "4. Dividir: /       \n" + 
         "5. Potencia: ^      \n" + 
         "6. Módulo: %        \n" +
         "                    \n" + 
         "                     \n"
        );

        System.out.print("Introduzca la operación. Ejemplo 8+2: ");
        String num = sc.nextLine();
        char num1Char = num.charAt(0);
        char operador = num.charAt(1);
        char num2Char = num.charAt(2);
        int num1 = num1Char - '0';
        int num2 = num2Char - '0';

        if(operador == '+')
        {
            int resultado = num1 + num2;
            System.out.print(num1 + " + " + num2 + " = " + resultado);
        }
        if(operador == '-')
        {
            int resultado = num1 - num2;
            System.out.print(num1 + " - " + num2 + " = " + resultado);
        }
        if(operador == '*')
        {
            int resultado = num1 * num2;
            System.out.print(num1 + " * " + num2 + " = " + resultado);
        }
        if(operador == 47)
        {
            double resultado = num1 / num2;
            System.out.print(num1 + " / " + num2 + " = " + resultado);
        }
        if(operador == '^')
        {
            double resultado = Math.pow(num1, num2);
            System.out.print(num1 + " * " + num2 + " = " + resultado);
        }
        if(operador == '%')
        {
            int resultado = num1 % num2;
            System.out.print(num1 + " % " + num2 + " = " + resultado);
        }
    }
    public static void ej18()
    {
        System.out.print("Introduce un número: ");
        int num = Integer.parseInt(sc.nextLine());
        int contador = 1;
        int columnas = 1;
        do
        {
            for(int i = 1;contador <= num;i++)
            {   
                for(int j = 1;j <= columnas;j++)
                {
                    System.out.print(contador + " ");
                    contador++;
                    if (contador > num)
                    {
                        break;
                    }
                }
                System.out.println("");
                columnas++;
            }
        }while(contador < num);
    }
    public static void ej19()
    {
        int num = random.nextInt(100 + 1);
        int intentosRestantes = 10;
        boolean acertado = false;
        do
        {
            System.out.printf("Tienes %d intentos, introduzca el número: ", intentosRestantes);
            int intento = Integer.parseInt(sc.nextLine());
            intentosRestantes--;

            if(intento > num)
            {
                System.out.println("Has introducido un número mayor al esperado");
                System.out.println("");
            }
            else if(intento < num)
            {
                System.out.println("Has introducido un número menor al esperado");
                System.out.println("");
            }

            if(intento == num)
            {
                System.out.println("¡Enhorabuena has acertado!");
                System.out.println("");
                acertado = true;
            }

            if(intentosRestantes == 0)
            {
                System.out.println("GAME OVER");
                System.out.println("");
                System.out.printf("El número a adivinar era %d\n", num);
            }
            System.out.println("");
        }while(intentosRestantes >= 1 && acertado == false);
    }
    public static void ej20()
    {
        System.out.print("Introduce el límite inferior del intervalo: ");
        int limitInf = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce el límite superior del intervalo: ");
        int limitSup = Integer.parseInt(sc.nextLine());
        int num = 0;
        int sumaInteralo = 0;
        int outIntervalo = 0;
        int limitIntervalo = 0;

        if (limitInf > limitSup)
        {
            System.out.println("");
            System.out.println("El límite inferior no puede ser mayor al límite superior.");
            System.out.print("Introduzca de nuevo el límite inferior: ");
            limitInf = Integer.parseInt(sc.nextLine());
        }
        do
        {
            System.out.print("Introduzca un número: ");
            num = Integer.parseInt(sc.nextLine());
            if (num > limitInf && num < limitSup)
            {
                sumaInteralo += num;
            }
            if ((num < limitInf || num > limitSup) && num != 0) // Añado como condición que sea diferente a 0 para que cuando quiera salir del loop no cuente el 0 como número fuera del intervalo
            {
                outIntervalo++;
            }
            if (num == limitInf || num == limitSup)
            {
                limitIntervalo++;
            }
        }while(num != 0);

        System.out.printf
        (" \n" + 
         "- La suma de los números dentro del intervalo es: %d\n" + 
         "- Has introducido %d números fuera del intervalo\n" + 
         "- Has introducido %d números equivalente a los límtes del intervalo\n", sumaInteralo, outIntervalo, limitIntervalo
        );
    }
} 