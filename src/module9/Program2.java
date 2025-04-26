package module9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){
        String fileName = "data.file";
        File file = new File(fileName);
        Random random = new Random();

        try {
            if(file.createNewFile()) {
                System.out.println(fileName + "created.");
            } else {
                System.out.println(fileName + "is already existed.");
            }
            FileWriter writer= new FileWriter(file, true);
            for (int i = 0; i < 10; i++) {
                int randomNum = random.nextInt(100);
                writer.write(randomNum + " ");
            }
            writer.close();

            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    System.out.print(scanner.nextInt() + " ");
                } else {
                    scanner.next();
                }
            }
            scanner.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
