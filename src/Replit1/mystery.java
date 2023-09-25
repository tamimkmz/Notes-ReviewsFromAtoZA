package Replit1;
//Complete the mystery method so that it takes in an integer array as a parameter, and then modifies each element based on whether it's even or odd.
//
// If the number is even, divide it by 2.  If it's odd, multiply it by 10.
//
//**Expected Output:**
//
//```
//10 1 30 2 50
//```
public class mystery {
    public static void main(String[] args) {
    int [] numbers={5, 2, 3, 4, 5};// int method
    mystery(numbers);
    for (int number : numbers){
        System.out.print(number +" ");

    }
    }
    public static void mystery(int [] arr){//then modifies each element of array based on whether it's even or odd.
        for(int i=0; i<arr.length;i++){
            if(arr[i] %2==0) {//If the number is even, divide it by 2
                arr[i] /= 2;
            }else {//If the number is odd, multiply it by 10
            arr[i] *=10;
            }
        }
    }
}

