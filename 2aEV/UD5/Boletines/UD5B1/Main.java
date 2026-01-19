import java.util.Scanner;

public class Main 
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        
        Actividad3();
    }
    public static void Actividad1()
    {
        Temperatura temperatura = new Temperatura(leerTemperatura());
        temperatura.mostrarConversiones();
    }
    public static double leerTemperatura()
    {
        System.out.print("Introduce una temperatura en grados Celsius: ");
        return Double.parseDouble(sc.nextLine());
    }

    public static void Actividad2()
    {
        CuentaBancaria cuenta1 = new CuentaBancaria("Guillem", "111222333");
        System.out.println("");
        System.out.println(cuenta1.mostrarInformacion());
        System.out.println("");
        cuenta1.depositar(200);
        System.out.println("");
        cuenta1.retirar(100);
        System.out.println("");
        System.out.println(cuenta1.mostrarInformacion());
        System.out.println("");
        System.out.println(cuenta1.mostrarInformacion());
        System.out.println("");
        cuenta1.desactivarCuenta();
        System.out.println("");
        cuenta1.depositar(200);
        System.out.println("");
        System.out.println(cuenta1.mostrarInformacion());
    }

    public static void Actividad3()
    {
        Producto producto1 = new Producto("Refresco", 1.00, 1);
        Producto producto2 = new Producto("Patatas", 2, 2);
        System.out.println("");

        System.out.println(producto1.mostrarInformacion());
        System.out.println("");

        producto2.aumentarStock(15);
        System.out.println(producto2.mostrarInformacion());
        System.out.println("");

        producto1.aumentarStock(25);
        System.out.println(producto1.mostrarInformacion());
        System.out.println("");

        producto2.venderUnidades(3);
        System.out.println(producto2.mostrarInformacion());
        System.out.println("");
        
        producto2.venderUnidades(15);

    }
}
