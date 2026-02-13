public class Festival
{
    private String nombre;
    private String ciudad;
    private Escenario[] escenarios;
    private int numEscenarios = 0;
    private int codigo;
    private static int totalFestivales = 0;

    public Festival(String nombre, String ciudad, int maxEscenarios)
    {
        setNombre(nombre);
        setCiudad(ciudad);
        escenarios = new Escenario[maxEscenarios];
        totalFestivales++;
    }

    public void setNombre(String nombre)
    {
        if(!nombre.isEmpty())
        {
            this.nombre = nombre.trim();
        }
    }
    public void setCiudad(String ciudad)
    {
        if(!ciudad.isEmpty())
        {
            this.ciudad = ciudad.trim();
        }
    }

    public boolean  addEscenario(Escenario escenario)
    {
        boolean anyadido = false;
        if(numEscenarios < escenarios.length)
        {
            this.escenarios[numEscenarios] = escenario;
            numEscenarios++;
            anyadido = true;
        }
        return anyadido;
    }
    public String toString()
    {
        return "Festival: " + nombre + "\nCiudad: " + ciudad + "\nEscenarios totales: " + numEscenarios
        + "\n" + getEscenarios();
    }
    public String getEscenarios()
    {
        String listaEscenarios = "Escenarios: ";
        for(int i = 0;i < numEscenarios;i++)
        {
            listaEscenarios += escenarios[i];
        }
        return listaEscenarios;
    }

    public static int getTotalFestivales()
    {
        return totalFestivales;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getCiudad()
    {
        return ciudad;
    }
    public int getNumEscenarios()
    {
        return numEscenarios;
    }
    public int getCodigo()
    {
        return codigo;
    }
}
