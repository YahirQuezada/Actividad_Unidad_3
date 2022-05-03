/*
 Se crea java class facruta para hacer uso de interface
 */

package POL;

/**
 *
 * @author invitado
 */
public class Factura implements PorPagar{
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    //Se crea constructor
    
    public Factura(String pieza, String descripcion, int cuenta, double precio) {
        numeroPieza = pieza;
        descripcionPieza = descripcion;
        //Se llaman metodos
        establecerCantidad(cuenta);
        establecerPrecioPorArticulo(precio);
        
    }
    //Se desarrollan metodos get/set para el resto de las variables
    public void establecerNumeroPieza(String pieza){
        numeroPieza= pieza;
    }
    public String obtenerNumeroPieza(){
        return numeroPieza;
    }
    public void establecerDescripcionPieza(String descripcion){
        descripcionPieza= descripcion;
    }
    public String obtenerDescripcionPieza(){
        return descripcionPieza;
    }
    public void establecerCantidad(int cuenta){
        if(cuenta>=0)
            cantidad=cuenta;
        else
            throw new IllegalArgumentException("La cantidad debe ser mayor o igual a cero");
    }
    public int obtenerCantidad(){
        return cantidad;
    }
    public void establecerPrecioPorArticulo(double precio){
        if(precio>=00.0)
            precioPorArticulo = precio;
        else
            throw new IllegalArgumentException("El precio por articulo debe ser mayor o igual a cero");
    }
    public double obtenerPrecioPorArticulo(){
        return precioPorArticulo;
    }
    @Override
    
    public String toString(){
        return String.format("%s:\n%s:%s(%s)\n%s: %d \n%s: $%,.2f","numero de pieza",obtenerNumeroPieza(),obtenerDescripcionPieza(),"cantidad",obtenerCantidad(),"precio por articulo",obtenerPrecioPorArticulo());
    }
    @Override
    public double obtenerMontoPago(){
        //Se calcula el costo total
        return obtenerCantidad()*obtenerPrecioPorArticulo();
    }
}
