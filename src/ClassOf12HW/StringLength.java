package ClassOf12HW;
// Create a String "name" and assign the value "Timmy" to it.
//- Find out how many characters are there in the given String.
    public class StringLength {
        public static void main(String[] args) {

            String name = "Timmy";
            int count = 0;
             for (int i=0;i<name.length();i++){
                if (name.charAt(i) != ' ') {
                    count++;

                }
            }
            System.out.println("The length of the string is: " + count);
        }
    }












