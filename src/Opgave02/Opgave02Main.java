package Opgave02;

public class Opgave02Main {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Termineringsregel: fibonacci(0) = 0
        } else if (n == 1) {
            return 1; // Termineringsregel: fibonacci(1) = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Rekurrensregel: fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
        }
    }
}
