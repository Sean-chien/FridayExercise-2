package Week2.Arrays;

public class WhereIsIt {
    public static void main(String[] args) {
        int[] arr;

        arr = new int[10];

        arr[0] = 45;
        arr[1] = 36;
        arr[2] = 32;
        arr[3] = 12;
        arr[4] = 44;
        arr[5] = 50;
        arr[6] = 42;
        arr[7] = 26;
        arr[8] = 16;
        arr[9] = 20;

        for (int i = 0; i < arr.length; i++)
            System.out.println("Value to find: " + arr[i]);
    }
}

