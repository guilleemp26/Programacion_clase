import java.util.Scanner;

public class Calculadora 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        boolean comprobarSigno = false;
        int intentosSignos = 3;
        char operador;
        

        do
        {
            mostrarMenu();
            intentosSignos--;
            System.out.printf("Tienes %d intentos para introducir correctamente el operador\n", intentosSignos);
            operador = solicitarSigno();
            comprobarSigno = comprobarSigno(operador);
            
        }while(comprobarSigno == false && intentosSignos > 0);

        if(intentosSignos >= 1)
        {
            int num1 = solicitarNumero();
            int num2 = solicitarNumero();
            realizarOperacion(num1, num2, operador);
        }
        
        
            
        sc.close();
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
 
        char operador = sc.nextLine().charAt(0);

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
    public static boolean comprobarSigno(char operador)
    {
        if(operador == '+' || operador == '-' || operador == '*' || operador == '/' || operador == '^' || operador == '%')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
