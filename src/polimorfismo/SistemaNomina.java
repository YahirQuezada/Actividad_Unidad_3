/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;


/**
 *
 * @author Juana García
 */
import POL.*;
public class SistemaNomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Yahir"," Quezada","111",800.00);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Gerardo"," Romero","222",500,.04,300);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Yahir"," Romero","333",1000,.06);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Gerardo"," Quezada","444",16.75,40);
        
        System.out.println("Se procesan empleados por separado");
        
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoAsalariado,"Ingresos",empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoBaseMasComision,"Ingresos",empleadoBaseMasComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoPorComision,"Ingresos",empleadoPorComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoPorHoras,"Ingresos",empleadoPorHoras.ingresos());
        
        Empleado[] empleados = new Empleado[4];
        empleados[0]= empleadoAsalariado;
        empleados[1]= empleadoBaseMasComision;
        empleados[2]= empleadoPorComision;
        empleados[3]= empleadoPorHoras;
        
        for(Empleado empleadoActual:empleados){
            //Se invoca al metodo toString (me atuda a obtener los valores de mi ojeto)
            System.out.println(empleadoActual);
            if(empleadoActual instanceof EmpleadoBaseMasComision){
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision)empleadoActual;
                empleado.establecerSalarioBase(1.10*empleado.obtenerSalarioBase());
                System.out.printf("El nuevo salario Base con 10%% de incremento es $%,.2f\n",empleado.obtenerSalarioBase());
                
            }
            System.out.printf("Ingresos $%,.2f\n\n",empleadoActual.ingresos());
            
            //Se crea un for para obtener el nombre del tipo de cada objeto en el arreglo empleado
            
            for(int j=0;j<empleados.length;j++)
                System.out.printf("El empleado %d es un %s\n",j,empleados[j].getClass().getName());
            
            
        }
        }
    
    }
    

