import java.util.Scanner;

public class SwapByMethod {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Enter two number");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        SwapTwoNumbers(a,b);
    }
    public static void SwapTwoNumbers(int a,int b){
        System.out.println("before swapping number; "+a +" "+b);
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping number; "+a +" "+b);
    }
}
