package Replits;
/*In java methods how to Create an Interface with name as MyInterface

Create two undefined methods method1 and method2

Inherit the MyInterface to Main Class.

Execute both methods

**Expected Output:**

```
implementation of method1
```

```
implementation of method2*/
interface MyInterface {

        void method1();
        void method2();
    }
    class Main implements MyInterface{
        public static void main(String[] args) {
           Main main =new Main();
            main.method1();
            main.method2();
        }

        public void method1() {
            System.out.println("implementation of method1");
        }

        public void method2() {
            System.out.println("implementation of method2");
        }
    }


