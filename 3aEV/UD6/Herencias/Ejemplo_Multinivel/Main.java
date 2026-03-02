class SerVivo
{
    String nombre;

    SerVivo(String nombre)
	{
        this.nombre = nombre;
    }
}

class Animal extends SerVivo
{
    Animal(String nombre)
	{
        super(nombre);
    }
}

class Perro extends Animal
{
    Perro(String nombre)
	{
        super(nombre);
    }
}

public class Main
{
    public static void main(String[] args)
	{
        System.out.println("Creando un Perro...\n");
        Perro p = new Perro("Laika");
    }
}
