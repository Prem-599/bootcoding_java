public class ArrayOfPalindrome
{
    public static boolean isPalindrome(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,50,40,30,20,10};
        boolean ans = isPalindrome(arr);
        if (ans) {
            System.out.println("is a palindrome array");
        } else {
            System.out.println("is not an palindrome array");
        }
    }
}

