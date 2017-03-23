
package GestionDePersonas;

public class PorHoras extends Empleado{
  
   private int precio;
    public PorHoras(){
        precio= 10;
    }
    public double calcularSueldo(int horas){
            double calculaSueldo= horas*precio;
            return calculaSueldo;
    }
    
}
