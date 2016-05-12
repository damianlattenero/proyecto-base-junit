/**
 * Created by alumno on 09/05/16.
 */
public class Linea {
    public Punto inicio;
    public Punto fin;

    public Linea(Punto punto1, Punto punto2) {
        this.inicio = punto1;
        this.fin = punto2;
    }

    public double largoDeLaLinea() {
        int cateto = this.inicio.x + this.fin.x;
        int adyacente = this.fin.y + this.inicio.y ;
        int sumaDeCatetosAlCuadrado = (this.elevarAlCuadrado(cateto) + this.elevarAlCuadrado(adyacente)) ;
        double hipotenusa = Math.sqrt(sumaDeCatetosAlCuadrado);

        return hipotenusa;
    }

    private int elevarAlCuadrado(int n) {
        return n * n;
    }
}
