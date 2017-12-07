import java.util.Arrays;
import java.util.Scanner;

public class acm2057 {
    private int size;
    private int[] set;

    public acm2057() {
        this.size = 0;
        int[] set = new int[size];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }


    public void add(int element) {
        if (this.isEmpty()) {
            size = 1;
            set = new int[size];
            set[0] = element;
        } else {
            set = Arrays.copyOf(set, size + 1);
            size++;
            set[size - 1] = element;
        }
    }

    private int min(int[] multiset) {
        int min = multiset[0];
        for (int i = 1; i <= size - 2; i++) {
            if (set[i] < min) min = multiset[i];
        }

        return min;
    }

    private int size() {
        return this.size;
    }

    public int removeMin() {

        int min = min(set);

        for (int i = 0; i < size - 1; i++) {
            if (set[i] == min) {
                for (int j = i; j < size - 1; j++) {
                    set[j] = set[j + 1];
                }
                size--;
                break;
            }


        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        acm2057 myset = new acm2057();

        for (int i = 0; i < n; i++) {
            int k = in.nextInt();
            if(k == 1) {

                myset.add(in.nextInt());

            } else System.out.println(myset.removeMin());
        }

    }

}
