package personas;

import personas.Persona;

/**
 *
 * @author Victor
 */
public class objetoPersona {

    public static void main(String[] args) {
        Persona objetoPersona = new Persona("Víctor", 42, 1.78f);

        System.out.println("Nombre: " + objetoPersona.nombre + "; Edad: " + objetoPersona.edad + "; Altura: " + objetoPersona.altura);

        //objetoPersona.main();
    }

}
