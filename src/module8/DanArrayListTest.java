package module8;

import java.util.ArrayList;
import java.util.Scanner;

public class DanArrayListTest {
    public static Integer max (ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer maxValue = (Integer) list.get(0);
        for (Object num : list) {
            if (num instanceof Integer current) {
                if (current > maxValue) {
                    maxValue = current;
                }
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter an integer: ");
        ArrayList<Integer> inputArray = new ArrayList<>();

        while (true) {
            int inputInt = scanner.nextInt();
            inputArray.add(inputInt);
             if(inputInt == 0) break;
        }

        Integer largestValue = max(inputArray);
        System.out.println("The largest integer is " + largestValue);
        scanner.close();
    }
}
