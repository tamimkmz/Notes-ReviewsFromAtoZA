package ClassOfMix;
//Create a method with the following specs:
//Returns:
//an integer
//Name:
//sumEvenToX
//Parameters:
//an integer called "x"
//Purpose:
//calculate the sum of the EVEN integers from 1 to x (including x)
//Examples:`
//sumEvenToX(5) ==> 6
//sumEvenToX(8) ==> 20

public class T12R {
    public static void main(String[] args) {
        System.out.println(sumEvenToX(10));//Returns:
    }
    static int sumEvenToX(int x) {//an integer///sumEvenToX///Parameters///an integer called "x":

        int sum = 0;//Purpose:
        for (int i = 2; i <= x; i = i + 2) {//calculate the sum of the EVEN integers from 1 to x (including x)
sum=sum+i;
        }
     return sum;

    }
}












