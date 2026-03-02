public class Gerente extends Empleado 
{
    private double bonusAnual;
    private int equipoACargo;
    private static final double BONUS_ANUAL_DEFAULT = 0.0;
    private static final int EQUIPO_A_CARGO_DEFAULT = 0;

    public Gerente(String nombre, int edad, double salarioBase, double bonusAnual, int equipoACargo)
    {
        super(nombre, edad, salarioBase);
        setBonusAnual(bonusAnual);
        setEquipoACargo(equipoACargo);
    }

    public void setBonusAnual(double bonusAnual)
    {
        if(bonusAnual >= 0)
        {
            this.bonusAnual = bonusAnual;
        }
        else
        {
            System.out.println("El bonus anual introducido no es válido");
            this.bonusAnual = BONUS_ANUAL_DEFAULT;
        }
    }
    public void setEquipoACargo(int equipoACargo)
    {
        if(equipoACargo >= 0)
        {
            this.equipoACargo = equipoACargo;
        }
        else
        {
            System.out.println("El equipo a cargo introducido no es válido");
            this.equipoACargo = EQUIPO_A_CARGO_DEFAULT;
        }
    }
    public double getBonusAnual()
    {
        return bonusAnual;
    }
    public int getEquipoACargo()
    {
        return equipoACargo;
    }

    @Override
    public double calcularSalario()
    {
        return (super.calcularSalario() + bonusAnual);
    }

    public void dirigirReunion()
    {
        String mensaje = "El gerente " + nombre + " dirige a " + equipoACargo;
        if(equipoACargo == 1)
        {
            mensaje += " persona";
        }
        else
        {
            mensaje += " personas";
        }
        System.out.println(mensaje);
    }
}
