public class Disenyador extends Empleado
{
    private String herramienta;
    private int numeroProyecto;
    private static final String HERRAMIENTA_DEFAULT = "Photoshop";
    private static final int NUMERO_PROYECTO_DEFAULT = 0; 
    private static final int MULTIPLICADOR_SALARIO = 100;

    public Disenyador(String nombre, int edad, double salarioBase, String herramienta, int numeroProyecto)
    {
        super(nombre, edad, salarioBase);
        setHerramienta(herramienta);
        setNumeroProyecto(numeroProyecto);
    }

    public void setHerramienta(String herramienta)
    {
        if(!herramienta.isBlank())
        {
            this.herramienta = herramienta;
        }
        else
        {
            System.out.println("La herramienta introducida no es válida.");
            this.herramienta = HERRAMIENTA_DEFAULT;
        }
        }
    public void setNumeroProyecto(int numeroProyecto)
    {
        if(numeroProyecto >= 0)
        {
            this.numeroProyecto = numeroProyecto;
        }
        else
        {
            System.out.println("El número de proyectos insertado no es válido.");
            this.numeroProyecto = NUMERO_PROYECTO_DEFAULT;
        }

    }

    public String getHerramienta()
    {
        return herramienta;
    }
    public int getNumeroProyecto()
    {
        return numeroProyecto;
    }

    @Override
    public double calcularSalario()
    {
        return (super.calcularSalario() + (numeroProyecto * MULTIPLICADOR_SALARIO));
    }

    public void crearDisenyo()
    {
        System.out.println("El diseñador " + nombre + " usa la herramienta " + herramienta);
    }
}
