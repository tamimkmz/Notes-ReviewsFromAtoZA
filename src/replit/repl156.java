package replit;
//Create class A
//
//declare variable int i=10;
//
//Create class B  extends A
//
//declare variable int i=20;
//
//create a method to display value of variable i from both classes
//
//In Main Class create an object of subclass and call method display
//
//**Expected Output:**
//
//```
//20
//```
//
//```
//10
public class repl156 {
    int i=10;

}
class Boy extends repl156{
    int i =20;
    public void display(){
        System.out.println(i);
        System.out.println(super.i);
    }

    public static void main(String[] args) {
        Boy obj =new Boy();
        obj.display();
    }
}
