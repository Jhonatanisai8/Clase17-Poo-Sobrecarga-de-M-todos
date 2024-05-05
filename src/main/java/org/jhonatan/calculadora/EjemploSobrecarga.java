package org.jhonatan.calculadora;

/**
 * @author Jhonatan
 */
import static org.jhonatan.calculadora.Calculadora.*;

public class EjemploSobrecarga {

    public static void main(String[] args) {
        //   System.out.println("\nProvando los diferentes metodo:");
        System.out.println("Sumar int: " + sumar(10, 5));
        System.out.println("Suma float: " + sumar(10.0f, 5f));
        System.out.println("Suma float-int: " + sumar(10f, 5));
        System.out.println("Sumar int-float: " + sumar(10, 5.0f));
        System.out.println("Sumar double: " + sumar(10D, 5D));
        System.out.println("Sumar String: " + sumar("10", "5"));
        System.out.println("Sumar 3 int: " + sumar(10, 5, 3));

        System.out.println("Sumar long: " + sumar(10L, 5L));
        System.out.println("Sumar int: " + sumar(10, '@'));
        System.out.println("Suma float-int: " + sumar(10F, '@'));

        System.out.println("");
        System.out.println("Implementando el metodo de Varargs");
        //implementando el metodo de Varargs n variables de argumentos
        System.out.println("Sumar 3 int: " + sumar(10, 5, 3, 4, 6, 5, 6, 7, 78, 23));
        System.out.println("Sumar 3 int: " + sumar(10, 5, 3, 4, 5, 6, 7, 8));
        System.out.println("Sumar float + n  cant interos: " + sumar(10.5F, 5, 9, 15));
        System.out.println("Sumar doubles: " + sumar(10.0, 5.5, 0.45, 3.5));
    }
}
