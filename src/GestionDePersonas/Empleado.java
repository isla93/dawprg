
package GestionDePersonas;

public class Empleado {
    private String nif;
    private String nombre;
    private int edad;
    public Empleado(String nif, String nombre, int edad){
        this.nif=nif;
        this.nombre= nombre;
        this.edad=edad;
    }
    @Override
    public String toString(){
        return "El nombre "+nombre+" Dni: "+nif+" Edad: "+edad+" Sueldo: "+ calculaSueldo();
    }
    public double calculaSueldo(int horas, int precio){
        double calculaSueldo = horas*precio;
        return calculaSueldo;
    }
}
