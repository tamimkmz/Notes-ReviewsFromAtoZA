package replit;
//Overload private instance method m1
//
//Call each method from the main method.

//Expected Output:

//private m1 method
//private m1 method with int parameter
public class Overload {
    private void m1(){
        System.out.println("private m1 method");
    }
private void m1(int a){
    System.out.println("private m1 method with int parameter");
}

    public static void main(String[] args) {
        Overload overload=new Overload();
        overload.m1();
        overload.m1(50);
    }
}
