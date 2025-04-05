package module4;

public class CalculateAverage {
    // calculate average for array of short
    public static void average (short [] array) {
        short sum = 0;
        StringBuilder displayArray = new StringBuilder();
        for(short i: array) {
            sum += i;
            displayArray.append(i).append(" ");
        }
        System.out.println("Short Array:");
        System.out.println(displayArray);
        System.out.println("Average for short: ");
        System.out.println((short) (sum/ array.length));
    }
    // calculate average for array of int
    public static void average (int [ ] array) {
        int sum = 0;
        StringBuilder displayArray = new StringBuilder();
        for(int i: array) {
            sum += i;
            displayArray.append(i).append(" ");
        }
        System.out.println("Int Array:");
        System.out.println(displayArray);
        System.out.println("Average for int: ");
        System.out.println((int) (sum/ array.length));
    }
    // calculate average for array of long
    public static void average (long [] array) {
        long sum = 0;
        StringBuilder displayArray = new StringBuilder();

        for(long i: array) {
            sum += i;
            displayArray.append(i).append(" ");
        }
        System.out.println("Long Array:");
        System.out.println(displayArray);
        System.out.println("Average for long: ");
        System.out.println((long) (sum/ array.length));
    }
    // calculate average for array of double
    public static void average (double  [] array) {
        double  sum = 0;
        StringBuilder displayArray = new StringBuilder();

        for(double  i: array) {
            sum += i;
            displayArray.append(i).append(" ");
        }
        System.out.println("Double Array:");
        System.out.println(displayArray);
        System.out.println("Average for double: ");
        System.out.println((double) (sum/ array.length));
    }
    public static void main(String[] args) {
        short[] shortArray = {10, 20, 30, 40, 50};
        average(shortArray);

        int[] intArray = {100, 200, 300};
        average(intArray);

        long[] longArray = {1000L, 2000L, 3000L, 4000L};
        average(longArray);

        double[] doubleArray = {12.5, 15.5, 20.0, 25.0, 30.5};
        average(doubleArray);
    }
}
