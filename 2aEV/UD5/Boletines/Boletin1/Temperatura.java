public class Temperatura 
{
    private double  celsius;

    public Temperatura(double  celsius)
    {
        this.celsius = celsius;
    }

    public double getCelsius()
    {
        return celsius;
    }

    public void setCelsius(double celsius)
    {
        this.celsius = celsius;
    }

    public double celsiusAFarenheit()
    {
        return ((celsius * 9) / 5 + 32);
    }

    public double celsiusAKelvin()
    {
        return (celsius + 273.15);
    }

    public void mostrarConversiones()
    {
        System.out.print("Conversiones: \n" +
                          "Celsius: " + celsius + "\n" + 
                          "Farenheit: " + celsiusAFarenheit() + "\n" + 
                          "Kelvin: " + celsiusAKelvin() + "\n"
                         );
    }
}
