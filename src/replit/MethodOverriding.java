package replit;
/*In Parent Class create a method with name method() that will print  "Parent method"

Override method() in Child class that will print "Child method"

In Main Class create objects of child and parent class and call its method.

**Expected Output:**

```
Parent method
Child method
```*/
public class MethodOverriding {
    public void Method(){
        System.out.println("Parent method");

        }
    }

    class Childd extends MethodOverriding {

        public void Method() {
            System.out.println("Child method");
        }

            public static void main(String[] args) {
                MethodOverriding parent = new MethodOverriding();
                Childd child = new Childd();
                parent.Method();
                child.Method();

            }

        }




