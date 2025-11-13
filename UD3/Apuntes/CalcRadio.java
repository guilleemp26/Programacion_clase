import java.util.Scanner;

public class CalcRadio 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Introduce el radio de un círculo: ");
        int radio = Integer.parseInt(sc.nextLine());
        double area = AreaCirculo(radio);

        System.out.printf("El Área del círculo es %.2f\n", area);
    }
    public static double AreaCirculo(int radio)
    {
        double media = Math.pow((radio * Math.PI)/2, 2);
        return media;
    }    
}
