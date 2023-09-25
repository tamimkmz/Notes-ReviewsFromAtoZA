package Class11OfHW;

public class SyntaxTechnologies {

    private static String schoolName;
    private int batch;
    private int year;
    private String lastDayOfClass;

    public SyntaxTechnologies() {
        schoolName = null;
        batch = 0;
        year = 0;
        lastDayOfClass = null;
    }

    public SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass) {
        SyntaxTechnologies.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }

    public void displayInfo() {
        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
    }

    public static class main {
        public static void main(String[] args) {

            SyntaxTechnologies obj1 = new SyntaxTechnologies();
            SyntaxTechnologies obj2 = new SyntaxTechnologies("Syntax", 6, 2020, "07/30/2020");

            obj1.displayInfo();
            obj2.displayInfo();
        }
    }

}
