package Polimorfismo;
public class Circulo extends Figura {
    private double radio;
    public Circulo(double radio) {
        radio = 0;
        this.radio = radio;
    }
    public double calcularPerímetro() {
        double perimetro;
        perimetro = 0;
        perimetro = 2 * 3.1416 * radio;
        return perimetro;
    }
    public double calcularArea() {
        this.radio = radio * radio;
        return 3.1416 * radio;
    }
}
