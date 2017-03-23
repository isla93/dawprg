package Polimorfismo;
public class Cuadrado extends Figura {
    private double lado;
    public Cuadrado(double lado){
        this.lado = lado;
    }
    public double calcularPerímetro() {
        return 4 * lado;
    }
    public double calcularArea() {
        return lado * lado;
    }          
}
