package onemount.com;

public class Bai2B_ThucHanh5 {

    public static boolean isAllPrimeNumbersInArray(int[] ret){
        for (int n : ret) {
            if(!isPrimeNumber(n)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int testTime = (int) Math.sqrt(n);
        for (int i = 2; i <= testTime; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
