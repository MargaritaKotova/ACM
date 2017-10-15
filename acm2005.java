/**
 * Created by 11007139 on 14.10.2017.
 */
import java.util.Scanner;

public class acm2005 {

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
            for (i=1;i<=count;i++){
                if (arr[i]==min){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
