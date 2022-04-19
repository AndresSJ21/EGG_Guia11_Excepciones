package guia11_ejercicio06;


/*
* Desarrollador: Andrés Panella
 */
public class Guia11_Ejercicio06 {

    public static void main(String[] args) {
        /*
        Dado el método metodoA de la clase A, indique:
            a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción
            MioException?
            b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción
            MioException?
            
            class A {
                public void metodoA() {
                    sentencia_a1
                    sentencia_a2
                        try {
                            sentencia_a3
                            sentencia_a4
                        } catch (MioException e){
                            sentencia_a6
                        }
                    sentencia_a5
                }
            }
        
        Si se ejecuta la excepción MioException se ejecutan las siguientes sentencias en el orden indicado:
            sentencia_a1
            sentencia_a2
            sentencia_a6
            sentencia_a5

        
        Si NO se ejecuta la excepción MioException se ejecutan las siguientes sentencias en el orden indicado:
            sentencia_a1
            sentencia_a2
            sentencia_a3
            sentencia_a4
            sentencia_a5
        
         */

    }

}
