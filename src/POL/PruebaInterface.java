/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package POL;

/**
 *
 * @author invitado
 */
import POL.*;
public class PruebaInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //uso de interface POR PAGAR
        PorPagar[] objetosPorPagar = new PorPagar[4];
        
    
    // se llama al arreglo con objetos que implementan la interfas: "PorPagar"
    objetosPorPagar[0] = new Factura("0123","silla",2,375.00);
    objetosPorPagar[1] = new Factura("01234","escritorio",3,79.55);
    
    objetosPorPagar[2] = new EmpleadoAsalariado("Luis","Escobar","1111",800.00);
    objetosPorPagar[3] = new EmpleadoAsalariado("Luisa","Reyes","2222",1800.00);
    
        System.out.println("Facturas y Empleados procesados en forma polimorfica: \n");
    // se procesan de forma generica cada elemento del arreglo *objetosPorPagar*
        
        for(PorPagar porPagarActual:objetosPorPagar){
            // se imprime por Pagar Actual y su monto de pago apropiado
            
            System.out.printf("%s \n%s: $%,.2f\n\n)",porPagarActual.toString(),"Pago conocido";
        }
    
    
    
    }
}
