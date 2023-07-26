 import java.util.Scanner;
public class SwapNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp=0;
        System.out.println("before Swaping number: "+a +"  "+b);
       temp=a;
       a=b;
       b=temp;
        System.out.println("After Swaping; "+a +"  "+b);




    }
}