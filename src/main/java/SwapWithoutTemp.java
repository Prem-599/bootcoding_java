import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println( "enter any two number");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        System.out.println("before swaping number:"+a+"   "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swaping: "+a+"  "+b);

    }
}
