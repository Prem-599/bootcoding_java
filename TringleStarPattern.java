public class TringleStarPattern {
    public static void main(String[] args) {
        int n=9;
        int i ,j ;
        for ( i=0;i<=n;i++)// for row
        {
            for(j=1;j<=i;j++) //column
            {
                System.out.print(" * ");
            }
             System.out.println();
        }
    }
}
