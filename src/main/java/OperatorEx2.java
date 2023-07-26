public class OperatorEx2 {
    public static void main(String[] args) {
        //comment
//conditional Operator Example
// < > <= >= == != (boolean)
        boolean value = 10 > 20;
        boolean textResult = 'A' == 'B';
        boolean percentage = 75.54 > 60.00;
        double time = 18.30;
        System.out.println(value);
        System.out.println(textResult);
        System.out.println(time);

        if (time < 12.00) {
            System.out.println("Good Morning");
        }
        if (time > 12.00 && time < 18.00) {
            System.out.println("Good Afternoon");
        }
        if (time > 18.00) {
            System.out.println("Good Evening");
        }
    }
}
