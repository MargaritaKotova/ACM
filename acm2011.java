import java.util.Scanner;

public class acm2011
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//System.out.print("Enter the number of array elements: ");
        int n = in.nextInt();
        int m;
        if (n<7)
            System.out.println("preschool child");
        if ((n>=7)&&(n<=17)){
            m=n-6;
            System.out.println("schoolchild " + m);
        }
        if ((n>17)&&(n<=22)){
            m=n-17;
            System.out.println("student " + m);
        }
        if (n>22)
            System.out.println("specialist");

    }
}