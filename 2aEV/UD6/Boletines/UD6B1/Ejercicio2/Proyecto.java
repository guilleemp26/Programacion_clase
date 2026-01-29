public class Proyecto 
{
    private String nombre;
    private int duracionMeses;

    public Proyecto(String nombre, int duracionMeses)
    {
        this.nombre = nombre;
        this.duracionMeses = duracionMeses;
    }

    public String toString()
    {
        return "Nombre proyecto: " + nombre + "\n" + "Duración del proyecto: " + duracionMeses + " meses";
    }
}
