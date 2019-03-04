package Week2.ArrayLists;

import java.util.ArrayList;
public class ThereOrNot {
    private static Object ArrayList;

    public static void main(String[] args) {
        ArrayList num = new ArrayList(System.in);
        int[] Array = {45, 39, 32, 12, 44, 50, 26, 42, 16, 20};
        if ( ArrayList == num){
            System.out.println("Value to find: " + num);
            System.out.println(num + "is in the array");

        }
        if (ArrayList != num){
            System.out.println("Valu to find: " + num);
            System.out.println(num + "is not in the array");
        }

    }
}
