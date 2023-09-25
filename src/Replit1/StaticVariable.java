package Replit1;

public class StaticVariable {
 static int number;
        public static void main(String[] args) {
            StaticVariable.number=200;
            StaticVariable obj=new StaticVariable();
            obj.number=200;
            System.out.println(StaticVariable.number);

        }


    }

