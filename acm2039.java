import java.util.Scanner;
import java.io.*;
import java.util.regex.Matcher;


public class acm2039 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//ñîçäà¸ì îáúåêò êëàññà Scanner
        String stroka = in.nextLine();
        char[] tmp = stroka.toCharArray();

        int m = 0,k = 0;
        for (int i = 0;i < tmp.length;i++) {

            if (Character.isAlphabetic(tmp[i]))

                k=m;

            else
            if ((i>0)&&(Character.isAlphabetic(tmp[i-1])))
                m += 1;

            if ((Character.isAlphabetic(tmp[i]))&&(i==tmp.length-1))
                m += 1;
        }

        System.out.println(m);
    }
}
