package com.company;

public class Main {
    public static void main(String[] args) {


        MathFunksions mathFunksions = new MathFunksions();
        System.out.println(mathFunksions.add(3,4));
        System.out.println(mathFunksions.add(4.5f,2.6f));
        System.out.println(mathFunksions.div(5,9));
        System.out.println(mathFunksions.div(5.9,6.5));
        System.out.println(mathFunksions.multiply(4,7));
        System.out.println(mathFunksions.multiply(5.3f,7.5f));
        System.out.println(mathFunksions.abs(-50));
        System.out.println(mathFunksions.abs(2.3f));
        System.out.println(mathFunksions.pow(6));
        System.out.println(mathFunksions.pow(5.6));

    }
}

