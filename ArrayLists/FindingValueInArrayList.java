package Week2.ArrayLists;

import java.util.ArrayList;
public class FindingValueInArrayList {
    public static void main(String[] args) {
        int[] ArrayList = {45, 39, 32, 12, 44, 50, 26, 42, 16, 20};
        int toFind = 7;
        boolean found = true;

        for (int n : ArrayList) {

            if (found)
                System.out.println(toFind + " is in the array");
            else
                System.out.println(toFind + " is not found.");
        }

    }
}
