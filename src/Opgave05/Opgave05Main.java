package Opgave05;

public class Opgave05Main {
    public static int sfd(int a, int b) {
        if (b == 0) {
            return a; // Termineringsregel: b går op i a
        } else if (a < b) {
            return sfd(b, a); // Rekurrensregel: sfd(b, a)
        } else {
            return sfd(b, a % b); // Rekurrensregel: sfd(b, a % b)
        }
    }
}