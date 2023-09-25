package replit;
/*In Parent class create 4 methods with different level of access modifiers.
In each method print "I am parent public/protected/default/private method".

Override methods in child class

In Main Class create object of the child class and see which methods are available

**Expected Output:**

I am a child public method

I am a child protected method

I am a child default method
```*/
public class repl165 {
        public void publicMethod() {
            System.out.println("I am a parent public method");
        }

        protected void protectedMethod() {
            System.out.println("I am a parent protected method");
        }

        void defaultMethod() {
            System.out.println("I am a parent default method");
        }

        private void privateMethod() {
            System.out.println("I am a parent private method");
        }
    }

    class Child extends repl165 {
        @Override
        public void publicMethod() {
            System.out.println("I am a child public method");
        }

        @Override
        protected void protectedMethod() {
            System.out.println("I am a child protected method");
        }

        // Default method from parent is inherited but not overridden

        // Private method from parent is not inherited



        public static void main(String[] args) {
            Child child = new Child();

            child.publicMethod();    // Calls the overridden public method in child
            child.protectedMethod(); // Calls the overridden protected method in child
            child.defaultMethod();   // Calls the inherited default method from parent
            // child.privateMethod(); // Cannot call the private method from parent
        }
    }

