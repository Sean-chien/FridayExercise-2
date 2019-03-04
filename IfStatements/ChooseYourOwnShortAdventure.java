package Week2.IfStatements;

import java.util.Scanner;
public class ChooseYourOwnShortAdventure {
    public static void main(String[] args) {
        Scanner keybroad = new Scanner(System.in);
        String go,look,eat;

        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
        System.out.println("    ");
        System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the\n" +
                "\"kitchen\"?");
        go = keybroad.next();
        if (go.equalsIgnoreCase("kitchen")){
            System.out.println("There is a long countertop with dirty dishes everywhere.");
        }
        look = keybroad.next();
        if (look.equalsIgnoreCase("refrigerator")){
            System.out.println("Inside the refrigerator you see food and stuff.");
        }
        eat = keybroad.next();
        if (eat.equalsIgnoreCase("Yes")){     // boolean equalsIgnoreCase(String str)
            System.out.println("You are living!!");       // 当比较两个字符串时，它会认为A-Z和a-z是一样
        }
        else if (eat.equalsIgnoreCase("no")){
            System.out.println("You die of starvation... eventually.");
        }





    }


}
