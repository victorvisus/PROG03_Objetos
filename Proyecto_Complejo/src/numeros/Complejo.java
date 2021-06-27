package numeros;

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
