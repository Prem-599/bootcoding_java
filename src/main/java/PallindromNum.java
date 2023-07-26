

public class PallindromNum {
    public static void main(String[] args) {
        int num = 505;
        int temp = num;
        int reverse = 0;
        int reminder = 0;
        while (temp != 0) {
            reminder = temp % 10;
            reverse = (reverse * 10) + reminder;
            temp = temp / 10;
        }
        if (reverse == num) {
            System.out.println(num + " is pallindrome number");
        } else {
            System.out.println(num + " is not pallindrome number");
        }

    }
}
