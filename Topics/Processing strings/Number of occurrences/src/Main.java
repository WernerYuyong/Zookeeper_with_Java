import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String str = new java.util.Scanner(System.in).nextLine();
        String substr = new java.util.Scanner(System.in).nextLine();
        System.out.println(countOccurances(str, substr));
    }

    private static int countOccurances(String str, String substr) {
        return str.indexOf(substr, 0);
    }
}