package Herencia;

/**
 *
 * @author Vespertino
 */
public class Punto {

    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this(0, 0);
    }

    @Override 
    public String toString() {
        return "El valor de x es: " + this.x + " \n El valor de y es " + y;
    }
    /**
     * 
     * @Override
     * @return
     */
   
    
    public boolean equals(Object obj){
        return true;
    }
     /**
     * 
     * @Override
     * @return devuelve el numero mas grande
     */
    public int equals(){
        if(x>y){
            return x;
        }
        else{
        return y;
        }
    
    }
    
    
}


