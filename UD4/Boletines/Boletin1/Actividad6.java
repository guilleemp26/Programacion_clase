import java.util.Scanner;

public class Actividad6 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int num = leerNumero();
        System.out.println(aBinario(num));
    }
    public static int leerNumero()
    {
        System.out.print("Introduce un número entero para pasarlo a decimal: ");
        return Integer.parseInt(sc.nextLine());
    }
    public static String aBinario(int num)
    {
        int calculo;
        String numBinario = "";

        while(num > 0)
        {
            int resto = num % 2;
            numBinario = resto + numBinario;
            num = num / 2;
        }
        return numBinario;
    }
}
