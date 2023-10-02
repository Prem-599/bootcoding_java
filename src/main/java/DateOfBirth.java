import java.util.Scanner;

public class DateOfBirth{
    public static void main(String[] args) {
        dateOfBirth(5-9-1999);
    }
    public static void dateOfBirth(int dob){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter of birth in DD-MM-YY");
        String a= scanner.nextLine();
        String[] arr=a.split("-");
        System.out.println("date of birth : " + arr[0]);
        System.out.println(" month of birth : " +arr[1]);
        System.out.println("year of birth : "+arr[2]);
    }
    }

