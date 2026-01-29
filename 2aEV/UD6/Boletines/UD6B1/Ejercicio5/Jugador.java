public class Jugador 
{
    private String nombre;
    private Contrato contrato;

    public Jugador(String nombre, int duracionAnios, double salario)
    {
        this.nombre = nombre;
        this.contrato = new Contrato(duracionAnios, salario);
    }

    public String toString()
    {
        return "Jugador: " + nombre + "\nContrato: " + contrato;
    }
}
