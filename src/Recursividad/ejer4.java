//crear un metodo llamado toBinary que recibe un numero entero en decimal
//y calcula y muestra por pantalla dicho numero en binario
//de forma iterativa y recursiva
package Recursividad;

public class ejer4 {

    public static void ejer1(int num) {
        int binario[] = new int[100];
        int z = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
                binario[z] = 0;
                z++;
            } else {
                binario[z] = 1;
                num--;
                num = num / 2;
                z++;
            }
        }
        Z--;
        while (z >= 0) {
            System.out.print(binario[z]);
            z--;
        }
    }
public static void ejer2(int num){
        StringBuilder sb= new StringBuilder();
        if(num<2){
            System.out.print(num);
        }else{
            if(num%2!=0){
                ejer2(num/2);
                sb.append("1");
            }else{
                ejer2(num/2);
                sb.append("0");
            }
        }
        System.out.print(sb);
        
    }
}
