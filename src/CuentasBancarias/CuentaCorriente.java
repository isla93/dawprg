package CuentasBancarias;

public class CuentaCorriente extends NumeroDeCuenta {

    private double saldo;
    private NumeroDeCuenta numCuenta;
    private Titular titular;

    public CuentaCorriente(Titutlar titular) {
        this.titular = titular;
        this.numCuenta = numCuenta;
    }

    public CuentaCorriente() {
        super(NumeroDeCuenta, Titular, saldo = 15, 3);
    }

    public void ingresar(double meterDinero) {
        saldo = saldo + meterDinero;
    }

    public void reintegro(double sacar) {
        saldo = saldo - sacar;
    }

}
