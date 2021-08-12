package onemount.com;

public class Bai2C_ThucHanh5 {
    public static boolean isAscendingArray(int[] inputArray) {
        int temp;
        for (int i = 0; i < (inputArray.length - 1); i++) {
            for (int j = 0; j < (inputArray.length  - i - 1); j++) {
                if (inputArray[j] > inputArray[j +1]) {
                    return false;
                }
            }
        }
        return true;
    }

}
