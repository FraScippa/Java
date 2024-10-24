package arrays;

import java.util.Arrays;

public class EserciziArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        rotateArrays(a);
    }
    public static void rotateArrays(int[] input){
        int[] reversed = new int[input.length];
        for (int i = 0; i<input.length; i++){
            reversed[i] = input[input.length-1 - i];
        }
        System.out.println(Arrays.toString(reversed));
    }
    public static void slicing(){

    }
    public static void secondLargest(){

    }
    public static void mergeSortedArrays(){

    }
    public static void areAnagrams(){

    }
    public static void arrayOfProducts(){

    }
    public static void transposeMatrix(int[][] matrice){

    }
}
