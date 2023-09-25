package ClassOfMix;

/*Instantiate and StringBuffer class
Append Value "Hello" to it
        Append value "World" to it.
        Print in UPPERCASE.
        **Expected Output:**
        HELLO WORLD*/
        public class T18R {
            public static void main(String[] args) {

                StringBuffer stringBuffer=new StringBuffer();
                stringBuffer.append("Hello");
                stringBuffer.append(" World");
                String result=stringBuffer.toString().toUpperCase();
                System.out.println(result);

            }
        }









