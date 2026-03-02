public class Main 
{
    public static void main(String[] args) 
    {
        Coche coche = new Coche("Nissan", "Juke", 2022, 5);
        Motocicleta moto = new Motocicleta("Yamaha", "YZF R125", 2019, 15);
        Camion camion = new Camion("Mercedes", "Mercedes-Benz Actros", 2018, 500);
        
        Vehiculo[] vehiculos = {coche, moto, camion};

        System.out.println("");

        for(Vehiculo vehiculo : vehiculos)
        {
            vehiculo.mostrarInfo();
            System.out.println("");
            System.out.println("Precio total: ");
            System.out.println(vehiculo.calcularPrecio());
            System.out.println("");
            System.out.println("-----------------");
        }
    }
}
