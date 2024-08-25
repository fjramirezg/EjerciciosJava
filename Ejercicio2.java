public class Ejercicio2 {
    public static void main(String[] args) {
        String s = "Hello, World!";
        String inverted = invertString(s);
        System.out.println("Inverted string: " + inverted);
    }

    public static String invertString(String s) {
        String inverted = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            inverted += s.charAt(i);
        }
        return inverted;
    }
}
