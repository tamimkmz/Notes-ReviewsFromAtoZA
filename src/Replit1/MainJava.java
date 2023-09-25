package Replit1;
//Complete the mystery method so that it takes in an integer array as a parameter, and then modifies each element based on whether it's even or odd.
//
// If the number is even, divide it by 2.  If it's odd, multiply it by 10.
public class MainJava {
    public static void main(String[] args) {
        int []a={1, 2, 3, 4 , 5};
        mystery(a);
        for (int num:a){
            System.out.print(num+" ");

        }
    }
    static void mystery(int[]array){
        for (int i=0; i<array.length;i++){
            if(array[i]%2==0){//we check if it's even (divisible by 2) or odd (not divisible by 2).
                array[i] /= 2;
                }else{
    array[i]*=10;
                }
            }
        }
    }

