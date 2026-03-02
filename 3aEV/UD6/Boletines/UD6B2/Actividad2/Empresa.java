public class Empresa 
{
    public static void main(String[] args) 
    {
        Empleado[] empleados = crearListaEmpleados();
        mostrarEmpleados(empleados);
        System.out.println("");
        mostrarMetodosEspecificos(empleados);
        System.out.println("");
        System.out.println("El gasto total de la empresa es: " + calcularGastoTotal(empleados));
        contarPorTipo(empleados);
        System.out.println("");
        subirSalarioDesarrolladores(empleados);
        probarValidaciones();
    }   








    
    public static Empleado[] crearListaEmpleados()
    {
        Empleado desarrollador1 = new Desarrollador("Guillem", 19, 1400, "Java", 2);
        Empleado desarrollador2 = new Desarrollador("Jackson", 18, 1500, "JavaScript", 4);
        Empleado disenyador1 = new Disenyador("Alexis", 20, 1600, "Photoshop", 2);
        Empleado disenyador2 = new Disenyador("Raúl", 21, 1700, "Photoshop", 2);
        Empleado gerente1 = new Gerente("Saray", 18, 1800, 500, 3);
        Empleado gerente2 = new Gerente("Isabel", 23, 1900, 500, 3);

        Empleado[] empleados = {desarrollador1, desarrollador2, disenyador1, disenyador2, gerente1, gerente2};
        return empleados;
        
    }
    public static void mostrarEmpleados(Empleado[] empleados)
    {
        System.out.println("----- Empleados -----");
        for(Empleado empleado : empleados)
        {
            System.out.println(empleado);
            System.out.println("");
        }
    }
    public static void mostrarMetodosEspecificos(Empleado[] empleados)
    {
        for(Empleado empleado : empleados)
        {
            if(empleado instanceof Desarrollador)
            {
                ((Desarrollador) empleado).programar();
            }
            else if(empleado instanceof  Disenyador)
            {
                ((Disenyador) empleado).crearDisenyo();
            }
            else if(empleado instanceof Gerente)
            {
                ((Gerente) empleado).dirigirReunion();
            }
        }
    }
    public static double calcularGastoTotal(Empleado[] empleados)
    {
        double gastoTotal = 0;
        for(Empleado empleado : empleados)
        {
            gastoTotal += empleado.calcularSalario();
        }
        return gastoTotal;
    }
    public static void contarPorTipo(Empleado[] empleados)
    {
        int totalDesarrollador = 0;
        int totalDisenyador = 0;
        int totalGerente = 0;
        for(Empleado empleado : empleados)
        {
            if(empleado instanceof Desarrollador)
            {
                totalDesarrollador++;
            }
            else if(empleado instanceof  Disenyador)
            {
                totalDisenyador++;
            }
            else if(empleado instanceof Gerente)
            {
                totalGerente++;
            }
        }
        System.out.println("Total desarrolladores: " + totalDesarrollador + "\nTotal diseñadores: " + totalDisenyador + "\nTotal Gerentes" + totalGerente);
    }
    public static void subirSalarioDesarrolladores(Empleado[] empleados)
    {
        for(Empleado empleado : empleados)
        {
            if(empleado instanceof Desarrollador)
            {
                empleado.setSalarioBase( empleado.salarioBase * 1.1);
                System.out.println("Salarios modificados: ");
                System.out.println(empleado);
                System.out.println("");
            }
        }
    }
    public static void probarValidaciones()
    {
        System.out.println("Creando desarrollador...");
        Empleado desarrollador1 = new Desarrollador("", 1, 0, "", 0);
        System.out.println("");
        System.out.println("Creando diseñador...");
        Empleado disenyador1 = new Disenyador("", 0, 0, "", 0);
        System.out.println("");
        System.out.println("Creando gerente...");
        Empleado gerente1 = new Gerente("", 0, 0, 0, 0);;

        System.out.println("");
        System.out.println("Mostrando empleados creados con datos por defecto...");
        System.out.println(desarrollador1);
        ((Desarrollador) desarrollador1).programar();
        System.out.println("");
        System.out.println(disenyador1);
        ((Disenyador) disenyador1).crearDisenyo();
        System.out.println("");
        System.out.println(gerente1);
        ((Gerente) gerente1).dirigirReunion();
    }
}
