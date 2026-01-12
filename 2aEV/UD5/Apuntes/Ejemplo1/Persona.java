class Persona 
{
    // Atributos de instancia (cada objeto tiene los suyos)
    private String nombre;
    private int edad;
    private String ciudad;

    // Atributo estático (compartido por todas las instancias)
    private static int contadorPersonas = 0;


    // Constructor
    public Persona(String nombre, int edad, String ciudad) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;

        // Cada vez que se crea una nueva Persona, incrementa el contador
        contadorPersonas++;
    }


    public void mostrarInfo() 
    {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Ciudad: " + ciudad);
    }


    public void cumplirAnyo()
    {
        edad++;
    }

    // Método estático: no pertenece a un objeto concreto, sino a la clase
    public static int obtenerContador()
    {
        return contadorPersonas;
    }


    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nuevoNombre) 
    {
        this.nombre = nuevoNombre;
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int nuevaEdad)
    {
        this.edad = nuevaEdad;
    }

    public String getCiudad()
    {
        return ciudad;
    }

    public void setCiudad(String nuevaCiudad)
    {
        this.ciudad = nuevaCiudad;
    }
}