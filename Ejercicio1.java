public class Ejercicio1 {
    public static void main(String[] args) {
        String s = "Hello, World!";
        int count = countCharacters(s);
        System.out.println("Number of characters: " + count);
    }

    public static int countCharacters(String s) {
        return s.length();
    }
}

