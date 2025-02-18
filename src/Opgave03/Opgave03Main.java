package Opgave03;

public class Opgave03Main {
    public static int power(int n, int p) {
        if (p == 0) {
            return 1; // Termineringsregel: n^0 = 1
        } else if (p % 2 == 0) {
            int halfPower = power(n, p / 2);
            return halfPower * halfPower; // Rekurrensregel: (n^2)^(p/2)
        } else {
            return n * power(n, p - 1); // Rekurrensregel: n * n^(p-1)
        }
    }
}