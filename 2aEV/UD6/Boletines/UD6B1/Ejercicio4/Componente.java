public class Componente 
{
    private String nombre;
    private double consumoWatts;

    public Componente(String nombre, double consumoWatts)
    {
        this.nombre = nombre;
        this.consumoWatts = consumoWatts;
    }

    public double getConsumo()
    {
        return consumoWatts;
    }

    public String toString()
    {
        return "Nombre: " + nombre + " | " + "Consumo: " +consumoWatts;
    }
}
