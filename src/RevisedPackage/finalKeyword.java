package RevisedPackage;

public class finalKeyword {
    public final void finalMethod(boolean flag){
        System.out.println("Final method with boolean parameter");

    }
    public final void finalMethod(String text){
        System.out.println("Final method with String parameter");

    }

    public static void main(String[] args) {
        finalKeyword fin =new finalKeyword();
        fin.finalMethod(true);
        fin.finalMethod("Hello");
    }

}
