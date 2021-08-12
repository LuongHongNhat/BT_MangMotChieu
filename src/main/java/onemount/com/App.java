package onemount.com;
import java.util.Scanner;

public class App
{
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%d, ", arr[i]);
        }
        System.out.println();
    }
    public static int[] generateArray(int n, int min, int max) {
        int[] ret = new int[n];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (int) Math.floor(Math.random()*(max - min))+ min;
        }
        return ret;
    }
    public static void main( String[] args ) {
        //khai bao mang tu dong
//        int[] inputArray = generateArray(10, 10, 20);
//        printArray(inputArray);

        //check data tĩnh
        int[] array2B = {2, 3, 5, 7, 11, 13, 17, 19};
        int[] array2C = {16, 40, 46, 200, 320, 500, 1};
        int[] array3A = {4, 8, 20, 40, 16, 0, 32, 1};
        int[] array3B = {16, 40, 46, 200, 320, 500, 1};

        // Test 2B
//        System.out.println("Number in your array are all prime : " + Bai2B_ThucHanh5.isAllPrimeNumbersInArray(array2B));
//        System.out.println("=============");

//        // Test 2C
//          System.out.println("Number in your array grow up is : " + Bai2C_ThucHanh5.isAscendingArray(array2C));
//          System.out.println("=============");

//        Test 3A
           System.out.println("Sum number by condition is : " + Bai3A_ThucHanh5.sumNumberByCondition(array3A));
           System.out.println("=============");
//
////        Test 3B
//           System.out.println("Sum prime number is : " + Bai3B_ThucHanh5.sumPrimeNumbersInArray(array3B));
//           System.out.println("=============");


    }



}
