package RevisedPackage;

public class avgElementFinal {
    public final double avgElements(int[] arr) {
        if (arr.length == 0) {

            return 0.0;

        }
        int sum = 0;
        for (int num : arr) {
            sum += num;

        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        avgElementFinal obj =new avgElementFinal();
        int[] array = {2,7,3,8,4};
        double average = obj.avgElements(array);
        System.out.println(average);
    }
}