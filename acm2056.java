import java.util.*;
import java.io.*;

class acm2056 {
    public static void main(String args[]) {
        Map<String, Integer> wordsmap = new HashMap<>();

        Scanner in = new Scanner(System.in);

        while(in.hasNext()) {//пока есть следующий элемент
            for (String word : in.nextLine().toLowerCase().split(" ")) {
                if (word.isEmpty()) {
                    continue;
                }
                wordsmap.put(word, wordsmap.getOrDefault(word, 0) + 1);
                System.out.println(wordsmap.getOrDefault(word, 0) + 1);

            }
        }


        int max = Collections.max(wordsmap.values());
        Set<String> treeSet = new TreeSet<>();
        for (String s : wordsmap.keySet()) {
            Integer count = wordsmap.get(s);
            if (count.intValue() == max) {
                treeSet.add(s);
            }
        }

        for (String s:treeSet) {
            System.out.println(s);
        }
    }
}