package Entidades;

import java.util.Scanner;

/*
* Desarrollador: Andrés Panella
 */
public class Numero {

    private int valor;

    public Numero() {

    }

    public Numero(int valor) {
        this.valor = valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public int crearNumeroAleatorio() {
        int numAleatorio = (int) (Math.round(Math.random() * 500));
        System.out.println("El número aleatorio es: " + numAleatorio);
        return numAleatorio;
    }

    public int[] pedirNumero() {

        int[] nroEintentos = new int[2];
        nroEintentos[0] = 0; //nroEintentos[0] es el nro elegido por usuario,
        nroEintentos[1] = 0; //nroEintentos[1] es la cantidad de intentos asociados al valor a comparar
        boolean validacion;
        int nroEquivocaciones=0;

        do {
            validacion = false;
            try {
                Scanner leer = new Scanner(System.in);
                System.out.println("Ingresa el nro que crees que eligió el programa");
                nroEintentos[0] = leer.nextInt();
                validacion = true;
                nroEintentos[1]++;
            } catch (Exception ex1) {
                System.out.println("El dato ingresado no es un nro entero");
                System.out.println("Estos errores computan como intentos, pruebe nuevamente");
                nroEintentos[1]++;
                nroEquivocaciones++;
                System.out.println("Presta atención!!!! ya te equivocaste "+ nroEquivocaciones+ " vez/veces en esta ronda");
            }
            
        } while (!validacion);

        return nroEintentos;
    }

    public String compararNumeros() {
        int nroAleatorio = crearNumeroAleatorio();
        int[] opcion = new int[2];
        int contador = 0;

        do {
            System.out.println("");
            opcion = pedirNumero();
            contador += opcion[1];
            if (opcion[0] > nroAleatorio) {
                System.out.println("El nro a adivinar es menor al ingresado");
            } else if (opcion[0] < nroAleatorio) {
                System.out.println("El nro a adivinar es mayor al ingresado");
            }
            System.out.println("Intentos acumulados: "+ contador);    
        } while (opcion[0] != nroAleatorio);

        return "Adivinaste!!!!, y necesitaste " + contador + " intentos";

    }

    @Override
    public String toString() {
        return "Número: " + valor;
    }

}
