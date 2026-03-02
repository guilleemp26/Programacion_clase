public class SondaEspacial extends VehiculoEspacial 
{
    private String tipoMision;
    
    public SondaEspacial(String nombre, double velocidadMaxima, int capacidadTripulacion, String tipoMision)
    {
        super(nombre, velocidadMaxima, capacidadTripulacion);
        this.tipoMision = tipoMision;
    }

    public void mostrarInformacion()
    {
        super.mostrarInformacion();
        System.out.println("Tipo de misión: " + tipoMision);
    }
    public void enviarDatos()
    {
        System.out.println("La sonda " + super.nombre + " está enviadndo datos sobre la misión " + tipoMision);
    }
}
