package ClassOfMix;

public class T4R {
    public static void main(String[] args) {
        String str="abracadabra alakazam";
        String target1 = "dab";
        String target2 ="ABRA";

        int positionOfC = str.indexOf("c");
        System.out.println("" + positionOfC);
        int positionOfSpace = str.indexOf(" ");
        System.out.println("" + positionOfSpace);
        int positionOfTarget1 = str.indexOf(target1);
        System.out.println("" + positionOfTarget1);
        int positionOfTarget2 = str.indexOf(target2);
        System.out.println("" + positionOfTarget2);
    }
}
