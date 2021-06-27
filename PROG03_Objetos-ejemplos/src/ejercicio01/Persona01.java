package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Victor Visús
 * @exceptions EJERCIO 01 de la TAREA 3
 * @descripcion Incluir un método principal que solicite un valor al usuario y
 * lo introduzca en el atributo nombre, para posteriormente mostrar por pantalla
 * el nuevo valor del atributo.
 *
 */
public class Persona01 {

    String nombre;
    int edad;
    float altura;

    String consultaNombre() {
        return nombre;
    }

    void cambiaNombre(String nom) {
        nombre = nom;
    }

    //Método solicitud de nombre
    public void main() {
        //Solicita que introduzca un nombre, por consola
        System.out.println("Introduce el nombre de la persona:");
        Scanner consulta = new Scanner(System.in);

        //Llama al método cambiaNombre() para asignar el valor introducido al atributo nombre de la clase Persona01
        cambiaNombre(consulta.nextLine());

        //Imprime el valor del atributo nombre
        System.out.println("El nombre introducido es: " + consultaNombre());
    }
}
