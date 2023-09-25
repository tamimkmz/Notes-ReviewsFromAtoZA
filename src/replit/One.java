package replit;
 class One {
     //Create three classes (A, B, C)
     //
     //Write two constructors:
     //
     //* Have a default constructor that prints out the following
     //
     //For A:  "I"
     //
     //For B: "am"
     //
     //For C: "a tester"
     //
     //Make C extend B
     //
     //and B extend A
     //
     //From your Main class create an object of the C class.
     //
     //**Expected Output:**
     //
     //```
     //I
     //```
     //
     //```
     //am
     //```
     //
     //```
     //a tester
         public One() {
             System.out.println("I");
         }
     }

      class B extends One {
         public B() {
             System.out.println("am");
         }
     }

      class C extends B {
          public C() {
              System.out.println("a tester");
          }


         public static void main(String[] args) {
             C cObject = new C();
         }
     }

