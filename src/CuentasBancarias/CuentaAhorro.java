
package CuentasBancarias;

public class CuentaAhorro extends NumeroDeCuenta{
private double interes;
private int saldo;
public CuentaAhorro (Titular titular, NumeroDeCuenta numeroDeCuenta, double saldo, double interes){
   super(Titular, NumeroDeCuenta);
   this.saldo=saldo;
   this.interes=interes;
    
}
}
