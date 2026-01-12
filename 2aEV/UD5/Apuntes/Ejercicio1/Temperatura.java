public class Temperatura 
{
    private double celsius;

    public Temperatura(double celsius)
    {
        this.celsius = celsius;
    }

    public double getCelsius(double celsius)
    {
        return celsius;
    }

    public void setCelsius(double newCelsius)
    {
        this.celsius = newCelsius;
    }

    public double aFarenheit(double celsius)
    {
        return (celsius * 1.8) + 32;
    }

    public double aKelvin(double celsius)
    {
        return celsius + 273.15;
    }

    public void mostrarResultados()
    {
        System.out.print("Temperatura inicial: " + celsius + "ºC\n" +
                         "Temperatura en Farenheit: " + aFarenheit(celsius) + "F\n" +
                         "Temperatura en Kelvin: " + aKelvin(celsius) + "K\n"
                        );
    }
}
