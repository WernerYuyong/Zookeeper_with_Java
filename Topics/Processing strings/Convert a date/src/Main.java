
class Main {
    public static void main(String[] args) {
        String input = new java.util.Scanner(System.in).nextLine();
        System.out.println(convertDate(input));
    }

    private static String convertDate(String input) {
        String[] inputDate = input.split("-");
        return inputDate[1] + "/" + inputDate[2] + "/" + inputDate[0];
    }
}