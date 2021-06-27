package ejercicio05;

/**
 *
 * @author Victor Visús
 * @exceptions EJERCIO 04 de la TAREA 3
 * @descripcion Construye una clase Complejo con dos atributos:
 *
 * real: parte real del número complejo
 *
 * imag: parte imaginaria del número complejo
 *
 * Puedes consultar la estructura de una clase en el apartado correspondiente de
 * la unidad, o bien partir de la definición de la clase Persona del apartado
 * anterior. A continuación crea los siguientes métodos dentro de la clase:
 *
 * public Complejo(): Constructor que inicializa los atributos a cero.
 *
 * public Complejo(double real, double imag): Constructor que inicializa los
 * atributos a los valores indicados por los parámetros.
 *
 * public double consulta_Real(): Devuelve la parte real del objeto.
 *
 * public double consulta_Imag(): Devuelve la parte imaginaria del objeto.
 *
 * public void cambia_Real(double real): Asigna a la parte real del objeto el
 * valor indicado en el parámetro real.
 *
 * public void cambia_Imag(double imag): Asigna a la parte imaginaria del objeto
 * el valor indicado en el parámetro imag.
 *
 * public String toString(): Convierte a String el número complejo, mediante la
 * concatenación de sus atributos y devuelve como resultado la cadena de texto 3
 * + 4i, si 3 es la parte real y 4 la parte imaginaria.
 *
 * public void sumar(Complejo b): Suma la parte real con la parte real del
 * número complejo b y la parte imaginaria con la parte imaginaria del número
 * complejo b.
 *
 * Crea un proyecto que contenga la clase Complejo en un paquete llamado números
 * y pruebe todos sus métodos.
 *
 */
public class Complejo {

    double real;
    double imag;

    //Constructor de inicialización
    public Complejo() {
        System.out.println("Esta ejecuntando Constructor de inicialización");
    }

    //Constructor con parámetros
    public Complejo(double real, double imag) {
        System.out.println("Esta ejecuntando Constructor con parámetros");
        this.real = real;
        this.imag = imag;
    }

    //Método con return, que devuelve la parte real del objeto.
    public double consulta_Real() {
        return real;
    }
    //Método con return, que devuelve la parte imaginaria del objeto.
    public double consulta_Imag() {
        return imag;
    }

    //Método que asigna a la parte real del objeto el valor indicado en el parámetro.
    public void cambia_Real(double real) {
        this.real = real;
    }

    //Método que asigna a la parte imag del objeto el valor indicado en el parámetro.
    public void cambia_Imag(double imag) {
        this.imag = imag;
    }

    //Método que devuelve el número complejo
    public String toString() {
        String numString = String.valueOf(real) + " + " + String.valueOf(imag) + "i";
        System.out.println("El número complejo es: " + numString);

        return numString;
    }

    //Método sumar dos números complejos
    public void sumar(Complejo b) {
        double sumReal = this.real + b.real;
        System.out.println("sumReal = " + sumReal);
        double sumImag = this.imag + b.imag;
        System.out.println("sumImag = " + sumImag);

        this.toStringSuma(sumReal, sumImag);
    }

    private String toStringSuma(double arg1, double arg2) {
        String numString = String.valueOf(arg1) + " + " + String.valueOf(arg2) + "i";
        System.out.println("El número nuevo numero complejo es: " + numString);

        return numString;
    }
}
