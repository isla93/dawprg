//realizrar un metodo iterativo y recursivo que dado un array con numeros aleatorios
//calcula y devuelve la suma de los numeros de la array 
//
package Recursividad;

public class ejer5 {

    public ejer5() {
        int[] numeros = new int[10];
    }

    public static void rellenaArray() {
        int x = 0;
        while (z > x) {
            int numeroAleatorio = (int) (Math.random() * 25 + 1);
            numeros[x] = numeroAleatorio;
            x++;
        }
        x--;
    }

    public static void ejer1() {
        int z = 10;
        int x = 0;
        int numeros[] = new int[z];
        while (z > x) {
            int numeroAleatorio = (int) (Math.random() * 25 + 1);
            numeros[x] = numeroAleatorio;
            x++;
        }
        x--;
        while (x >= 0) {
            System.out.println(numeros[x]);
            x--;
        }
    }

    public static void ejer2(int c) {
        rellenaArray();
        int y = c;
        int p = 0;

        if (numeros[0] == numeros.length) {
            System.out.println(p);

        } else {
            ejer2(y--);
            p = numeros[y];
            System.out.println(p);
        }

    }
}
