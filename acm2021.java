import java.util.Scanner;

public class acm2021
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//System.out.print("Enter the number of array elements: ");
        int count = in.nextInt();
        int[] arr = new int[count+1];
        int i;

        for (i = 0; i < count; i++) {
            arr[i] = in.nextInt();
        }

        int max=arr[0];
        for (i=1;i<count;i++){
            if (arr[i]>=max){
                max=arr[i];
            }
        }
        for (i=0;i<count;i++){
            if (arr[i]==max){
                arr[i]=arr[i]/2;
            }
        }
        max=arr[0];
        for (i=1;i<count;i++){
            if (arr[i]>=max){
                max=arr[i];
            }
        }
        for (i=0;i<count;i++){
            if (arr[i]==max){
                arr[i]=arr[i]/2;
            }
        }

        for (i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

    }
}
