import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String subS = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < s.length();) {
            int found = s.indexOf(subS, i);
            if (found >= 0) {
                count++;
                i = found + subS.length();
            } else {
                break;
            }
        }

        System.out.println(count);
    }
}