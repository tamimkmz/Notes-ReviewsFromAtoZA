package replit;
/*Overload instance method display by having different types of parameters

Inside each method write the logic to print value of the parameter

Call all methods inside your main method

**Expected Output:**

100

Syntax Technologies

100.09
```*/
public class Overload1 {
   public void Display(int a){
        System.out.println(a);
    }
public void Display(String b){
    System.out.println(b);
}
public void Display(double value){
    System.out.println(value);
}
    public static void main(String[] args) {
        Overload1 over =new Overload1();
        over.Display(100);
        over.Display("Syntax Technologies");
        over.Display(100.09);
    }
}
