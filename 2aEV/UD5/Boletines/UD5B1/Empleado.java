
public class Empleado 
{
    private String nombreCompleto;
    private String puesto;
    private double salalrioMensual;
    private int antiguedad;
    private int idEmpleado;

    public Empleado(String nombreCompleto, String puesto, double salalrioMensual, int antiguedad, int idEmpleado)
    {
        this.nombreCompleto = nombreCompleto;
        this.puesto = puesto;
        if (salalrioMensual >= 0)
        {
            this.salalrioMensual = salalrioMensual;
        }
        if (antiguedad >= 0)
        {
            this.antiguedad = antiguedad;
        }
        this.idEmpleado = idEmpleado;
    }
    
    public Empleado(String nombreCompleto, String puesto, double salalrioMensual)
    {
        this.nombreCompleto = nombreCompleto;
        this.puesto = puesto;
        if (salalrioMensual >= 0)
        {
            this.salalrioMensual = salalrioMensual;
        }
        antiguedad = 0;
        idEmpleado = 111; //Marco 111 como id por defecto para indicar los que no lo han cambiado
    }

    public Empleado(String nombreCompleto)
    {
        this.nombreCompleto = nombreCompleto;
        puesto = "Sin asignar";
        salalrioMensual = 0;
        antiguedad = 0;
        idEmpleado = 111;
    }

    public String getNombre()
    {
        return nombreCompleto;
    }

    public void setNombre(String nombreCompleto)
    {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPuesto()
    {
        return puesto;
    }

    public void setPuesto(String puesto)
    {
        this.puesto = puesto;
    }

    public double  getSalario()
    {
        return salalrioMensual;
    }

    public void setSalario(double salario)
    {
        if (salalrioMensual >= 0)
        {
            this.salalrioMensual = salalrioMensual;
        }
        else
        {
            System.out.println("No se ha podido modificar el salario");
        }
    }

    public int getAntiguedad()
    {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad)
    {
        if (antiguedad >= 0)
        {
            this.antiguedad = antiguedad;
        }
        else
        {
            System.out.println("No se ha podido modificar la antiguedad");
        }
    }

    public int getIdEmpleado()
    {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado)
    {
        if(idEmpleado >= 0)
        {
            this.idEmpleado = idEmpleado;
        }
    }

    public void aumentarSalario(double cifraAumentar)
    {
        if (cifraAumentar >= 0)
        {
            salalrioMensual += cifraAumentar;
            System.out.println("Se ha aumentado el salario en " + cifraAumentar);
        }
        else
        {
            System.out.println("No se ha podido aumentar el salario");
        }        
    }

    public void cumplirAnios()
    {
        antiguedad += 1;
        System.out.println("Se ha cumplido un año satisfactoriamente. Ahora tienes " + antiguedad + " años en la empresa.");
    }

    public void calcularBonoAnual()
    {
        double bono = (salalrioMensual * 0.02) * antiguedad;
        System.out.println("El bono anual es de: " + bono);
    }

    public String mostrarInformacion()
    {
        return "Nombre Completo: " + nombreCompleto + "\nPuesto: " + puesto + "\nSalario Mensual: " + salalrioMensual + "\nAntiguedad: " + antiguedad + " años\nID Empleado: " + idEmpleado;
    }
    
}
