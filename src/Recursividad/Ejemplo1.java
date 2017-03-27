package Recursividad;

import jdk.nashorn.internal.objects.NativeString;

public class Ejemplo1 {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static String iterativo(String n){
        if (n.length()==1){
            System.out.println(""+n);
        }
        
        int z=0;
        int x=n.length();
        while(z<=(n.length()-1)){
            System.out.print(n.charAt(x));
            x--;z++;
                   }
        return true;
          
    }
}
    

//Crear dos metodos, darVueltasRecursivo y darVueltaIterativo que reciba un string con un numero 
//y muestre por pantalla dicho numero al-reves
