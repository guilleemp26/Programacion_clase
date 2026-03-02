



public class Main 
{
    public static void main(String[] args) 
    {
        VehiculoEspacial vehiculo = new VehiculoEspacial("Sapacex", 1000, 2);
        Cohete cohete = new Cohete("Cohete", 800, 4, 4);
        NaveTripulada nave = new NaveTripulada("Navecilla", 500, 6, true);
        SondaEspacial sonda = new SondaEspacial("Sonda", 600, 0, "Investigar Marte");
        
        VehiculoEspacial[] lista = {vehiculo, cohete, nave, sonda};

        System.out.println("");
        System.out.println("-----Mostrando métodos Vehíulo Espacial-----");
        vehiculo.despegar();
        vehiculo.mostrarInformacion();
        System.out.println("");

        System.out.println("-----Mostrando métodos Cohete-----");
        cohete.mostrarInformacion();
        System.out.println("");

        System.out.println("-----Mostrando métodos Nave tripulada-----");
        nave.despegar();
        System.out.println("");
        
        System.out.println("-----Mostrando métodos Sonda Espacial-----");
        sonda.enviarDatos();
        sonda.mostrarInformacion();
        sonda.despegar();
        System.out.println("");
        
        System.out.println("-----Probando polimorfismos-----");
        for(VehiculoEspacial vehiculos : lista)
        {
            if(vehiculos instanceof Cohete)
            {
                cohete.mostrarInformacion();
                System.out.println("");
            }
            if(vehiculos instanceof NaveTripulada)
            {
                nave.mostrarInformacion();

            }
            if(vehiculos instanceof SondaEspacial)
            {
                sonda.mostrarInformacion();
            }
        }
    }
}
