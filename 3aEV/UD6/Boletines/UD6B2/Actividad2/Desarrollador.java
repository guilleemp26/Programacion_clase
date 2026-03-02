public class Desarrollador extends Empleado 
{
    private String lenguajePrincipal;
    private int horasExtra;
    private static final String LENGUAJE_DEFAULT = "Java";
    private static final int HORAS_EXTRA_DEFAULT = 0;
    private static final int MULTIPLICADOR_SALARIO = 25; 

    public Desarrollador(String nombre, int edad, double salarioBase, String lenguajePrincipal, int horasExtra)
    {
        super(nombre, edad, salarioBase);
        setHorasExtra(horasExtra);
        setLenguajePrincipal(lenguajePrincipal);
    }

    public void setLenguajePrincipal(String lenguajePrincipal)
    {
        if(!lenguajePrincipal.isEmpty())
        {
            this.lenguajePrincipal = lenguajePrincipal;
        }
        else
        {
            System.out.println("El lenguaje introducido no es válido");
            this.lenguajePrincipal = LENGUAJE_DEFAULT;
        }
    }
    public void setHorasExtra(int horasExtra)
    {
        if(horasExtra >= 0)
        {
            this.horasExtra = horasExtra;
        }
        else
        {
            System.out.println("Las horas extras introducidas no son válidas");
            this.horasExtra = HORAS_EXTRA_DEFAULT;
        }
    }

    public String getLenguajePrincipal()
    {
        return lenguajePrincipal;
    }
    public int getHorasExtra()
    {
        return horasExtra;
    }
    @Override
    public double calcularSalario()
    {
        return (super.calcularSalario() + (horasExtra * MULTIPLICADOR_SALARIO));
    }

    public void programar()
    {
        System.out.println("El programador " + nombre + " programa en " + lenguajePrincipal);
    }
}
