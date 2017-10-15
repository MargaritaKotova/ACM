import java.util.Scanner;

public class acm2009
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//System.out.print("Enter the number of array elements: ");
        int count = in.nextInt();
        int[] arr = new int[count+1];
        int i;
        arr[0]=0;
        for(i = 1; i <= count; i++) {
            arr[i] = in.nextInt();
        }

        int sum=0;
        for (i=1;i<=count;i=i*2){

            sum+=arr[i];
        }

        System.out.println(sum);
    }
}