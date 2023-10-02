import java.util.Scanner;

public class MinNumByMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any 3 Number ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        minNum(a,b,c);
    }

    public static void minNum(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a + " is Minimum Number");
        }
        if (b < a && b < c) {
            System.out.println(b + "is Minimum Number");
        }
        if (c < a && c < b) {
            System.out.println(c + " is Minimum Number");
        }
    }
}