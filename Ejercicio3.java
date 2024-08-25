public class Ejercicio3 {
    public static void main(String[] args) {
        String s1 = "Hello, ";
        String s2 = "World!";
        String concatenated = concatenateStrings(s1, s2);
        System.out.println("Concatenated string: " + concatenated);
    }

    public static String concatenateStrings(String s1, String s2) {
        return s1 + s2;
    }
}
