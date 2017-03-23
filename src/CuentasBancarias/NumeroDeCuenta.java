package CuentasBancarias;

public class NumeroDeCuenta extends Titular {

    private String atributosBanco, sucursal, digitoDeControl, numDeCuenta;

    public NumeroDeCuenta(String nombre, String apellido, int edad, String atributosBanco, String sucursal, String digitoDeControl, String numDeCuenta) {
        super(nombre, apellido, edad);
        setAtributosBanco(atributosBanco);
        setSucursal(sucursal);
        setDigitoDeControl(digitoDeControl);
        setNumDeCuenta(numDeCuenta);
    }

    public String getAtributosBanco() {
        return atributosBanco;
    }

    public String getSucursal() {
        return sucursal;
    }

    public String getDigitoDeControl() {
        return digitoDeControl;
    }

    public String getNumDeCuenta() {
        return numDeCuenta;
    }

    public void setAtributosBanco(String atributosBanco) {
        if (atributosBanco.length() == 4) {
            this.atributosBanco = atributosBanco;
        }
    }

    public void setSucursal(String sucursal) {
        boolean sw = false;
        if (sucursal.length() == 4) {
            for (int i = 0; i < sucursal.length(); i++) {
                if (sucursal.charAt(i) < '0' || sucursal.charAt(i) > '9') {
                    System.out.println("Error no se puede meter letras");
                    sw = true;
                    break;
                }
            }
            if (!sw) {
                this.sucursal = sucursal;
            } else {
                this.sucursal = null;
            }
        } else {
            System.out.println("");
            this.sucursal = null;
        }
    }

    public void setDigitoDeControl(String digitoDeControl) {
        if (digitoDeControl.length() == 2) {
            this.digitoDeControl = digitoDeControl;
        }
    }

    public void setNumDeCuenta(String numDeCuenta) {
        if (numDeCuenta.length() == 10) {
            this.numDeCuenta = numDeCuenta;
        }
    }
}
