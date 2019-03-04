package Week2.IfStatements;

import java.util.Scanner;
public class BMICategories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight;
        double height;
        System.out.println("Your height in m: ");
        height = input.nextDouble();
        System.out.println("Your weight in kgs: ");
        weight = input.nextDouble();
        double bmi = weight/height;
        System.out.println("  ");
        System.out.println("Your bmi =  " + bmi);
        if (bmi < 18.5){
            System.out.println("underweight");
        }
        else if (bmi >= 18.5 && bmi < 24.9){
            System.out.println("normal weight");
        }
        else if (bmi >= 25.0 && bmi < 29.9){
            System.out.println("overweight");
        }
        else if (bmi >= 30.0){
            System.out.println("you must lost your weight");
        }

    }
}
