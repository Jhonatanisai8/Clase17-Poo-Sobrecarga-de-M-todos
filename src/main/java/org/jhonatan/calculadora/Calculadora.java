package org.jhonatan.calculadora;

/**
 * @author Jhonatan
 */
public class Calculadora {

    //metodo con varargs numero de variables de argumento
    public int sumar(int... argumentos) {
        //lo recorremos con un for y vamos sumando
        int total = 0;
        for (int i : argumentos) {
            total += i;
        }
        return total;
    }

    public int sumar(int a, int b) {
        return a + b;
    }

    public float sumar(float x, float y) {
        return x + y;
    }

    /*public long sumar(long x, long y) {
        return x + y;
    }*/
    public float sumar(int i, float j) {
        return i + j;
    }

    public float sumar(float i, int j) {
        return i + j;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(String a, String b) {
        int resultado;
        try {
            //los convierte a enteros
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            return 0;
        }
        return resultado;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

}
