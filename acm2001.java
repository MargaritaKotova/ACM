/**
 * Created by 11007139 on 12.10.2017.
 */
import java.util.*;
import java.io.*;

public class acm2001
{
    public static void main (String[] argv) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = a + b;

        System.out.println(c);
    }
}
