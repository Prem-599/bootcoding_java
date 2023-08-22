public class FirstHalfOfString {
    public static void main(String[] args) {
        String a="Atkapurwar";
        char[] chars2=a.toCharArray();
        int n=chars2.length;
        int str=0;
        str=n/2;
        String Substring=a.substring(0,str);
        System.out.println("print first half of given string:- "+ Substring);
    }
}
