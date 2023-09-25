package ClassOfMix;
/*Create a String given="Hello Syntax friends".
Using String methods from given String create new String "Welcome Syntax family"
**Expected Output:**
Welcome Syntax family*/

public class T9R {
    public static void main(String[] args) {
        String given="Hello Syntax friends";
      // String given2="Welcome Syntax family";
       String newGiven=given.replace("Hello","Welcome").replace("friends","family");

        System.out.println(newGiven);

    }
}












