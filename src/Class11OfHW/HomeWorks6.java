package Class11OfHW;

import java.util.Scanner;

//Write a program that reads two people's first
//names and if they expecting boy or girl?
//Based on the input suggests a name for a baby:
//Example Output:
//Mom’s first name? Mary
//Dad’s first name? Daniel
//Boy or Girl? boy
//Suggested baby name: DANRY
public class HomeWorks6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mom's first name");
        String momNmae = scanner.next();
        System.out.println("Enter dad's first name");
        String dadName = scanner.next();
        System.out.println("Enter baby's gender");
        String babyGender = scanner.next();

        if (babyGender.equals("babyboy")){
            String babyboyName=dadName.substring(1,dadName.length()/2)+momNmae.substring(momNmae.length()/4);
            System.out.println(babyboyName);
       System.out.println("baby boy");
    }else if(babyGender.equals("babyboy")){
            String babygirlName=dadName.substring(1,momNmae.length()/2)+dadName.substring(dadName.length()/2);
            System.out.println(babygirlName);
            System.out.println("baby girl");
        }else
            System.out.println("Unknown gender");
        {

        }

    }
}

