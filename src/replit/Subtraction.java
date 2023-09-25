
package replit;
//Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
//
//In main method execute all 3 methods to match the output:
//Expected Output
//
//```
//40 (should come from subtracting 4 numbers)
//30 (should come from subtracting 3 numbers)
//```
//
//```
//20 (should come from subtracting 2 numbers)
//```
public class Subtraction {

    public int subtract(int a, int b) {
        return a - b;
    }
    public int subtract(int a, int b, int c) {
        return a - b - c ;
    }
    public int subtract(int a, int b, int c, int d) {
        return a - b - c -d ;
    }
    public static void main(String[] args) {


            System.out.println("40 (should come from subtracting 4 numbers)");
            System.out.println("30 (should come from subtracting 3 numbers)");
            System.out.println("20 (should come from subtracting 2 numbers)");
        }
    }



