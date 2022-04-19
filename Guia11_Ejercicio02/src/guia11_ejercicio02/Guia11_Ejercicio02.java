
package guia11_ejercicio02;

import Entidades.Curso;


/*
* Desarrollador: Andrés Panella
*/

public class Guia11_Ejercicio02 {


    public static void main(String[] args) {
        Curso c1= new Curso();
        c1=c1.creaCurso();
        c1.creaCurso();
        System.out.println(c1.getProfesor());
        try{
        for (int i = 0; i < c1.getAlumnos().length+1; i++) {
            System.out.println(c1.getAlumnos()[i]);
            
        }
        }catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("No puede mostrar más alumnos que los que están cargados");
        }
    }

}
