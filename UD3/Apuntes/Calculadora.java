import java.util.Scanner;

public class Calculadora 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        mostrarMenu();

        int num1 = solicitarNumero();
        int num2 = solicitarNumero();
        char operador = solicitarSigno();
        realizarOperacion(num1, num2, operador);

    }

    public static void mostrarMenu()
    {
        System.out.print("" +
                         "*********************\n" + 
                         "     Calculadora\n" + 
                         "*********************\n" +
                         "1. Sumar: +\n" +
                         "2. Restar: -\n" +
                         "3. Multiplicar: \n*" +
                         "4. Dividir: /\n" +
                         "5. Potencia: ^\n" +
                         "6. Resto: %\n" +
                         "\n"
                        );
    }    

    public static char solicitarSigno()
    {
        System.out.print("Introduce el operador de la operación: ");//Leemos la entrada como String y lo guardamos en otra variable como Char
        String operadorEntrada = sc.nextLine();
 
        char operador = operadorEntrada.charAt(0);
        return operador;
        
    }

    public static int solicitarNumero()
    {
        System.out.print("Introduzca el número: ");
        int num = Integer.parseInt(sc.nextLine());

        return num;
    }
    
    public static void realizarOperacion(int num1, int num2, char operador)
    {
        int resultado = 0;
        double resultadoDouble = 0;
        switch(operador)
        {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            case '^':
                resultadoDouble = Math.pow(num1, num2);
                break;
            case '%':
                resultado = num1 % num2;
                break;
        }
        if(operador == '^')
        {
            System.out.printf("%d %c %d = %.2f\n", num1, operador, num2, resultadoDouble);
        }else
        {
            System.out.printf("%d %c %d = %d\n", num1, operador, num2, resultado);
        }
    }
}
