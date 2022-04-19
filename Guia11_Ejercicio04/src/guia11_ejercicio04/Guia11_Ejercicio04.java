package guia11_ejercicio04;

import Entidades.DivisionNumero;
import java.util.Scanner;


/*
* Desarrollador: Andrés Panella
 */
public class Guia11_Ejercicio04 {

    public static void main(String[] args) {

        String numero1 = null;
        String numero2 = null;
        int number1 = 0;
        int number2 = 0;
        boolean verificado1, verificado2 = false;

        do {
            verificado2 = false;
            try {
                do {
                    verificado1 = false;
                    try {
                        Scanner leer = new Scanner(System.in);
                        System.out.println("Ingrese dividendo");
                        numero1 = leer.nextLine();
                        verificado1 = true;
                    } catch (Exception exc2) {
                        System.out.println("El tipo de variable ingresada no es correcta, intente nuevamente");
                    }
                } while (!verificado1);

                number1 = Integer.parseInt(numero1);
                verificado2 = true;
            } catch (Exception ex3) {
                System.out.println("Ha ingresado un dato que no es numérico");
            }
        } while (!verificado2);

        do {
            verificado2 = false;
            try {
                do {
                    verificado1 = false;
                    try {
                        Scanner leer = new Scanner(System.in);
                        System.out.println("Ingrese divisor");
                        numero2 = leer.nextLine();
                        verificado1 = true;
                    } catch (Exception exc2) {
                        System.out.println("El tipo de variable ingresada no es correcta, intente nuevamente");
                    }
                } while (!verificado1);

                number2 = Integer.parseInt(numero2);
                verificado2 = true;
            } catch (Exception ex3) {
                System.out.println("Ha ingresado un dato que no es numérico");
            }
        } while (!verificado2);

        DivisionNumero divNum = new DivisionNumero(number1, number2);

        try {
            System.out.println(divNum.dividirNumeros(divNum));
        } catch (Exception ex1) {
            System.out.println("No es posible dividir por cero");
        }

        System.out.println("Fin programa");
    }

}
//InputMismatchException
//por querer guardar en un tipo de variable un valor de otro tipo que se está leyendo por teclado.

//NumberFormatException
// se produce cuando el método Integer.parseInt() no puede convertir a entero la cadena que se pasa como argumento


//ArithmeticException
// se produce al intentar dividir por cero
