public class Main
{
	public static void main(String[] args) {
		// Defina y asigne dos objetos, un Cadrado y una Circunferencia
		// Solicite al usuario ingresar el valor de un vector de traslación 
		// Aplique el vector de traslación anterior a cada uno de los objetos referidos
		// Muestre las posiciones originales y finales de cada uno de los objetos referidos
		
	}
}

class Coord {
    private int x, y;
    public void set (int x){
        this.x=x;
    }
    public void set(int y){
        this.y=y;
        
    }
 }
}

class Cuadrado {
    private Coord c;
    private int lado;
    public Cuadrado(Coord c, int lado) {
        this.c = c;
        this.lado = lado;
    }
    public void Traslacion() {  // Complete los parámetros requeridos
        c.setX(t.getX()+c.getX());
        c.setY(t.getY()+c.getY());
    }
    public void Escalado() {  // Complete los parámetros requeridos
        
    }
    public void Rotacion() {  // Complete los parámetros requeridos
        
    }
}

class Circunferencia {
    Coord c;
    float radio;
    public Circuferencia(Coord c,float radio){
    this.c=c;
    this.radio=radio;
    
    }
    // Implementar los métodos Traslacion, Escalado y Rotacion para ésta clase
}


