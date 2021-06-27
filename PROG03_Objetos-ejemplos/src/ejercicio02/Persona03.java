package ejercicio02;

/**
 *
 * @author Victor Visús
 * @exceptions EJERCIO 02 de la TAREA 3
 * @descripcion Añade a la clase Persona los métodos que faltan para poder
 * consultar y modificar el valor de todos los atributos. Para ello observa cómo
 * se han creado los métodos del atributo nombre y determina los parámetros y
 * resultado de los demás atributos. Después completa el programa para comprobar
 * el funcionamiento de los nuevos métodos.
 *
 */
import java.util.Scanner;

public class Persona03 {

    //Defino atributos
    String nombre;
    int edad;
    float altura;

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
        //Llama al método cambiaNombre() para asignar el valor introducido al atributo nombre de la clase Persona03
        cambiaNombre(consulta.nextLine());

        //Solicita la edad para el objeto que se este construyendo.
        System.out.println("Introduce la edad:");
        //Llama al método cambiaEdad() para asignar el valor introducido al atributo nombre de la clase Persona03
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
