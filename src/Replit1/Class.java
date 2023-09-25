package Replit1;

class Classabc {
public static void main(String[] args) {
        Classabc  instance1=new Classabc(10, 10.23, 'a');
        instance1.printClassabc();

        Classabc instance2=new Classabc(100,100.23,'s');
        instance2.printClassabc();
        }


    int intValue;
    double doubleValue;
    char charValue;

    public Classabc(int intValue, double doubleValue, char charValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
        this.charValue = charValue;


    }

    public void printClassabc() {
        System.out.println(intValue);
        System.out.println(doubleValue );
        System.out.println(charValue);

    }
}
