import java.util.Scanner;

public class Main 
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        Persona prueba = new Persona("prueba", 19, 'H', 62, 1.75);
        System.out.println(prueba.calcularIMC());
        System.out.println("Hay " + Persona.getPersonas() + "pacientes registrados");
    }

    public static void Actividad1()
    {
        System.out.println("Introduzca los datos del primer paciente: ");
        Persona paciente1 = new Persona(leerNombrePaciente(), leerEdadPaciente(), leerSexoPaciente(), leerPesoPaciente(), leerAlturaPaciente());
        System.out.println("");

        System.out.println("Introduzca los datos del segundo paciente: ");
        Persona paciente2 = new Persona(leerNombrePaciente(), leerEdadPaciente(), leerSexoPaciente());
        
        System.out.println("Segundo paciente creado");
        Persona paciente3 = new Persona();

        paciente2.setAltura(leerAlturaPaciente());
        paciente2.setPeso(leerPesoPaciente());

        paciente3.setNombre(leerNombrePaciente());
        paciente3.setEdad(leerEdadPaciente());
        paciente3.setSexo(leerSexoPaciente());
        paciente3.setAltura(leerAlturaPaciente());
        paciente3.setPeso(leerPesoPaciente());

        switch (paciente1.calcularIMC()) 
        {
            case -1:
                System.out.println("El paciente está por debajo de su peso ideal");
                break;
            case 0:
                System.out.println("El paciente está en su peso ideal");
                break;
            case 1:
                System.out.println("El paciente está por encima de su peso ideal");
            default:
                throw new AssertionError();
        }

        switch (paciente2.calcularIMC()) 
        {
            case -1:
                System.out.println("El paciente está por debajo de su peso ideal");
                break;
            case 0:
                System.out.println("El paciente está en su peso ideal");
                break;
            case 1:
                System.out.println("El paciente está por encima de su peso ideal");
            default:
                throw new AssertionError();
        }

        switch (paciente3.calcularIMC()) 
        {
            case -1:
                System.out.println("El paciente está por debajo de su peso ideal");
                break;
            case 0:
                System.out.println("El paciente está en su peso ideal");
                break;
            case 1:
                System.out.println("El paciente está por encima de su peso ideal");
            default:
                throw new AssertionError();
        }

        if (paciente1.esMayorDeEdad())
        {
            System.out.println("El paciente es mayor de edad");
        }
        else
        {
            System.out.println("El paciente es menor de edad");
        }

        if (paciente2.esMayorDeEdad())
        {
            System.out.println("El paciente es mayor de edad");
        }
        else
        {
            System.out.println("El paciente es menor de edad");
        }

        if (paciente3.esMayorDeEdad())
        {
            System.out.println("El paciente es mayor de edad");
        }
        else
        {
            System.out.println("El paciente es menor de edad");
        }

        System.out.println(paciente1.toString());
        System.out.println(paciente2.toString());
        System.out.println(paciente3.toString());

        System.out.println("Hay " + Persona.getPersonas() + " pacientes registrados");
    }

    public static String leerNombrePaciente()
    {
        System.out.print("Introduzca el nombre del paciente: ");
        return sc.nextLine();
    }
    public static int leerEdadPaciente()
    {
        System.out.print("Introduzca la edad del paciente: ");
        return Integer.parseInt(sc.nextLine());
    }
    public static char leerSexoPaciente()
    {
        System.out.print("Introduzca el sexo del paciente ( H / M ): ");
        String leerSexo = sc.nextLine();
        return leerSexo.charAt(0);
    }
    public static double leerAlturaPaciente()
    {
        System.out.print("Introduzca la altura del paciente: ");
        return sc.nextDouble();
    }
    public static double leerPesoPaciente()
    {
        System.out.print("Introduzca el peso del paciente: ");
        return sc.nextDouble();
    }
}
