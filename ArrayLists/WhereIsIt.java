package Week2.ArrayLists;

import java.util.ArrayList;
public class WhereIsIt {
    public static void main(String[] args) {
        int[] arrs;

        arrs = new int[10];

        arrs[0] = 45;
        arrs[1] = 36;
        arrs[2] = 32;
        arrs[3] = 12;
        arrs[4] = 44;
        arrs[5] = 50;
        arrs[6] = 42;
        arrs[7] = 26;
        arrs[8] = 16;
        arrs[9] = 20;

        for (int i = 0; i < arrs.length; i++)
            System.out.println("Value to find: " + arrs[i]);
    }
}


