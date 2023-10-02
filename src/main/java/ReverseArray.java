public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        reverseArray(arr);
    }
    public static void reverseArray(int arr[]) {
        System.out.println("print original array  ");
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        System.out.println("Reversed array is: " + arr.length);
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }
}