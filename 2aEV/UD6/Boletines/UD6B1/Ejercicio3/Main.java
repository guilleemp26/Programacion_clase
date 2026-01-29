public class Main 
{
    public static void main(String[] args) 
    {
        Casa casa = new Casa("Calle Ministro Luis Mayans");
        
        casa.crearHabitacion("Baño", 10);
        casa.crearHabitacion("Cocina", 20);
        casa.crearHabitacion("Dormitorio", 15);

        casa.mostrarHabitaciones();
    }
}
