public class Empleado 
{
    protected String nombre;
    protected int edad;
    protected double salarioBase;
    private static final String NOMBRE_DEFAULT = "Desconocido";
    private static final int EDAD_DEFAULT = 18;
    private static final double SALARIO_DEFAULT = 0;

    public Empleado(String nombre, int edad, double salarioBase)
    {
        setNombre(nombre);
        setEdad(edad);
        setSalarioBase(salarioBase);
    }

    public void setNombre(String nombre)
    {
        if(nombre == null || nombre.isEmpty())
        {
            System.out.println("El nombre introducido es inválido");
            this.nombre = NOMBRE_DEFAULT;
        }
        else
        {
            this.nombre = nombre;
        }
    }
    public void setEdad(int edad)
    {
        if(edad >= 18)
        {
            this.edad = edad;
        }
        else
        {
            System.out.println("La edad introducida no es válida");
            this.edad = EDAD_DEFAULT;
        }
    }
    public void setSalarioBase(double salarioBase)
    {
        if(salarioBase >= 0)
        {
            this.salarioBase = salarioBase;
        }
        else
        {
            System.out.println("El salario introducido no es válido");
            this.salarioBase = SALARIO_DEFAULT;
        }
    }

    public String getNombre()
    {
        return nombre;
    }
    public int getEdad()
    {
        return edad;
    }
    public double getSalarioBase()
    {
        return salarioBase;
    }

    public double calcularSalario()
    {
        return salarioBase;
    }
    public void trabajar()
    {
        System.out.println("El empleado " + nombre + " está trabajando.");
    }
    @Override
    public String toString()
    {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nSalario base: " + salarioBase;
    }
}
