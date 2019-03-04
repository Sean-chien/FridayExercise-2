package Week2.ArrayLists;

import java.util.ArrayList;
public class GettingTheLargestValue {
    public static void main(String[] args) {
        int[] ArrayList = {45, 39, 32, 12, 44, 50, 26, 42, 16, 20};
        int maxIndex = ArrayList[0];
        for (int i = 0; i < ArrayList.length; i++) {
            if (maxIndex < ArrayList[i]) {
                maxIndex = ArrayList[i];
                System.out.println();
                System.out.println(maxIndex);
            }
        }
    }
}
