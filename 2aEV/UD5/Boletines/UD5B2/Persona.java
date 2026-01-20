

public class Persona 
{
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    private static int personas = 0;

    public Persona(String nombre, int edad, char sexo, double peso, double altura)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        personas++;
    }

    public Persona(String nombre, int edad, char sexo)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        peso = 0.0;
        altura = 0.0;
        personas++;
    }

    public Persona()
    {
        nombre = "Sin especificar";
        edad = 0;
        sexo = 'M';
        peso = 0.0;
        altura = 0.0;
        personas++;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        if (edad >= 0)
        {
            this.edad = edad;
        }
        else
        {
            System.out.println("No se ha podido establecer la edad");
        }
    }

    public char getSexo()
    {
        return sexo;
    }

    public void setSexo(char sexo)
    {
        if (comprobarSexo(sexo))
        {
            this.sexo = sexo;
        }
        else
        {
            sexo = 'M';
            System.out.println("Se ha aplicado el sexo \"M\" por defecto");
        }
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public static int getPersonas()
    {
        return personas;
    }

    public boolean esMayorDeEdad()
    {
        boolean esMayorDeEdad;

        if(edad >= 18)
        {
            esMayorDeEdad = true;
        }
        else
        {
            esMayorDeEdad = false;
        }

        return esMayorDeEdad;
    }

    private boolean comprobarSexo(char sexo)
    {
        boolean sexoCorrecto;

        if (sexo == 'H' || sexo == 'M')
        {
            sexoCorrecto = true;
        }
        else
        {
            sexoCorrecto = false;
        }

        return sexoCorrecto;
    }

    public int calcularIMC()
    {
        double imc = peso / Math.pow(altura, 2);
        int devolverValor;

        if (imc < 20)
        {
            devolverValor = -1;
        }
        else if (imc >= 20 && imc <= 25)
        {
            devolverValor = 0;
        }
        else
        {
            devolverValor = 1;
        }

        return devolverValor;
    }

    public String toString()
    {
        return "Paciente: " + nombre + "\n" + "Edad: " + edad + "\n" + "Sexo: " + sexo + "\n" + "Peso: " + peso + "\n" + "Altura: " + altura;
    }
}
