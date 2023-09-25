package Replit1;

public class MainMethod {

        private static String myMethod1() {
            return  "private";
        }
        static String myMethod2() {
            return  "default";
        }
        protected static String myMethod3() {
            return  "protected";
        }
        public static String myMethod4() {
            return "public";
        }
    }
    class Main {
        public static void main(String[] args) {
            //System.out.println(AnotherClass.myMethod1());
            System.out.println(MainMethod.myMethod2());
            System.out.println(MainMethod.myMethod3());
            System.out.println(MainMethod.myMethod4());
        }
    }

