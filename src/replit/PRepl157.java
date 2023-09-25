package replit;

public class PRepl157 {
    public void m1() {
        System.out.println("m1 method in Parent class");
    }
}
    class Child1 extends PRepl157 {
        public void m2() {

            this.m1();      // Call m1 from child class

            super.m1();     // Call m1 from parent class using super
        }

        public void m1() {
            System.out.println("m1 method in Child class");

        }


        public static void main(String[] args) {
            Child1 child = new Child1();
            child.m2();
        }
    }




