package onemount.com;

public class Bai3A_ThucHanh5 {

    public static int sumNumberByCondition(int[] inputArray){
        int sum = 0;
        for (int n : inputArray) {
            if(n % 4 == 0 && n % 5 != 0 ) {
                sum += n;
            }
        }
        return sum;
    }
}
