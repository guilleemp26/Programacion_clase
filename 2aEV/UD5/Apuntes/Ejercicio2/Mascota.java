public class Mascota 
{
    private String nombre;
    private String especie;
    private int edad;

    private static int contadorMascotas = 0;

    public Mascota(String nombre, String especie, int edad)
    {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;

        contadorMascotas++;
    }

    public void setNombre(String nuevoNombre) 
    {
        this.nombre = nuevoNombre;
    }

    public String getNombre(String nombre)
    {
        return nombre;
    }

    public void setEspecie(String nuevaEspecie) 
    {
        this.especie = nuevaEspecie;
    }

    public String getEspecie(String especie)
    {
        return especie;
    }

    public void setEdad(int nuevaEdad)
    {
        this.edad = nuevaEdad;
    }

    public void cumplirAños(int edad)
    {
        edad++;
    }

    public void mostrarInfo()
    {
        System.out.println("Nombre: " + nombre + "\n" +
                           "Especie: " + especie + "\n" +
                           "Edad: " + edad + "\n" + 
                           "Mascotas totales: " + contadorMascotas
                          );
    }
}
