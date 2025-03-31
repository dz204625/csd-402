package module3;

public class Pattern {
    public static void main(String[] args) {
        int rows = 7;

        // Loop for each row
        for (int i = 1; i <= rows; i++) {
            // Print left half
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Print spaces
            }

            // Print powers of 2
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num *= 2; // Multiply by 2 to get the next power of 2
            }

            // Print reversed powers of 2
            num /= 4; // To step back from the last number (as the loop above ends on the last power)
            for (int j = 1; j < i; j++) {
                System.out.print(num + " ");
                num /= 2; // Divide by 2 to go backwards
            }

            // Print the @ at the end of the row
            System.out.println(" ".repeat(2*(rows+1-i)+1) + "@");
        }
    }
}
