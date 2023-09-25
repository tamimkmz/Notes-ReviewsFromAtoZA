package replit;

public class repl164 {
    public void hello() {
        System.out.println("method in Parent class");
    }
}

class Child01 extends repl164 {

    public void hello() {
        System.out.println("method in Child1 class");
    }
}

class Child02 extends repl164 {

    public void hello() {
        System.out.println("method in Child2 class");
    }
}

class Child03 extends repl164 {

    public void hello() {
        System.out.println("method in Child3 class");
    }

    public static void main(String[] args) {
        Child01 child01 = new Child01();
        Child02 child02 = new Child02();
        Child03 child03 = new Child03();

        repl164[] children = { child01, child02, child03 };

        for (repl164 child : children) {
            child.hello();
        }
    }
}


