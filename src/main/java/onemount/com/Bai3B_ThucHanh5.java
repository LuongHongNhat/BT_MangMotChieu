package onemount.com;

public class Bai3B_ThucHanh5 {
    public static int sumPrimeNumbersInArray(int[] ret){
        int sum = 0;
        for (int n : ret) {
            if(isPrimeNumber(n) == true) {
                sum += n;
            }
        }
       return sum;
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
