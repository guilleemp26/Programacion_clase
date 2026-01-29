public class Main 
{
    public static void main(String[] args) 
    {
        Proyecto proyecto1 = new Proyecto("1", 6);
        Proyecto proyecto2 = new Proyecto("2", 6);    
        Proyecto proyecto3 = new Proyecto("3", 6);
        Proyecto proyecto4 = new Proyecto("4", 6);

        Empresa empresa = new Empresa("Empresita");

        empresa.asignarProyecto(proyecto1);
        empresa.asignarProyecto(proyecto2);
        empresa.asignarProyecto(proyecto3);
        empresa.asignarProyecto(proyecto4);

        empresa.listarProyectos();
    }
}
