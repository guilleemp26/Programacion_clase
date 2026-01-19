import java.util.Scanner;

public class Main 
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        Actividad5();
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

    public static void Actividad4()
    {
        Empleado empleado1 = new Empleado("Guillem", "Secretario", 3000, 5, 1);
        System.out.println(empleado1.mostrarInformacion());
        System.out.println("");

        empleado1.aumentarSalario(200);
        System.out.println(empleado1.mostrarInformacion());
        System.out.println("");

        empleado1.cumplirAnios();
        System.out.println(empleado1.mostrarInformacion());
        System.out.println("");

        empleado1.calcularBonoAnual();
        System.out.println("");
    }

    public static void Actividad5()
    {
        // Constructor simplificado (sin año ni kilometraje)
        Vehiculo v1 = new Vehiculo("Toyota", "Corolla", 2020, "Gasolina");
        System.out.println(v1.mostrarInformacion());
        System.out.println("");
        
        // Constructor completo
        Vehiculo v2 = new Vehiculo("Ford", "Focus", 2015, 50000, "Diésel");
        System.out.println(v2.mostrarInformacion());
        System.out.println("");
        
        // Encender y conducir
        v2.encender();
        v2.conducir(100);
        System.out.println(v2.mostrarInformacion());
        System.out.println("");
        
        // Apagar
        v2.apagar();
        System.out.println(v2.mostrarInformacion());
        System.out.println("");
        
        // Constructor copia
        Vehiculo v3 = new Vehiculo(v2);
        System.out.println("Copia de v2:");
        System.out.println(v3.mostrarInformacion());
        System.out.println("");
        
        // Modificar v2 para demostrar independencia
        v2.setMarca("BMW");
        System.out.println("v2 modificado: " + v2.getMarca());
        System.out.println("v3 sin cambios: " + v3.getMarca());
    }
}
