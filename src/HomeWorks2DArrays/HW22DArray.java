package HomeWorks2DArrays;

public class HW22DArray {
    public static void main(String[] args) {
        int [][]numbers={
                {10,25,35,45,},
                {15,20,30,40},
                {20,45,60,70},
        };
        int sum=0;
        for(int r=0; r<numbers.length; r++){
            for(int c=0;c<numbers[r].length;c++){
                sum=sum+numbers[r][c];

                }
            }
        System.out.println(sum);
        }

    }

