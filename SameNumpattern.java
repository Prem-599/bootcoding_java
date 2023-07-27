public class SameNumpattern {
    public static void main(String[] args) {
        int n = 5;
        int i, j;
        for (i = 0; i <= n; i++)// for row
        {
            for (j = 1; j <= i; j++) //column
            {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
