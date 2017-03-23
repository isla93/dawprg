package Polimorfismo;

public class Triangulo extends Figura {

    private double altura;
    private double lado;
    private double base;

    public Triangulo(double altura, double lado, double base) {

        this.altura = altura;
        this.lado = lado;
        this.base = base;
    }

    public double calcularPerímetro() {
        return altura + lado + base;

    }

    public double calcularArea() {
        return (base * altura) / 2;
    }
}
