package Week2.Arrays;

public class FindingValueInArray {
    public static void main(String[] args) {

        int[] Array = {45, 39, 32, 12, 44, 50, 26, 42, 16, 20};
        int toFind = 7;
        boolean found = true;

        for (int n : Array) {

            if (found)
                System.out.println(toFind + " is in the array");
            else
                System.out.println(toFind + " is not found.");
        }
    }
}