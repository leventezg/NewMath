package me.leventezg.Math;

public class teszt {
    public static void main(String[] args) {
        double start = System.nanoTime();

        System.out.println(NewMath.sqrt(25));
        double end = System.nanoTime() - start;
        System.out.println((end/1000000000)+"s");


    }
}
