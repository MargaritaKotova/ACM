import java.util.Scanner;

public class acm2013
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//System.out.print("Enter the number of array elements: ");
        int count = in.nextInt();
        int[] arr = new int[count+1];
        int i;

        for (i = 1; i <= count; i++) {
            arr[i] = in.nextInt();
        }

        int min=arr[1];
        for (i=2;i<=count;i++){
            if (arr[i]<=min){
                min=arr[i];
            }
        }
        int sum=0;
        for (i=1;i<=count;i++){
            if (arr[i]==min){
                sum+=1;
            }
        }
        System.out.println(sum);
    }
}