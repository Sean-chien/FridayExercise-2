package Week2.IfStatements;

import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int planet;
        double weght;
        System.out.println("Please enter your current earth weight: ");
        double weight = value.nextDouble();
        System.out.println();
        System.out.println("I have information for the following planets: ");
        System.out.println("\t1. Venus\t" + "\t2. Mars\t" + "\t3. Jupiter\t" + "\t4. Saturn\t" +
                           "\t5. Uranus\t" + "\t6. Neptune\t");
        System.out.println("Which planet are you visiting? ");
        planet = value.nextInt();
        System.out.println("===========================================================");

        if (planet == 1){
            weight = weight * 0.78;
            System.out.println("Your weight would be " + weight + "pounds on the planet");
        }
        else if (planet == 2){
            weight = weight * 0.39;
            System.out.println("Your weight would be " + weight + "pounds on the planet");

        }
        else if (planet == 3){
            weight = weight * 2.65;
            System.out.println("Your weight would be " + weight + "pounds on the planet");

        }
        else if (planet == 4){
            weight = weight * 1.17;
            System.out.println("Your weight would be " + weight + "pounds on the planet");

        }
        else if (planet == 5){
            weight = weight * 1.05;
            System.out.println("Your weight would be " + weight + "pounds on the planet");

        }
        else if (planet == 6){
            weight = weight * 1.23;
            System.out.println("Your weight would be " + weight + "pounds on the planet");

        }
        else{
            System.out.println("please try to again!!");
        }





    }
}