import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any 3 Number ");
        int  a= scanner.nextInt();
       int b=scanner.nextInt();
        int c= scanner.nextInt();
        if(a>b && a<c){
            System.out.println(a+" is greater number");
        }
        if(b>a && b>c){
            System.out.println(b +" is greater number");
        }
        if(c>a && c>b){
            System.out.println(c + " is greter number");
        }
    }
}