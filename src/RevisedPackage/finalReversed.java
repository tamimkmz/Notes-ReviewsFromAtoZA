package RevisedPackage;

public class finalReversed {
  public final String reverseString(String str){
      StringBuilder reversed=new StringBuilder();
      for(int i=str.length()-1; 1>=0; i--){
          reversed.append(str.charAt(i));
      }
      //return reversed.toString();
  }

    public static void main(String[] args) {
        finalReversed obj =new finalReversed();

        String reversedString =obj.reverseString("hello");
        System.out.println(reversedString);
    }
}
