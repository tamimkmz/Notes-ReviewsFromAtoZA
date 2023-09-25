package Class11OfHW;

public class repl141 {
    public static int maxValue(int[] arr) {
        if (arr == null || arr.length == 0) {
           // throw new IllegalAccessException("Array is empty or null");

        }
        int max = arr[0];// Initialize max with the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];// Update max if a larger element is found
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int []arr={5,12,-3, 7, 3, 22};
        System.out.println(maxValue(arr));
    }
}