/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alquiler_de_Amarres;

import java.util.GregorianCalendar;

/**
 *
 * @author Vespertino
 */
public class Alquiler {

    private String DNI, nombre;
    private double eslora;
    private int añoFrabricacion;
    private int[] amarre= new int [];
    private int total = 5;
    private int añoFabricacion;

    public Alquiler(String DNI, String nombre, double eslora, int añoFabricacion, int año, int mes, int dia, int añoSalida, int mesSalida, int diaSalida) {
        GregorianCalendar fechaInicio = new GregorianCalendar(año, mes, dia);
        GregorianCalendar fechaFinal = new GregorianCalendar(añoSalida, mesSalida, diaSalida);
        this.nombre = nombre;
        this.eslora = eslora;
        this.añoFabricacion = añoFrabricacion;
        this.amarre[]=posicionAmarre;
    }

    public int posicionAmarre() {
        int i = 0;
        while (i >= total) {
            while (amarre[i] == 0) {
                amarre[i] = 1;
            }
            i++;
        }
        return i;
    }

    private int pocicioAmarre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
