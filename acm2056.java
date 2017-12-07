import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class acm2056{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> wordToCount = new HashMap<>();
        Map<String, Integer> MapTree = new TreeMap<>();


       while(in.hasNext()) {
           for (String words : in.nextLine().toLowerCase().split(" ")) {

               if (!wordToCount.containsKey(words))
               {
                   wordToCount.put(words, 0);
               }
               wordToCount.put(words, wordToCount.get(words)+ 1);
                         }
       }

        int maxValue = 0;
        for (String words : wordToCount.keySet())
        {
            if (wordToCount.get(words)>maxValue) {
                maxValue = wordToCount.get(words);
            }

        }
        for (String words : wordToCount.keySet()) {
             if (wordToCount.get(words)== maxValue) {
                 MapTree.put(words, wordToCount.get(words));
             }
        }
        for(Map.Entry e : MapTree.entrySet()){

            System.out.println(e.getKey());
        }
    }
}



