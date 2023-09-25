package HW25and26;

import java.util.ArrayList;
import java.util.List;

public class IntegerCollection {
    public static void main(String[] args) {

                List<Integer> integerList = new ArrayList<>();

                integerList.add(5);
                integerList.add(8);
                integerList.add(5);
                integerList.add(12);
                integerList.add(3);

                int sum = sumIntegers(integerList);

                System.out.println("Sum of integers: " + sum);
            }
            public static int sumIntegers(List<Integer> integerList) {
                int sum = 0;

                for (Integer num : integerList) {
                    sum += num;
                }

                return sum;
            }
        }

