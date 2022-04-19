
package Entidades;

/*
* Desarrollador: Andrés Panella
*/

public class DivisionNumero {

    private int numero1;
    private int numero2;

    public DivisionNumero() {

    }

    public DivisionNumero(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;

    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public String dividirNumeros(DivisionNumero nums) {

        return "Si dividimos " + nums.numero1 + " por " + nums.numero2 + " el resultado es " + nums.numero1 / nums.numero2;
    }

    @Override
    public String toString() {
        return "DivisionNumero{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
}
