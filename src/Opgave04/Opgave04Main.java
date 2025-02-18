package Opgave04;

public class Opgave04Main {

    public static void main(String[] args) {
        System.out.println(reverse("Simon"));
    }
    public static String reverse(String s) {
        if (s.isEmpty()) {
            return s; // Basisregel: tom streng
        } else {
            return reverse(s.substring(1)) + s.charAt(0); // Rekursionsregel
        }
    }
}