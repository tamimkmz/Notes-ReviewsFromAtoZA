package Replit1;

class Student {

    int year;
    String schoolName;
    String batchNum;

    public Student( int year, String schoolName, String batchNum) {
        this.year = year;
        this.schoolName = schoolName;
        this.batchNum = batchNum;

    }
    public void printInfo(){
        System.out.println("I am a student of batch " +batchNum+ " studying at " +schoolName+ "in the year of " +year);
    }

    public static void main(String[] args) {

        Student st=new Student(2021,"Syntax","9");
        st.printInfo();
    }

}