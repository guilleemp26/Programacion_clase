class Satelite
{
    private String nombre;
    private double periodoOrbital; // en días
    private double distancia;      // en km al planeta

    public Satelite(String nombre, double periodoOrbital, double distancia)
    {
        this.nombre = nombre;
        this.periodoOrbital = periodoOrbital;
        this.distancia = distancia;
    }

    public void mostrarInfo()
    {
        System.out.println("  Satélite: " + nombre + " - Periodo orbital: " + periodoOrbital + " días - Distancia al planeta: " + distancia + " km");
    }

    public String toString()
    {
        return "  Satélite: " + nombre + " - Periodo orbital: " + periodoOrbital + " días - Distancia al planeta: " + distancia + " km";
    }

    public String getNombre()
    {
        return nombre;
    }
}