 import java.util.Scanner;
public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter Number");
        int n= scanner.nextInt();
        int a=0;
        for(int i=1 ; i<=10;i++)
        {
            a=n*i;
            System.out.println(a);
        }
    }
}
