public class SecondHalfOfString {
    public static void main(String[] args) {
        String a= "Naruto";
        char[] chars2= a.toCharArray();
        int n=chars2.length;
        int str=0;
        str =n/2;
        String Substring =a.substring(str,n);
        System.out.println("print second of given string: " + Substring);

    }
}
