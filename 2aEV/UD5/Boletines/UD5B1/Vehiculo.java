public class Vehiculo 
{
    private String marca;
    private String modelo;
    private int anyoFabricacion;
    private double kilometraje;
    private String tipoCombustible;
    private boolean encendido;

    public Vehiculo(String marca, String modelo, int anyoFabricacion, String tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyoFabricacion = anyoFabricacion;
        this.tipoCombustible = tipoCombustible;
        this.kilometraje = 0;
        this.encendido = false;
    }

    public Vehiculo(String marca, String modelo, int anyoFabricacion, double kilometraje, String tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyoFabricacion = anyoFabricacion;
        this.tipoCombustible = tipoCombustible;
        this.kilometraje = kilometraje;
        this.encendido = false;
    }

    public Vehiculo(Vehiculo otro) {
        this.marca = otro.marca;
        this.modelo = otro.modelo;
        this.anyoFabricacion = otro.anyoFabricacion;
        this.kilometraje = otro.kilometraje;
        this.tipoCombustible = otro.tipoCombustible;
        this.encendido = otro.encendido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public boolean encender() {
        if (!encendido) {
            encendido = true;
            return true;
        }
        return false;
    }

    public boolean apagar() {
        if (encendido) {
            encendido = false;
            return true;
        }
        return false;
    }

    public boolean conducir(double distancia) {
        if (!encendido || distancia < 0) {
            return false;
        }
        kilometraje += distancia;
        return true;
    }

    public int calcularAntiguedad() {
        return 2026 - anyoFabricacion;
    }

    public String mostrarInformacion() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anyoFabricacion + 
               ", Combustible: " + tipoCombustible + ", Km: " + kilometraje + 
               ", Antigüedad: " + calcularAntiguedad() + " años, Estado: " + 
               (encendido ? "encendido" : "apagado");
    }

    @Override
    public String toString() {
        return mostrarInformacion();
    }
}

