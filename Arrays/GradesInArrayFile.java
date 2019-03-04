package Week2.Arrays;
import java.util.Scanner;

public class GradesInArrayFile {
    private static String Marc;
    private static String Antony;
    public static void main(String[] args) {
        int[] Anarray = new int[4];
        Anarray[0] = 54;
        Anarray[1] = 90;
        Anarray[2] = 18;
        Anarray[3] = 37;
        Anarray[4] = 62;
        Scanner input = new Scanner(System.in);
        String Firstname = Marc;
        String Lastname =  Antony;

        System.out.println("Name (first last): " + Firstname + Lastname);
        Firstname = input.next();
        System.out.println("Filename: " );
        Lastname = input.next();
        System.out.println();
        System.out.println("Here are your randomly-selected grades (hope you pass):" );
        System.out.println("Grade 1: " + Anarray[0]);
        System.out.println("Grade 2: " + Anarray[1]);




    }

}

