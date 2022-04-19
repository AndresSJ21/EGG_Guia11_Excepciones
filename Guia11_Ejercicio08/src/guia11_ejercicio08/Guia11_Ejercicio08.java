
package guia11_ejercicio08;


/*
* Desarrollador: Andrés Panella
*/

public class Guia11_Ejercicio08 {


    public static void main(String[] args) {
        /*
        
        
        Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
            
        
        class Uno{
                
                private static int metodo() {
                    int valor=0;
                    try {
                        valor = valor+1;   1=0+1     
                        valor = valor + Integer.parseInt (”42”); 43=1+42
                        valor = valor +1;   44=43+1
                        System.out.println(”Valor final del try:” + valor) ;  VALOR FINAL TRY = 44
                    } catch (NumberFormatException e) {
                        Valor = valor + Integer.parseInt(”42”);
                        System.out.println(“Valor final del catch:” + valor);
                    } finally {
                        valor = valor + 1; 44+1=45
                        System.out.println(”Valor final del finally: ” + valor) ;  VALOR FINAL DEL FINALLY = 45
                    }
                    valor = valor +1;  45+1=46
                    System.out.println(”Valor antes del return: ” + valor) ;  VALOR ANTES DEL RETURN = 46
                    return valor;
                }

                public static void main (String[] args) {
                    try {
                        System.out.println (metodo()) ;             ******** POR PANTALLA SE MOSTRARÁ EL NRO 46 ********
                    }catch(Exception e) {
                        System.err.println(”Excepcion en metodo() ”) ;
                        e.printStackTrace();
                    }
              }
       
        }
                    
        
        
        class Dos{
            private static int metodo() {
                int valor=0;
                try{
                    valor = valor + 1;
                    valor = valor + Integer.parseInt (”W”);
                    valor = valor + 1;
                    System.out.println(”Valor final del try: ” + valor) ;
                } catch ( NumberFormatException e ) {
                    valor = valor + Integer.parseInt (”42”);  0+42=42
                    System.out.println(”Valor final del catch: ” + valor) ; VALOR FINAL DEL CATCH = 42
                } finally {
                    valor = valor + 1;  42+1=43
                    System.out.println(”Valor final del finally: ” + valor) ;  VALOR FINAL DEL FINALLY = 43
                }
                valor = valor + 1; 43+1= 44
                System.out.println(”Valor antes del return: ” + valor) ;   VALOR ANTES DEL RETURN = 44
                return valor;
            }
        
        
            public static void main (String[] args) {
                try{
                    System.out.println ( metodo ( ) ) ;
                } catch(Exception e) {
                    System.err.println ( ” Excepcion en metodo ( ) ” ) ;    ********* POR PANTALLA SE MOSTRARÁ "44" *********
                    e.printStackTrace();
                }
            }
        }
                
        
        
        class Tres{
            private static int metodo( ) {
                int valor=0;
                try{
                    12
                    valor = valor + 1;
                    valor = valor + Integer.parseInt (”W”);
                    valor = valor + 1;
                    System.out.println(”Valor final del try: ” + valor);
                } catch(NumberFormatException e) {
                valor = valor + Integer.parseInt (”W”);
                System.out.println(”Valor final del catch: ” + valor);
                } finally{
                    valor = valor + 1;
                    System.out.println(”Valor final del finally:” + valor);  0+1=1
                }
                valor = valor + 1; 1+1=2
                System.out.println(”Valor antes del return: ” + valor) ;     VALOR ANTES DEL RETURN = 2
                return valor;
            }
        
            public static void main (String[] args) {
                try{
                    System.out.println( metodo ( ) ) ;
                } catch(Exception e) {
                    System.err.println(”Excepcion en metodo ( ) ” ) ;    ********* POR PANTALLA SE MOSTRARÁ "EXCEPCION EN MÉTODO ()" *********
                    e.printStackTrace();
                }
            }
        }

        
        
        
        */
    }

}
