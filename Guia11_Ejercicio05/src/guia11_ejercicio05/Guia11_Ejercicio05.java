
package guia11_ejercicio05;

import Entidades.Numero;


/*
* Desarrollador: Andrés Panella
- generar nro aleatorio entre 1 y 500
- el usuario debe ingresar su opcion
    -si la opción ingresada está por encima del nro aleatorio generado se indica que el nro a adivinar es MENOR
    -si la opción ingresada está por encima del nro aleatorio generado se indica que el nro a adivinar es MAYOR
- se deben contabilizar los intentos de adivinanza
- se debe indicar por pantalla cuando se adivine el nro y se deben indicar la cantidad de intentos empleados
- si se ingresa un dato que no sea un nro entero se debe controlar la excepción e indicarlo por pantalla
- los ingresos fallidos se computan como intentos


*/

public class Guia11_Ejercicio05 {


    public static void main(String[] args) {
        Numero nro = new Numero();
        System.out.println(nro.compararNumeros());
    }

}
