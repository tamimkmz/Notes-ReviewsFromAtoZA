package ClassOfMix;
/*Based on the user inputs program should give a correct answer.
If browser is Chrome or Chrome or CHROME or ChRoMe it should print the:
"Proceed with Chrome browser"
If browser is firefox, FIREFOX or FireFOX it should print the:
"Proceed with Firefox browser"
If browser is IE, ie or iE it should print the:
"Proceed with IE browser"
If any other browser it should print the:
"Invalid browser"*/
import java.util.Scanner;

public class T8R {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a browser name: ");
            String browser = sc.nextLine().toLowerCase();

            if (browser.equals("Chrome") || browser.equals("chrome") || browser.equals("CHROME") || browser.equals("ChRoMe")) {
                System.out.println("Proceed with Chrome browser");
            } else if (browser.equals("is firefox" ) ||(browser.equals("FIREFOX")) || browser.equals("FireFOX")) {
                System.out.println("Proceed with Firefox browser");
            } else if (browser.equals("IE") || browser.equals("ie")|| browser.equals("iE")) {
                System.out.println("Proceed with IE browser");
            } else

                    System.out.println("Invalid browser");
                }
                }

            }












