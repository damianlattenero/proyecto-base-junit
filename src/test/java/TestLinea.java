import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alumno on 09/05/16.
 */
public class TestLinea {

    @Test
    public void crearLinea(){
        Punto punto1 = new Punto(0,0);
        Punto punto2 = new Punto(0,4);
        Linea linea1 = new Linea(punto1,punto2);

        Assert.assertEquals(linea1.inicio.x, 0);
        Assert.assertEquals(linea1.inicio.y, 0);
        Assert.assertEquals(linea1.fin.x, 0);
        Assert.assertEquals(linea1.fin.y, 4);
    }

    @Test
    public void crearLinea2(){
        Punto punto1 = new Punto(0,0);
        Punto punto2 = new Punto(3,4);
        Linea linea1 = new Linea(punto1,punto2);

        Assert.assertEquals(linea1.largoDeLaLinea(), 5, 0);

        //prmero restar el punto mas grande al mas chico, y dejarlo positivo
        //la cuenta seria, 3 al cuadrado + 4 al cuadrado , y al resultado hacerle la raiz
    }

    @Test
    public void crearLinea3(){
        Punto punto1 = new Punto(0,0);
        Punto punto2 = new Punto(15,8);
        Linea linea1 = new Linea(punto1,punto2);

        Assert.assertEquals(linea1.largoDeLaLinea(), 17,0);

        //prmero restar el punto mas grande al mas chico, y dejarlo positivo
        //la cuenta seria, 3 al cuadrado + 4 al cuadrado , y al resultado hacerle la raiz
    }

}
