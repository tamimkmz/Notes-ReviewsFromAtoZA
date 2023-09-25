package PracticeArraysPattern;

public class PatternArray4 {
    public static void main(String[] args) {

            for (int row = 0; row <2*9; row++) {
                int totalColsInRow=row>9?2*9-row:row;

                for (int col = 0; col <totalColsInRow; col++) {

                    System.out.print("❤️");
                }
                System.out.println();
            }
        }
    }

