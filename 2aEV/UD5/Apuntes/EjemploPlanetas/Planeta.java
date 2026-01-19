class Planeta
{
    private String nombre;
    private double masa;          // en kg
    private Satelite[] satelites;
    private int contador;

    public Planeta(String nombre, double masa, int maxSatelites)
    {
        this.nombre = nombre;
        this.masa = masa;
        this.satelites = new Satelite[maxSatelites];
        this.contador = 0;
    }

    public void agregarSatelite(Satelite s)
    {
        if (contador < satelites.length)
        {
            satelites[contador] = s;
            contador++;
            System.out.println("Satélite " + s.getNombre() + " agregado al planeta " + nombre + ".");
        }
        else
        {
            System.out.println("El planeta " + nombre + " no puede tener más satélites.");
        }
    }

    public void mostrarDetalles()
    {
        System.out.println("\nPlaneta: " + nombre);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Satelites:");

        for (int i = 0; i < contador; i++)
        {
            //satelites[i].mostrarInfo();
            System.out.println(satelites[i]);
        }

        System.out.println();
    }
}