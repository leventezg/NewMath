package me.leventezg.MathPlus;
import java.util.HashMap;
import java.util.Map;

public class MathPlus {
    public static double sqrtroot(double num) {
        double var1 = 10; // 10 is a random number
        for (int i = 0; i <= 16; i++) { // For smaller numbers, it can be decreased down to 6-7
            var1 = (num / var1 + var1) / 2; // Base number divided by the previous number and incremented by the
                                            // previous number and divided by 2
        }
        return var1; // Returns the value after the cycles
    }

    public static double pythagoras(double a, double b) {
        if (a > 0 && b > 0) { // If "a" and "b" not 0
            return sqrtroot(a * a + b * b); // Calls the sqrt function with the power of "a" incremented by the power of
                                            // "b"
        }
        return 0;
    }

    public static double[] median(double[] list) {
        if (list.length > 0) { // Checks if the list is empty
            if (list.length % 2 == 0) { // Checks if the list is odd or even
                return new double[] { list[list.length / 2 - 1], list[list.length / 2] }; // Returns the middle values
            } else {
                return new double[] { list[list.length / 2] }; // Returns the only middle value
            }
        }
        return new double[] {}; // If the condition falls back, we will return an empty list
    }

    public static double mode(double[] list) {
        if (list.length == 0) {
            return 0;
        }
        Map<Double, Integer> map = new HashMap<>(); // Declaring a HashMap
        for (int i = 0; i < list.length; i++) {
            map.put(list[i], map.getOrDefault(list[i], 0) + 1);
        }
        int var1 = 0; // Most frequency at the time, 0 by default
        double var2 = list[0]; // Most frequent at the time, 1. item in the list by default
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            if (entry.getValue() > var1) { // Condition, if the number's frequency is bigger than the previous number's
                var1 = entry.getValue(); // Sets the frequency of the number
                var2 = entry.getKey(); // Sets the frequent number
            }
        }
        return var2; // Returns the result
    }

    public static boolean isPrime(double number) {
        if (number < 2) { // Checks if the input is less than 2
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) { // If input divided by the current number at loop and the remainder is 0
                return false;
            }
        }
        return true;
    }

    public static double DegtoRad(double deg) {
        return deg * (3.141592653589793 / 180);
    }
    // Taylor row formule
    public static double sin(double x) {
        // Converting -2π and 2π
        x = x % (2 * 3.141592653589793);
        double finalnum = 0;
        double tag = x;
        int n = 1;
        for (int i = 1; i <= 10; i++) {
            finalnum += tag;
            n += 2;
            tag *= -1 * x * x / (n * (n - 1));
        }
        return finalnum;
    }
}
