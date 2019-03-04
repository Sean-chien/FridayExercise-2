package Week2.Arrays;

public class FindingTheLargestValue {
    public static void main(String[] args) {
        int[] Array = {45, 39, 32, 12, 44, 50, 26, 42, 16, 20};
        int maxIndex = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (maxIndex < Array[i]) {
                maxIndex = Array[i];
                System.out.println();
                System.out.println(maxIndex);
            }


        }
    }
}