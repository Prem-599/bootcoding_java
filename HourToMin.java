import java.util.Scanner;

public class HourToMin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entre hour");
        int hr= scanner.nextInt();
        convertToMinute(hr);
    }
    public static void convertToMinute(int hr){
        System.out.println(hr+ "hr = "+ hr*60+"minutes");
    }
}
