import java.util.Scanner;

class UD2B1
{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        ej5();

        sc.close();
    }
    public static void ej1()
    {
        System.out.print("Introduzca un número: ");
        int num1 = Integer.parseInt(sc.nextLine());

        if (num1 > 0)
        {
            System.out.println("El número introducido es positivo.");
        }
        else if (num1 < 0)
        {
            System.out.println("El número introducido es negativo.");
        }
        else
        {
            System.out.println("El número introducido es 0.");
        }
    }
    public static void ej2()
    {
        System.out.print("Introduzca un número: ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca otro número: ");
        int num2 = Integer.parseInt(sc.nextLine());

        if (num1 > num2)
        {
            System.out.printf("El número %d es mayor que el número %d\n", num1, num2);
        }
        else if (num1 < num2)
        {
            System.out.printf("El número %d es menor que el número %d\n", num1, num2);
        }
        else
        {
            System.out.println("Los números introducidos son iguales");
        }
    }
    public static void ej3()
    {
        System.out.print("Introduzca una letra: ");
        char letra = sc.next().charAt(0);

        if (letra >= 'A' && letra <= 'Z')
        {
            System.out.println("La letra introducida en es mayúscula.");
        }
        else if (letra >= 'a' && letra <= 'z' )
        {
            System.out.println("La letra introducida es minúscula.");
        }
        else
        {
            System.out.println("No ha introducido una letra.");
        }
    }
    public static void ej4()
    {
        System.out.print("Introduzca una letra: ");
        char letra1 = sc.next().charAt(0);
        System.out.print("Introduzca otra letra: ");
        char letra2 = sc.next().charAt(0);

        if (letra1 >= 'a' && letra1 <= 'z' && letra2 >= 'a' && letra2 <= 'z')
        {
            System.out.println("Ha introducido dos caracteres en minúscula");
        }
        else
        {
            System.out.println("No ha introducido dos caracteres en minúscula");
        }
    }
    public static void ej5()
    {
        System.out.print("Introduzca un número: ");
        char numero = sc.next().charAt(0);

        if (numero >= 48 && numero <= 57)
        {
            System.out.println("Ha introducido un número");
        }
        else
        {
            System.out.println("No ha introducido un número");
        }
    }
    public static void ej6()
    {
        System.out.print("Introduzca un número: ");
        int num = Integer.parseInt(sc.nextLine());
    
        int multiplo = num % 10;

        if (multiplo == 0 )
        {
            System.out.println("El número introducido es múltiplo de 10");
        }
        else
        {
            System.out.println("El número introducido no es múltiplo de 10");
        }
    }
    public static void ej7()
    {
        System.out.print("Introduzca un número: ");
        int num = Integer.parseInt(sc.nextLine());

        int multiplo = num % 2;
        
        if (multiplo == 0)
        {
            System.out.printf("El número %d es múltiplo de 2\n", num);
        }
        else
        {
            System.out.printf("El número %d no es múltiplo de 2\n", num);
        }
    }
    public static void ej8()
    {
        System.out.print("Introduzca el primer número: ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el segundo número número: ");
        int num2 = Integer.parseInt(sc.nextLine());
        int division; 

        if (num2 == 0)
        {
            System.out.println("El divisor no puede ser 0");   
        }
        else
        {
            division = num1 / num2;
            System.out.printf("El resultado de dividir %d y %d es %d\n", num1, num2, division);
        }
    }
    public static void ej9()
    {
        System.out.print("\n" +
                        "--------------------\n" + 
                         "Comprobador de horas\n" + 
                         "--------------------\n" + 
                         "\n"
                        );
        System.out.print("Itroduce primero las horas: ");
        int hora = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce los minutos: ");
        int minutos = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce los segundos: ");
        int segundos = Integer.parseInt(sc.nextLine());

        if (hora >= 00 && hora <= 24 && minutos >= 00 && minutos <= 60 && segundos >= 00 && segundos <= 60)
        {
            System.out.println("La hora introducida es correcta");
            System.out.printf("Ha introducido la siguiente hora: %d:%d:%d\n", hora, minutos, segundos);
        }
        else
        {
            System.out.println("La hora introducida no es correcta");
        }
    }
    public static void ej10()
    {
        System.out.print("Introduce el primer número: ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce el segundo número: ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce el tercer número: ");
        int num3 = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce el cuarto número: ");
        int num4 = Integer.parseInt(sc.nextLine());

        if (num1 > num2 && num1 > num3 && num1 > num4)
        {
            System.out.printf("El número %d es el mayor de todos los que ha introducido\n", num1);
        }
        else if ((num2 > num3 && num2 > num4 && num2 > num1))
        {
            System.out.printf("El número %d es el mayor de todos los que ha introducido\n", num2);
        }
        else if ((num3 > num4 && num3 > num1 && num3 > num2))
        {
            System.out.printf("El número %d es el mayor de todos los que ha introducido\n", num3);
        }
        else
        {
            System.out.printf("El número %d es el mayor de todos los que ha introducido\n", num4);
        }
    }
    public static void ej11()
    {
        System.out.print("Introduce la nota del exámen: ");
        double nota = Double.parseDouble(sc.nextLine());

        if (nota < 5)
        {
            System.out.println("Suspenso");
        }
        else if (nota >= 5 && nota <= 6.9)
        {
            System.out.println("Aprobado");
        }
        else if (nota >= 7 && nota <= 8.9)
        {
            System.out.println("Notable");
        }
        else
        {
            System.out.println("Sobresaliente");
        }
    }
    public static void ej12()
    {
        System.out.print("Introduce tu edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.print("¿Eres estudiante?: ");
        boolean estudiante = Boolean.parseBoolean(sc.nextLine());

        if (edad >= 65 || estudiante == true)
        {
            System.out.println("Tienes un descuento disponible");
        }
        else
        {
            System.out.println("No tienes derecho a ningún descuento");
        }
    }
    public static void ej13()
    {
        System.out.print("Introduce el número de un mes: ");
        int mes = Integer.parseInt(sc.nextLine());

        if (mes == 1)
        {
            System.out.println("Enero tiene 31 días ");
        }
        else if (mes == 3)
        {
            System.out.println("Marzo tiene 31 días");
        }
        else if (mes == 5)
        {
            System.out.println("Mayo tiene 31 días");
        }
        else if (mes == 7)
        {
            System.out.println("Julio tiene 31 días");
        }
        else if (mes == 8)
        {
            System.out.println("Agosto tiene 31 días");
        }
        else if (mes == 10)
        {
            System.out.println("Octubre tiene 31 días");
        }
        else if (mes == 12)
        {
            System.out.println("Diciembre tiene 31 días");
        }
        else if (mes == 4)
        {
            System.out.println("Abril tiene 30 días");
        }
        else if (mes == 6)
        {
            System.out.println("Junio tiene 30 días");
        }
        else if (mes == 9)
        {
            System.out.println("Septiembre tiene 30 días");
        }
        else if (mes == 11)
        {
            System.out.println("Noviembre tiene 30 días");
        }
        else if (mes == 2)
        {
            System.out.println("Febrero tiene 28 o 29 días dependiendo si es un año bisiesto");
        }
        else
        {
            System.out.println("No ha introducido un número válido");
        }
    }
    public static void ej14()
    {
        System.out.print("Introduce el número de un mes: ");
        int mes = Integer.parseInt(sc.nextLine());

        switch (mes) 
        {
            case 1:
                System.out.println("Enero tiene 31 días ");
                break;
            case 2:
                System.out.println("Febrero tiene 28 o 29 días dependiendo si es un año bisiesto");
                break;
            case 3:
                System.out.println("Marzo tiene 31 días");
                break;
            case 4:
                System.out.println("Abril tiene 30 días");
                break;
            case 5:
                System.out.println("Mayo tiene 31 días");
                break;
            case 6:
                System.out.println("Junio tiene 30 días");
                break;
            case 7:
                System.out.println("Julio tiene 31 días");
                break;
            case 8:
                System.out.println("Agosto tiene 31 días");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 días");
                break;
            case 10:
                System.out.println("Octubre tiene 31 días");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 días");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 días");
                break;
        }
    }
    public static void ej15()
    {
        System.out.print("\n" +
                         "**********************\n" +
                         "     Calculadora\n" +
                         "**********************\n" +
                         "1.Suma: +\n" +
                         "2.Resta: -\n" +
                         "3.Multiplicación: *\n" +
                         "4.División: /\n" +
                         " \n"
                        );
        System.out.print("Introduzca el símbolo correspondiente a la operación que desee realizar: ");
        String operador = sc.nextLine();
        int num1;
        int num2;
        int calculo;

        switch (operador) 
        {
            case "+":
                System.out.print("Introduzca el primer número: ");
                num1 = Integer.parseInt(sc.nextLine());
                System.out.print("Introduzca el segundo número: ");
                num2 = Integer.parseInt(sc.nextLine());
                calculo = num1 + num2;

                System.out.printf("\n" +
                                  "%d\n" +
                                  "%d\t+\n" +
                                  "-------\n" +
                                  "Total: %d\n", num1, num2, calculo 
                                 );
                break;
            case "-":
                System.out.print("Introduzca el primer número: ");
                num1 = Integer.parseInt(sc.nextLine());
                System.out.print("Introduzca el segundo número: ");
                num2 = Integer.parseInt(sc.nextLine());
                calculo = num1 - num2;
                System.out.printf("\n" +
                                  "%d\n" +
                                  "%d\t-\n" +
                                  "-------\n" +
                                  "Total: %d\n", num1, num2, calculo 
                                 );
                break;
            case "*":
                System.out.print("Introduzca el primer número: ");
                num1 = Integer.parseInt(sc.nextLine());
                System.out.print("Introduzca el segundo número: ");
                num2 = Integer.parseInt(sc.nextLine());
                calculo = num1 * num2;
                System.out.printf("\n" +
                                  "%d\n" +
                                  "%d\t*\n" +
                                  "-------\n" +
                                  "Total: %d\n", num1, num2, calculo 
                                 );
                break;
            case "/":
                System.out.print("Introduzca el primer número: ");
                num1 = Integer.parseInt(sc.nextLine());
                System.out.print("Introduzca el segundo número: ");
                num2 = Integer.parseInt(sc.nextLine());
                calculo = num1 / num2;
                System.out.printf("\n" +
                                  "%d\n" +
                                  "/\n" +
                                  "%d\n" +
                                  "-------\n" +
                                  "Total: %d\n", num1, num2, calculo 
                                 );
                break;

        }
    }
}
