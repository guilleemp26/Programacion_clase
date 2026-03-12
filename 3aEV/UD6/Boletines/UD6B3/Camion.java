public class Camion extends Vehiculo 
{
    private double capacidadCarga;
    private int numeroEjes;

    private static final int DEFAULT = 0;

    public Camion(String matricula, String marca, String modelo, int anioFabricacion, double kilometros)
    {
        super(matricula, marca, modelo, anioFabricacion, kilometros);
        setCapacidadCarga(capacidadCarga);
        setNumeroEjes(numeroEjes);
    }

    public void setCapacidadCarga(double capacidadCarga)
    {
        if(capacidadCarga > 0)
        {
            this.capacidadCarga = capacidadCarga;
        }
        else
        {
            System.out.println("Capacidad de carga introducida no válida.");
            this.capacidadCarga = DEFAULT;
        }
    }
    public void setNumeroEjes(int numeroEjes)
    {
        if(numeroEjes >= 2)
        {
            this.numeroEjes = numeroEjes;
        }
        else
        {
            System.out.println("Numero de ejes introducido no válido.");
            this.numeroEjes = DEFAULT;
        }
    }
    @Override
    public String tipoVehiculo()
    {
        return "Camión";
    }
    @Override
    public double calcularCosteMantenimiento()
    {
        return (500 + (numeroEjes * 150) + (capacidadCarga * 100));
    }
    @Override
    public String toString()
    {
        return super.toString() + "\nCapacidad de carga: " + capacidadCarga + "\nNumero de ejes: " + numeroEjes;
    }
}
