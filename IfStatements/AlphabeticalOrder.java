package Week2.IfStatements;

import java.util.Scanner;
public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name,Lastname;
        System.out.println("What is your Last name? ");
        name = input.next();
        if (name.equals("Carswell")){
            System.out.println("It's going to be a while before we get to you," + "\"name");
        }
        if (name.equals("Jones")){
            System.out.println("It's going to be a while before we get to you,\"name");
        }
        if (name.equals("Smith")){
            System.out.println("It's going to be a while before we get to you, \"name");
        }
        if (name.equals("Young")){
            System.out.println("It's going to be a while before we get to you, \"name");
        }



    }
}
