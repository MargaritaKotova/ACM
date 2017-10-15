import java.util.*;

public class acm2002
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] arr = new int[count];
        int i;

        for(i = 0; i < count; i++) {
            arr[i] = in.nextInt();
        }

        int sum=0;
        for (i=0;i<count;i++){
            sum+=arr[i];
        }

        System.out.println(sum);
    }
}
