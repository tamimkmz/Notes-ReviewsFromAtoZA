package ClassOfMix;

/*Step1: Create three methods that will accept 2 in parameters on integer type

Step2: Write the logic in methods to perform actions below:

The first method for multiplication

The second method for addition

The third method for subtraction

Step3: execute all methods

1. for the addition method add two numbers to make 30

2. for multiplication multiply two numbers to make 30

3. for Subtraction subtract two numbers to equal 20

**Expected Output:**

```
Addition 30*/
        public class T25R {
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int addition(int a, int b){
        return a+b;
    }
    public static int subtraction(int a, int b){
        return a-b;
    }
    public static void main(String[] args){
        int result1=addition(10,20);
        int result2=multiply(6,5);
        int result3=subtraction(30,10);

        if(result1==30){
            System.out.println("Addition 30");
        }
        if (result2==30){
            System.out.println("Multiplication 30");
        }
        if (result3==20){
            System.out.println("Subtraction 20");
        }
    }

}














