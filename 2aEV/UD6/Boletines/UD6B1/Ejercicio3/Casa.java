import java.util.ArrayList;

public class Casa 
{
    private String direccion;
    ArrayList<Habitacion> listaHabitaciones;

    public Casa(String direccion)
    {
        this.direccion = direccion;
        listaHabitaciones = new ArrayList<Habitacion>();
    }

    public void crearHabitacion(String nombre, double metrosCuadrados)
    {
        Habitacion habitacion = new Habitacion(nombre, metrosCuadrados);
        listaHabitaciones.add(habitacion);
        System.out.println("Se ha añadido la habitación a la casa");
    }

    public void mostrarHabitaciones()
    {
        for (Habitacion habitacion : listaHabitaciones)
        {
            System.out.println(habitacion);
        }
    }
}
