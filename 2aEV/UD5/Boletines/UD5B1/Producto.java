public class Producto 
{
    private String nombreProducto;
    private double precioUnidad;
    private int stock;
    private int idProducto;

    public Producto(String nombreProducto, double precioUnidad, int idProducto)
    {
        this.nombreProducto = nombreProducto;
        this.precioUnidad = precioUnidad;
        this.idProducto = idProducto;
        stock = 0;
    }

    public String getNombreProducto()
    {
        return nombreProducto;
    }

    public void setNombreProducto(String nuevoNombreProducto)
    {
        this.nombreProducto = nuevoNombreProducto;
    }

    public double getPrecioUnidad()
    {
        return precioUnidad;
    }

    public void getPrecioUnidad(double nuevoPrecioUnidad)
    {
        if (nuevoPrecioUnidad >= 0)
        {
            this.precioUnidad = nuevoPrecioUnidad;
        }
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int nuevoStock)
    {
        this.stock = nuevoStock;
    }

    public int getIdProducto()
    {
        return idProducto;
    }

    public void aumentarStock(int sumarStock)
    {
        if (sumarStock >= 0)
        {
            stock += sumarStock;
            System.out.println("Se ha aumentado el stock");
        }
        else
        {
            System.out.println("No ha sido posible aumentar el stock");
        }
    }

    public void venderUnidades(int restarStock)
    {
        if (restarStock <= stock)
        {
            stock -= restarStock;
            System.out.println("Se ha reducido el stock al siguiente producto: " + nombreProducto);
        }
        else
        {
            System.out.println("No ha sido posible vender las unidades del siguiente producto: "+ nombreProducto);
        }
    }

    public double calcularValorTotal()
    {
        return (stock * precioUnidad);
    }

    public String mostrarInformacion()
    {
        return "Nombre producto: " + nombreProducto + "\n" + "Precio: " + precioUnidad + "\n" + "Stock disponible: " + stock + "\n" + "ID Producto: " + idProducto;
    }

}
