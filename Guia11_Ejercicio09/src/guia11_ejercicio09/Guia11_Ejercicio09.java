
package guia11_ejercicio09;


/*
* Desarrollador: Andrés Panella
*/

public class Guia11_Ejercicio09 {


    public static void main(String[] args) {
        /*
        
        Dado el método metodoC de la clase C, indique:
        
            a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción
            MioException?
        
            b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción
            MioException?
        
            c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?
        
        
        class C {
            void metodoC() throws TuException{
                sentencia_c1
                try {
                    sentencia_c2
                    sentencia_c3
                } catch (MioException e){
                    sentencia_c4
                } catch (TuException e){
                    sentencia_c5
                    throw (e)
                }
            finally
            sentencia_c6
            }
        }

        
        A)  SI SE PRODUCE LA EXCEPCION MIOEXCEPTION SE EJECUTAN LAS SIGUIENTES SENTENCIAS EN EL ORDEN INDICADO
                SENTENCIA_C1
                SENTENCIA_C4
                SENTENCIA_C6
        
        B)  SI NO SE PRODUCE LA EXCEPCION MIOEXCEPTION SE EJECUTAN LAS SIGUIENTES SENTENCIAS EN EL ORDEN INDICADO
                SENTENCIA_C1
                SENTENCIA_C2
                SENTENCIA_C3
                SENTENCIA_C6
        
        C)  SI SE PRODUCE LA EXCEPCION TUEXCEPTION SE EJECUTAN LAS SIGUIENTES SENTENCIAS EN EL ORDEN INDICADO
                SENTENCIA_C1
                SENTENCIA_C5
                SENTENCIA_C6

        */
    }

}
