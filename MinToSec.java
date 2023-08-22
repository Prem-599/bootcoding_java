import java.util.Scanner;

public class MinToSec {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entre min");
        int min= scanner.nextInt();
        convertToSecond(min);
    }
    public static void convertToSecond(int min){
        System.out.println(min+ "min = "+ min*60+"seconds");
    }
    }

