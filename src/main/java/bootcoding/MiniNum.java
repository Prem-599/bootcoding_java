package bootcoding;

import java.util.Scanner;

public class MiniNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number");
        int  a= scanner.nextInt();
        int b=scanner.nextInt();
        int c= scanner.nextInt();
        if(a<b && a<c){
            System.out.println(a+" is minimum number");
        }
        if(b<a && b<c){
            System.out.println(b +" is minimum number");
        }
        if(c<a && c<b){
            System.out.println(c + " is minimun number");
        }
    }
}
