package Class11OfHW;

//Create a String that should be combination of letters, numbers and special characters.
// Find out how many Alphabets(abd AZ) characters are there in the String.
public class HomeWorks2 {
    public static void main(String[] args) {
        String str = "Hello12345@#$%Great Job Guys";
        char [] charArray=str.toCharArray();
        int UpperCase=0;
        int LowerCase=0;
        for (char m:str.toCharArray()){
            if(Character.isUpperCase(m)) {
                UpperCase++;
            }else if(Character.isLowerCase(m)){
                LowerCase++;
            }
            }
        System.out.println("the max uppercase alphabets are "+UpperCase);
        System.out.println("the max lowercase alphabets are "+LowerCase);

        }
    }


