package org.jhonatan.calculadora;

/**
 * @author Jhonatan
 */
public class EjemploSobrecarga {

    public static void main(String[] args) {
        //creacion una intancia de calculadora
        Calculadora calculadora = new Calculadora();
     //   System.out.println("\nProvando los diferentes metodo:");
        System.out.println("Sumar int: " + calculadora.sumar(10, 5));
        System.out.println("Suma float: " + calculadora.sumar(10.0f, 5f));
        System.out.println("Suma float-int: " + calculadora.sumar(10f, 5));
        System.out.println("Sumar int-float: " + calculadora.sumar(10, 5.0f));
        System.out.println("Sumar double: " + calculadora.sumar(10D, 5D));
        System.out.println("Sumar String: " + calculadora.sumar("10", "5"));
        System.out.println("Sumar 3 int: " + calculadora.sumar(10, 5, 3));

        System.out.println("Sumar long: " + calculadora.sumar(10L, 5L));
        System.out.println("Sumar int: "+calculadora.sumar(10, '@'));
        System.out.println("Suma float-int: "+calculadora.sumar(10F, '@'));
    }
}
