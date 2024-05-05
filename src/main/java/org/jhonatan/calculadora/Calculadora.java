package org.jhonatan.calculadora;

/**
 * @author Jhonatan
 */
public class Calculadora {

    //metodo con varargs numero de variables de argumento
    public static int sumar(int... argumentos) {
        //lo recorremos con un for y vamos sumando
        int total = 0;
        for (int i : argumentos) {
            total += i;
        }
        return total;
    }

    //puedo combinar argumentos
    public static float sumar(float a, int... argumentos) {
        //lo recorremos con un for y vamos sumando
        float total = 0;
        for (int i : argumentos) {
            total += i;
        }
        return total;
    }

    public static double sumar(double... varargs) {
        //lo recorremos con un for y vamos sumando
        double total = 0;
        for (double i : varargs) {
            total += i;
        }
        return total;
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static float sumar(float x, float y) {
        return x + y;
    }

    public static long sumar(long x, long y) {
        return x + y;
    }

    public static float sumar(int i, float j) {
        return i + j;
    }

    public static float sumar(float i, int j) {
        return i + j;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static int sumar(String a, String b) {
        int resultado;
        try {
            //los convierte a enteros
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            return 0;
        }
        return resultado;
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

}
