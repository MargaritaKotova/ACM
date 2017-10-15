import java.util.Scanner;

public class acm2029
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//System.out.print("Enter the number of array elements: ");
        int count = in.nextInt();
        int[] arr = new int[count+1];
        int[] mini = new int[count+1];
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
        int j=1;
        for (i=1;i<=count;i++){
            if (arr[i]==min){
                mini[j]=i;
                sum+=1;
                j++;
            }
        }



        if (sum % 2 == 1)
            System.out.println(mini[sum/2+1]);

        if (sum % 2 == 0)
            System.out.println(mini[sum/2]);

    }
}
