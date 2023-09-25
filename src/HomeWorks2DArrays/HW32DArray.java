package HomeWorks2DArrays;

public class HW32DArray {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 25, 35, 45,},
                {15, 20, 30, 40},
                {20, 45, 60, 70},
        };

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if (numbers[row][col] % 2 == 0) {
                    System.out.print(numbers[row][col] + " ");
                }
            }
            System.out.println();
        }
    }
}
