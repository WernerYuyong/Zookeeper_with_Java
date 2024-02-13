import java.util.Scanner;

class EvenUpperCase {

    public static String upperEvenLetters(String message) {
        StringBuilder sb = new StringBuilder(message.toUpperCase());
        for (int i = 1; i < message.length(); i += 2) {
            sb.setCharAt(i, message.charAt(i));
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();
        System.out.println(upperEvenLetters(message));
    }
}