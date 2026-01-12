public class EstudioPodcast
{
    // ====== ATRIBUTOS ESTÁTICOS ======
    private static int contadorEstudios = 0;
    public static final int DURACION_MAXIMA_GRABACION = 180; // minutos

    // ====== ATRIBUTOS DE INSTANCIA ======
    private int id;
    private String nombre;
    private int capacidadPersonas;
    private boolean ocupado;

    // ====== CONSTRUCTOR SIN PARÁMETROS ======
    public EstudioPodcast()
	{
        contadorEstudios++;
        this.id = contadorEstudios;
        this.nombre = "Estudio sin nombre";
        this.capacidadPersonas = 1;
        this.ocupado = false;
    }

    // ====== CONSTRUCTOR CON PARÁMETROS ======
    public EstudioPodcast(String nombre, int capacidadPersonas)
	{
        contadorEstudios++;
        this.id = contadorEstudios;
        this.nombre = nombre;
        this.capacidadPersonas = capacidadPersonas;
        this.ocupado = false;
    }

    public EstudioPodcast(int capacidadPersonas)
    {
        contadorEstudios++;
        this.id = contadorEstudios;
        this.nombre = "Estudio sin nombre";
        this.capacidadPersonas = capacidadPersonas;
        this.ocupado = false;
    }

    // ====== MÉTODOS DE INSTANCIA ======
    public void iniciarGrabacion()
	{
        if (!ocupado)
		{
            ocupado = true;
            System.out.println("Grabación iniciada en el estudio " + nombre);
        }
		else
		{
            System.out.println("El estudio ya está ocupado.");
        }
    }

    public void finalizarGrabacion()
	{
        ocupado = false;
        System.out.println("Grabación finalizada en el estudio " + nombre);
    }

    // ====== GETTERS Y SETTERS ======
    public int getId()
	{
        return id;
    }

    public String getNombre()
	{
        return nombre;
    }

    public void setNombre(String nombre)
	{
        if (!nombre.isEmpty())
		{
            this.nombre = nombre;
        }
    }

    public int getCapacidadPersonas()
	{
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas)
	{
        if (capacidadPersonas > 0)
		{
            this.capacidadPersonas = capacidadPersonas;
        }
    }

    public boolean isOcupado()
	{
        return ocupado;
    }

    // ====== MÉTODO ESTÁTICO ======
    public static int getTotalEstudiosCreados()
	{
        return contadorEstudios;
    }
}
