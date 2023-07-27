public class SameNumPattern2 {
    public static void main(String[] args) {
        int n = 4;
        int i, j;
        int m=1;
        for (i = 0; i <= n; i++)// for row
        {
            for (j = 0; j <= i; j++) //column
            {
                System.out.print(m++);
            }
            System.out.println();
        }
    }
}