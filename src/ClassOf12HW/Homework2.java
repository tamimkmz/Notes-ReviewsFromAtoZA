package ClassOf12HW;
//Create  class Student that will have a method getGrade.
// Your method should accept the score of a student and return a grade:
//score > 90 - A
//score >80 - B
//score >70 - C
//score > 50 - D
//anything else - F
public class Homework2 {
    public static void main(String[] args) {
        int studentScore =100;

        if (studentScore  >= 95) {
            System.out.println('A');
        } else if (studentScore  >= 80) {
            System.out.println('B');
        } else if (studentScore  >=70) {
            System.out.println('C');
        } else if (studentScore  >= 50) {
            System.out.println('D');
        } else if (studentScore <=49){
                System.out.println('F');
        }
    }

    }



