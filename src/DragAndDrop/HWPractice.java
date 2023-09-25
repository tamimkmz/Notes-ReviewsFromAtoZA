package DragAndDrop;

public class HWPractice {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };
            int rowTotal = 0;
            for (int i = 0; i < a.length; i++) {
                rowTotal += a[1][i];
                System.out.println(rowTotal);

            }


        }

    }



