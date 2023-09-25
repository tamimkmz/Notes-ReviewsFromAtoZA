package HomeWorks2DArrays;

public class HW12DArray {
    public static void main(String[] args) {

        String [][] groceries={
                {"tomato","mint","onion","broccoli"},
                {"apple","banana","mango","watermelon"},
                {"jalebe","cake","sheer-pira","candy"},
                {"milk","yugurt","cheese","butter"},
        };
        for(String[]row:groceries){
            for(String col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println("❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️");
        for(int i=0; i<groceries.length;i++){
            for(int j=0; j<groceries[i].length;j++){
                System.out.print(groceries[i][j]+" ");
            }
            System.out.println();
        }
    }
}
