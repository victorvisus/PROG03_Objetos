package numeros;

/**
 *
 * @author Víctor Visús
 * @descripcion Archivo para probar los constructores y los métodos del
 * ejercicio 5
 *
 */
public class pruebasComplejo {

    public static void main(String[] args) {

        //pruebo el constructor de inicialización
        Complejo numComplejo = new Complejo();
        System.out.println("imag: " + numComplejo.real + "; real: " + numComplejo.imag);

        //prueba con parametros
        numComplejo = new Complejo(3.45, 2);
        System.out.println("imag: " + numComplejo.real + "; real: " + numComplejo.imag);

        //prueba return
        System.out.println("La parte real del objeto es: " + numComplejo.consulta_Real());
        System.out.println("La parte imaginaria del objeto es: " + numComplejo.consulta_Imag());

        //prueba metodos de reasignación de valores
        numComplejo.cambia_Real(5);
        System.out.println("Ahora la parte real es: " + numComplejo.real);
        numComplejo.cambia_Imag(6);
        System.out.println("Ahora la parte imaginaria es: " + numComplejo.imag);

        //Cadena de texto del número complejo
        numComplejo.toString();

        //Suma las partes de dos número complejos
        numComplejo.sumar(new Complejo(3d, 4d));
    }

}
