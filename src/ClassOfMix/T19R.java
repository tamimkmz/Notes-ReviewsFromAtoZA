package ClassOfMix;

/*How would you reverse a String using StringBuffer Class

Given String = "Hello Friends"

**Expected Output:**

```
sdneirF olleH*/
        public class T19R {
            public static void main(String[] args) {

               String input="How are you";
               StringBuffer stringBuffer=new StringBuffer("how are you");
               stringBuffer.reverse();
               String reversedString=stringBuffer.toString();
                System.out.println(reversedString);
            }
        }









