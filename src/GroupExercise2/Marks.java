package GroupExercise2;
/*We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code*/
abstract class Marks {
    abstract double getPercentage();}
    class StudentA extends Marks{
        private double subject1, subject2, subject3;
       public StudentA(double subject1, double subject2, double subject3){
            this.subject1=subject1;
            this.subject2=subject2;
            this.subject3=subject3;

        }
        @Override
        double getPercentage() {
            return (subject1+subject2+subject3)/3.0;
        }
    }
        class StudentB extends Marks {
            private double subject1, subject2, subject3, subject4;

            public StudentB(double subject1, double subject2, double subject3, double subject4) {
                this.subject1 = subject1;
                this.subject2 = subject2;
                this.subject3 = subject3;
                this.subject4 = subject4;
            }
            @Override
            double getPercentage() {
                return (subject1 + subject2 + subject3 + subject4) / 4.0;
            }

                public static void main(String[] args) {

                    StudentA studentA = new StudentA(90, 95, 98);
                    StudentB studentB = new StudentB(70, 75, 90, 95);
                    System.out.println("Ave percentage of Student A: " + studentA.getPercentage() + "%");

                    System.out.println("Ave percentage of Student B: " + studentB.getPercentage() + "%");
                }

            }


