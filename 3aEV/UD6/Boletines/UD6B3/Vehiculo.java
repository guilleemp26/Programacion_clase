import java.time.LocalDate;


public abstract class Vehiculo 
{
    private static final String DEFAULT_STRING = "Desconocido";
    private static final double  DEFAULT_KILOMETROS = 0.0;
    private static int anioActual = LocalDate.now().getYear();

    private String matricula;
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private double kilometros;



    public Vehiculo(String matricula, String marca, String modelo, int anioFabricacion, double kilometros)
    {
        setMatricula(matricula);
        setMarca(marca);
        setModelo(modelo);
        setAnioFabricacion(anioFabricacion);
        setKilometros(kilometros);
    }
    public Vehiculo(String matricula, String marca, String modelo)
    {
        setMatricula(matricula);
        setMarca(marca);
        setModelo(modelo);
        this.anioFabricacion = anioActual;
        this.kilometros = DEFAULT_KILOMETROS;
    }

    public void setMatricula(String matricula)
    {
        if(matricula != null && !matricula.isBlank())
        {
            this.matricula = matricula;
        }
        else
        {
            System.out.println("Matrícula introducda no válida.");
            this.matricula = DEFAULT_STRING;
        }
    }
    public void setMarca(String marca)
    {
        if(marca != null && !marca.isBlank())
        {
            this.marca = marca;
        }
        else
        {
            System.out.println("Marca introducda no válida.");
            this.marca = DEFAULT_STRING;
        }
    }
    public void setModelo(String modelo)
    {
        if(modelo != null && !modelo.isBlank())
        {
            this.modelo = modelo;
        }
        else
        {
            System.out.println("Modelo introducdo no válido.");
            this.modelo = DEFAULT_STRING;
        }
    }
    public void setAnioFabricacion(int anioFabricacion)
    {
        if(anioFabricacion >= 1950 && anioFabricacion <= anioActual)
        {
            this.anioFabricacion = anioFabricacion;
        }
        else
        {
            System.out.println("Año introducido no válido.");
            this.anioFabricacion = anioActual;
        }
    }
    public void setKilometros(double kilometros)
    {
        if(kilometros >= 0)
        {
            this.kilometros = kilometros;
        }
        else
        {
            System.out.println("Kilometraje introducido no válido.");
            this.kilometros = DEFAULT_KILOMETROS;
        }
    }
    public void recorrer()
    {
        kilometros++;
        System.out.println("El " + modelo + " se está moviendo.");
    }
    public void mostrarInformacion()
    {
        System.out.println(toString());
    }
    public String toString()
    {
        return "Matrícula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + 
        "\nAño de fabricación: " + anioFabricacion + "\nKilómetros: " + kilometros;
    }

    public abstract double calcularCosteMantenimiento();
    public abstract String tipoVehiculo();

}
