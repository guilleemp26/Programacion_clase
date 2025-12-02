import java.util.Scanner;

public class Ejercicio2 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int  numImpar = leerNumeroImpar();

        imprimirRombo(numImpar);
    }
    public static int leerNumeroImpar()
    {
        int numIntroducido;

        do
        {
            System.out.print("Introduzca un número impar: ");
            numIntroducido = Integer.parseInt(sc.nextLine());

        }while(!validador(numIntroducido));

        return numIntroducido;
    }
    public static boolean validador(int numIntroducido)
    {
        if(numIntroducido % 2 == 0)
        {
            System.out.println("ha introducido un número par");
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void imprimirRombo(int numImpar)
    {

        int contadorEspaciosExteriores = 4;
        int contadorEspaciosInteriores = 1;

        for(int i = 0; i < numImpar; i++)
        {
            for(int j = 0;j < contadorEspaciosExteriores;j++)//Imprime primeros espcacios
            {

                System.out.print(" "); 
            }
            contadorEspaciosExteriores--;
            System.out.print("*");//Imprime primer asterisco que siempre va
            if(i != 0 && i != numImpar - 1)//Comprueba si es la primera o la última iteracion
            {   
                for(int x = 0; x < contadorEspaciosInteriores; x++)
                {
                    System.out.print(" ");//Imprime espacios interiores
                }
                contadorEspaciosInteriores += 2;
            }
            
            if(i != 0 && i != numImpar - 1)//Comprueba si es la primera o la última iteracion NO TOCARARRAARAR
            {
                System.out.print("*");//Imprime asterisco final si procede
            }
            System.out.println("");
        }
        
    }
}