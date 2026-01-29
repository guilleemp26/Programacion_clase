public class Contrato 
{
    private int duracionAnios;
    private double salario;

    public Contrato(int duracionAnios, double salario)
    {
        this.duracionAnios = duracionAnios;
        this.salario = salario;
    }

    public String toString()
    {
        return "Duración del contrato: " + duracionAnios + " temporadas\nSalario: " + salario;
    }
}
