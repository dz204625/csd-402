package module5;

public class Main {
    public static int[] locateLargestInt(int[][] arrayParam) {
        int[] location = new int[2];
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateLargestDouble(double[][] arrayParam) {
        int[] location = new int[2];
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
    public static int[] locateSmallestInt(int[][] arrayParam) {
        int[] location = new int[2];
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallestDouble(double[][] arrayParam) {
        int[] location = new int[2];
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static void main(String[] args) {
        // create in array
        int[][] intArray = {
                {3, 5, 9},
                {2, 8, 7},
                {6, 1, 5},
                {3, 6, 9},
                {2, 3, 7},
                {6, 1, 4}
        };

        // create double array
        double[][] doubleArray = {
                {1.1, 5.5, 3.3},
                {4.4, 0.2, 9.9},
                {7.7, 2.2, 6.6},
                {1.3, 5.9, 2.3},
                {1.4, 6.2, 0.9},
                {9.7, 4.2, 8.6}
        };

        int [] largestInt = locateLargestInt(intArray);
        System.out.println("The largest int's location is " + largestInt[0] + " " + largestInt[1]);
        int [] largestDouble = locateLargestDouble(doubleArray);
        System.out.println("The largest double's location is " + largestDouble[0] + " " + largestDouble[1]);
        int [] smallestInt = locateSmallestInt(intArray);
        System.out.println("The smallest int's location is " + smallestInt[0] + " " + smallestInt[1]);
        int [] smallestDouble = locateSmallestDouble(doubleArray);
        System.out.println("The smallest double's location is " + smallestDouble[0] + " " + smallestDouble[1]);
    }
}



