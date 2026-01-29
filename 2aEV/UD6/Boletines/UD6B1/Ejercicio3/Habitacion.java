public class Habitacion 
{
    private String nombre;
    private double metrosCuadrados;

    public Habitacion(String nombre, double metrosCuadrados)
    {
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String toString()
    {
        return "Nombre: " + nombre + "\n" + "Metros Cuadrados: " + metrosCuadrados; 
    }
}
