package guia11_ejercicio03;

import Entidades.DivisionNumero;
import java.util.Scanner;


/*
* Desarrollador: Andrés Panella
 */
public class Guia11_Ejercicio03 {

    public static void main(String[] args) {
        
        
        String numero1;
        String numero2;
        int number1;
        int number2;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dividendo");
        numero1 = leer.nextLine();
   
        System.out.println("Ingrese dividendo");
        numero2 = leer.nextLine();
        
        number1=Integer.parseInt(numero1);
        number2=Integer.parseInt(numero2);
       
        DivisionNumero divNum = new DivisionNumero(number1,number2);
        
        
        System.out.println(divNum.dividirNumeros(divNum));
        
    }

}
