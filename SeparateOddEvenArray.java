public class SeparateOddEvenArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int n=a.length;
        System.out.println("even number are :");
        for (int i=0;i<n;i++){
            if (a[i]%2==0){
                System.out.println(a[i]+" ");
            }
        }
        System.out.println("odd number are :");
        for (int i=0;i<n;i++){
            if (a[i]%2==1){
                System.out.print(a[i]+" ");
            }
        }
    }
}
