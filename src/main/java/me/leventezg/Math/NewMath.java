package me.leventezg.Math;

public class NewMath {
    public static double sqrt(double num) {
        double var1 = 10; // 10 is a random number
        for(int i = 0; i <= 16; i++) { // For smaller numbers, it can be decreased down to 6-7
            var1 = (num/var1 + var1) / 2; // Base number divided by the previous number and incremented by the previous number and divided by 2
        }
        return var1; // Returning the value after the cycles
    }
}
