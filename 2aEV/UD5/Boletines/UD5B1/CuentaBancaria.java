

public class CuentaBancaria 
{
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private boolean activa;

    public CuentaBancaria(String titular, String numeroCuenta)
    {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        saldo = 0;
        activa = true;
    }

    public String getTitular()
    {
        return titular;
    }

    public void setTitular(String titular)
    {
        this.titular = titular;
    }

    public String getNumeroCuenta()
    {
        return numeroCuenta;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public boolean getActiva()
    {
        return activa;
    }

    public void setActiva(boolean activa)
    {
        this.activa = activa;
    }

    public void depositar(double cantidadADepositar)
    {
        if(activa)
        {
            saldo += cantidadADepositar;
            System.out.println("Se ha realizado el ingreso correctamente");
        }
        else
        {
            System.out.println("La cuenta no está activa, por tanto no es posible ingresar dinero");
        }
    }

    public void retirar(double cantidadARetirar)
    {
        if(activa && (saldo >= cantidadARetirar) && cantidadARetirar >= 0)
        {
            saldo -= cantidadARetirar;
            System.out.println("Se ha retirado el dinero correctamente");
        }
        else
        {
            System.out.println("No se ha podido realizar la operación");
        }
    }

    public void desactivarCuenta()
    {
        activa = false;
        System.out.println("Cuenta desactivada correctamente");
    }

    public String mostrarInformacion()
    {
        

        return "Titular: " + titular + "\nNúmero de cuenta: " + numeroCuenta + "\nSaldo: " + saldo + "\nEstado de actividad de la cuenta: " + (activa ? " Activa" : " Inactiva");
    }
}
