package ejercicio04;

/**
 *
 * @author Victor Visús
 * @exceptions EJERCIO 04 de la TAREA 3
 * @descripcion Crea un constructor con parámetros para la clase Persona que
 * inicialice los atributos del objeto con los valores indicados en los
 * parámetros. A continuación crea un proyecto que declare un objeto de tipo
 * Persona utilizando el constructor, para posteriormente mostrar el contenido
 * de los atributos por pantalla. Utiliza el operador this.
 *
 */
import java.util.Scanner;

public class Persona04 {

    //Defino atributos
    String nombre;
    int edad;
    float altura;

    //Creo el constructor que inicialice a los valores indicados
    public Persona04() {
        nombre = "Luisa Perez";
        edad = 22;
        altura = 1.70f;
    }

    //Creo el constructor con parametros
    public Persona04(String nombre, int edad, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    //Métodos que devuelven los valores de los atributos
    String consultaNombre() {
        return nombre;
    }

    int consultaEdad() {
        return edad;
    }

    float consultaAltura() {
        return altura;
    }

    //Métodos de asignación de los valores recogidos a los atributos
    void cambiaNombre(String nom) {
        nombre = nom;
    }

    void cambiaEdad(int old) {
        edad = old;
    }

    void cambiaAltura(float height) {
        altura = height;
    }

    //Método solicitud de Datos del Objeto.
    public void main() {
        //Creo la variable consulta de tipo Scanner
        Scanner consulta = new Scanner(System.in);

        //Solicita que introduzca un nombre, por consola
        System.out.println("Introduce el nombre de la persona:");
        //Llama al método cambiaNombre() para asignar el valor introducido al atributo nombre de la clase Persona04
        cambiaNombre(consulta.nextLine());

        //Solicita la edad para el objeto que se este construyendo.
        System.out.println("Introduce la edad:");
        //Llama al método cambiaEdad() para asignar el valor introducido al atributo nombre de la clase Persona04
        cambiaEdad(Integer.parseInt(consulta.nextLine()));

        //Lo mismo que los anteriores pero para la altura
        System.out.println("Dime la altura de " + nombre);
        //Llama al método cambiaEdad() para asignar el valor introducido al atributo nombre de la clase Persona01
        cambiaAltura(Float.parseFloat(consulta.nextLine()));

        //Imprime el valor del atributo nombre
        System.out.println("El nombre introducido es: " + consultaNombre());
        //Imprime el valor del atributo edad
        System.out.println(nombre + " tiene " + consultaEdad() + " años.");
        //Imprime la altura
        System.out.println("y mide " + consultaAltura());

        System.out.println("En resumen, los datos introducidos son:\n- Nombre: " + consultaNombre() + "\n- Edad: " + consultaEdad() + "\n- Altura: " + consultaAltura());
    }
}
