package Replit1;

public class MethodClass {
    public void printProgrammingMessage(){
        System.out.println("Programming is amazing");
    }
    public static void printJavaMessage(){
        System.out.println("Java is awesome");
        }

    public static void main(String[] args) {
        MethodClass obj=new MethodClass();
        obj.printProgrammingMessage();
        MethodClass.printJavaMessage();
    }
    }


