import java.util.Scanner;
public class IfelseEx4 {
    public static void main(String[] args) {
        Scanner scanner = new
                Scanner(System.in);
        System.out.println("Enter any  number");
        int n = scanner.nextInt();
        if(n%2 ==0)
        {
            System.out.println("Enter number is " + n +"!");
            System.out.println(n +" is Even number");
        }else
        {
            System.out.println(n +" Odd number");
        }
    }
    }

