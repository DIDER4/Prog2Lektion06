package Opgave01;

public class Opgave01Main {
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Termineringsregel: 0! = 1
        } else {
            return n * factorial(n - 1); // Rekurrensregel: n! = n * (n-1)!
        }
    }
}