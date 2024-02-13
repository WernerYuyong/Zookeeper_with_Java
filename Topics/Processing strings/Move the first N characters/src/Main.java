import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        System.out.println(moveNCharactersToEnd(s, n));
    }

    private static String moveNCharactersToEnd(String s, int n) {
        if (n >= s.length()) {
            return s;
        } else {
            String part1 = s.substring(0, n);
            String part2 = s.substring(n);
            return part2 + part1;
        }
    }
}