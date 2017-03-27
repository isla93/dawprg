//crear 2 metodos, suma recursivo y suma iterativo, que reciba un string con un numero guardado internamente 
//y que calcule y devuelva la suma de los digitos de los dijitos de ese parametro 
package Recursividad;

public class ejer2 {

    
    public static void factorial(String num) {
        int ultimaPos;
        int x=0;
        if (num.length() == 1) {
            System.out.print(""+num);
        } else {
            ultimaPos = num.length() - 1;
            x=x+num.charAt(ultimaPos);
            System.out.print("" + num.charAt(ultimaPos));
            x=x+num.charAt(ultimaPos);
            factorial(num.substring(0, ultimaPos));
        }
        
    }

}
