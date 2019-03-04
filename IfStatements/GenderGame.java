package Week2.IfStatements;

import java.util.Scanner;
public class GenderGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String gender,Firstname,Lastname,married;
        int Age;
        System.out.println("What is your gender (M or F): ");
        gender = input.next();
        System.out.println("First name: ");
        Firstname = input.next();
        System.out.println("Last name: ");
        Lastname = input.next();
        System.out.println("Age: ");
        Age = input.nextInt();
        System.out.println();

        if (Age >= 20 && gender.equals("F")){
            System.out.println("Are you married?" + Firstname + "(y or n)");
            married = input.next();
            if (married.equals("y"))
                System.out.println("Then I shall call you Mrs." + Lastname);

            else if (married.equals("n"))
                System.out.println("Then I shall call you Ms" + Lastname);
            }
            if (Age >= 20 && gender.equals("M")){
                System.out.println("Then I shall call you Mr." + Lastname);

            }
            if (Age < 20 ){
                System.out.println("Then I shall call you " + Firstname + Lastname);
            }

        }
    }







