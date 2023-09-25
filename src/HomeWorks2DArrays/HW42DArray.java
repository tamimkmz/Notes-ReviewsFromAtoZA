package HomeWorks2DArrays;

public class HW42DArray {

    public static void main(String[] args) {
        String[][] countries = {
                {"Canada", "mexico","Cuba","Costa Rica"},// North America
                {"Panama", "Argentina", "Uruguay", "brazil"},// South America
                {"Spain",  "greece","Sweden", "Austria"},//Europe Countries
                {"France",  "Morocco",  "Sudan",  "Egypt"},// African Countries
                };
        for (String[] row : countries) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();}
        System.out.println("😁😁😁😁😁😁😁😁😁😁😁😁😁😁😁😁😁😁😁");
        int sum=0;
        for(int i=0; i<countries.length; i++){
            for(int j=0; j<countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
            }
            System.out.println();
            sum = sum + countries[i].length;
            }
        System.out.println();
        System.out.print("total number of countries is ");
        System.out.print(sum);
    }
}