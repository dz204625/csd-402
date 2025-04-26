package module9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango", "Orange", "Pineapple", "Grapes", "Strawberry", "Blueberry", "Papaya", "Kiwi"));
        for(String fruit: fruits) {
            System.out.println(fruit + ": " + fruits.indexOf(fruit));
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which fruit do you want to see again? Please enter number 0 - 9: ");
        String userChoice = scanner.nextLine();
        try {
            Integer index = Integer.parseInt(userChoice);
            String fruit = fruits.get(index);
            System.out.println(fruit + "is the fruit user want to see again.");
        } catch (Exception e) {
            System.out.println("Exception: Out of Bounds");
        }
        scanner.close();
    }
}
