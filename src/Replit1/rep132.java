package Replit1;

public class rep132 {
    public static void main(String[] args) {
        int[][] inputArray = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };

        int[][] reducedArray = reduce10(inputArray);

        // Printing the values from the new array
        for (int[] row : reducedArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int[][] reduce10(int[][] nums) {
        int numRows = nums.length;
        int numCols = nums[0].length;

        int[][] result = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                result[i][j] = nums[i][j] - 10;
            }
        }

        return result;
    }
}