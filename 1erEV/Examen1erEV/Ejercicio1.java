import java.util.Random;
import java.util.Scanner;

public class Ejercicio1
{
    public static Scanner sc = new Scanner(System.in);
    public static final int minEdad = 1900;
    public static final int maxEdad = 2025;

    public static void main(String[] args) 
    {
        int opcion = mostrarMenu();

        switch (opcion) {
            case 1:
                opcion1();
                break;
            case 2:
                opcion2();
                break;
            case 3:
                opcion3();
                break;
            default:
                break;
        }

        sc.close();
    }
    public static int mostrarMenu()
    {
        

        int opcion = 0;
        do
        {
            System.out.print("\n" +
                         "----- Menú principal -----\n" +
                         "1. Comprobación de año bisiesto\n" +
                         "2. Búsqueda en array\n" +
                         "3. Cálculo de áreas\n" +
                         "\n" +
                         "0. Salir\n" +
                         "\n" +
                         "Seleccione una opción: "
                        );

            System.out.print("Introduzca la opción deseada: ");
            opcion = Integer.parseInt(sc.nextLine());
            
        }while(opcion != 0 && opcion != 1 && opcion != 2 && opcion != 3);
        
        return opcion;
    }
    public static void opcion1()
    {
        boolean anyoCorrecto;
        int anyoIntroducido;
        boolean esBisiesto;
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        do
        {
            System.out.print("Introduce tu año de nacimiento: ");
            anyoIntroducido = Integer.parseInt(sc.nextLine());
            anyoCorrecto = validarAnyo(anyoIntroducido);
        }while(!anyoCorrecto);
        
        esBisiesto = esBisiesto(anyoIntroducido);

        imprimirNombreNacimiento(nombre, anyoIntroducido, esBisiesto);
    }
    public static boolean validarAnyo(int anyoIntroducido)
    {
        if(anyoIntroducido >= minEdad && anyoIntroducido <= maxEdad)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean esBisiesto(int anyoIntroducido)
    {
        if(anyoIntroducido % 4 == 0 || anyoIntroducido % 100 == 0 && anyoIntroducido % 400 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void imprimirNombreNacimiento(String nombre, int anyoIntroducidom, boolean esBisiesto)
    {
        if(esBisiesto)
        {
            System.out.printf("%s, has nacido en %d, que es unaño bisiesto\n", nombre, anyoIntroducidom);
        }
        else
        {
            System.out.printf("%s, has nacido en %d, que es no unaño bisiesto\n", nombre, anyoIntroducidom);
        }
    }
    public static void opcion2()
    {
        System.out.print("Introduce el tamaño de la lista: ");
        int tamanyoLista = Integer.parseInt(sc.nextLine());

        int[] lista = crearArrayRango(tamanyoLista);

        System.out.print("Introduce un número a buscar el la lista: ");
        int numIntroducido = Integer.parseInt(sc.nextLine());

        int posNum = buscarPrimerIndice(lista, numIntroducido);
        boolean posValidada = validarIndice(numIntroducido, lista, posNum);
        if(!posValidada)
        {
            System.out.println("El número introducido no se encuentra en la lista");
        }
        else
        {
            int indiceNatural = indiceNatural(posNum);

            imprimirResultadosBusqueda(lista, indiceNatural);
        }
        
    }
    public static int[] crearArrayRango(int tamanyoLista)
    {
        Random random = new Random();
        int[] lista = new int[tamanyoLista];

        for(int i = 0; i < lista.length; i++)
        {
            lista[i] = random.nextInt(20 - 10 + 1) + 10;
        }
        return lista;
    }
    public static int buscarPrimerIndice(int[] lista, int numIntroducido)
    {
        
        int posNum = 0;

        for(int i = 0; i < lista.length; i++)
        {
            if(lista[i] == numIntroducido)
            {
                posNum = i;
            }
        }
        return posNum;

    }
    public static boolean validarIndice(int numIntroducido, int[] lista, int posNum)//Creo un método auxiliar para verificar que el núm introducido está en la posición
    {
        if(numIntroducido == lista[posNum])
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int indiceNatural(int posNum)
    {
        return ++posNum;
    }
    public static void imprimirResultadosBusqueda(int[] lista, int indiceNatural)
    {
        for(int i = 0; i < lista.length; i++)
        {
            System.out.print(lista[i] + " ");
        }
        System.out.println("");
        System.out.printf("El número que has introducido se encuentra en la posición %d de la lista", indiceNatural);
    }
    public static void opcion3()
    {
        double areaCirculo = 0;
        double areaTriangulo = 0;
        double areaRectangulo = 0;

        mostrarMenuFigura();
        int seleccionMenuFigura = seleccionMenuFigura();


        switch (validarSeleccionMenu(seleccionMenuFigura)) {
            case 1:
                System.out.print("Introduce el radio del círculo en cm: ");
                double radioCirculo = Double.parseDouble(sc.nextLine());
                areaCirculo = calcularAreaCirculo(radioCirculo);
                break;
            case 2:
                System.out.print("Introduce la base del triángulo en cm: ");
                double baseTriangulo = Double.parseDouble(sc.nextLine());
                System.out.print("Introduce la altura del triángulo en cm: ");
                double alturaTriangulo = Double.parseDouble(sc.nextLine());
                areaTriangulo = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
                break;
            case 3:
                System.out.print("Introduce la base del rectángulo en cm: ");
                double baseRectanculo = Double.parseDouble(sc.nextLine());
                System.out.print("Introduce la altura del rectángulo en cm: ");
                double alturaRectanculo = Double.parseDouble(sc.nextLine());
                areaRectangulo = calcularAreaRectangulo(baseRectanculo, alturaRectanculo);
            default:
                break;
        }
        double areaSeleccionada = almacenarAreas(areaCirculo, areaTriangulo, areaRectangulo);

        imprimirResultado(areaSeleccionada);
    }
    public static void mostrarMenuFigura()
    {
        System.out.print("---- Cálculo de áreas ----\n" +
                        "1. Círculo\n" +
                        "2. Triángulo\n" +
                        "3. Rectángulo\n" +
                        "Seleccione figura:");
    }
    public static int seleccionMenuFigura()
    {
        System.out.print("Introduce que cálculo quiere realizar: ");
        return Integer.parseInt(sc.nextLine());
    }
    public static int validarSeleccionMenu(int seleccionMenuFigura)
    {
        boolean numeroCorrecto = false;
        int numMenuValidado = 0;

        do
        {
            if(seleccionMenuFigura != 1 && seleccionMenuFigura != 2 && seleccionMenuFigura != 3)
            {
                numeroCorrecto = false;
                System.out.print("El número introducido no es válido, intente de nuevo: ");
                seleccionMenuFigura = Integer.parseInt(sc.nextLine());
            }
            else
            {
                numeroCorrecto = true;
                numMenuValidado = seleccionMenuFigura;
                
            }
        }while(numeroCorrecto == false);

        return numMenuValidado;
    }
    public static double calcularAreaCirculo(double radioCirculo)
    {
        return Math.PI * Math.pow(radioCirculo, 2);
    }
    public static double calcularAreaTriangulo(double baseTriangulo, double alturaTriangulo)
    {
        return (baseTriangulo * alturaTriangulo) / 2;
    }
    public static double calcularAreaRectangulo(double baseRectanculo, double alturaRectanculo)
    {
        return baseRectanculo * alturaRectanculo;
    }
    public static double  almacenarAreas(double areaCirculo, double areaTriangulo, double areaRectangulo)
    {
        if(areaCirculo != 0)
        {
            return areaCirculo;
        }
        else if(areaTriangulo != 0)
        {
            return areaTriangulo;
        }
        else
        {
            return areaRectangulo;
        }
    }
    public static void imprimirResultado(double areaSeleccionada)
    {
        System.out.println("");
        System.out.printf("El área de la figura seleccionada es: %.3fcm\n", areaSeleccionada);
    }
}