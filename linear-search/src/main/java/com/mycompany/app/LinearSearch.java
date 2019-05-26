package com.mycompany.app;

public class LinearSearch 
{
    // public static Integer search(int[] arr, int target) {
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == target) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    public static Integer search(int[] arr, int target) {

        int index = 0;
        for (int num : arr) {
            if (num == target) {
                return index;
            }
            index++;
        }
        return -1;
    }    

    public static void main( String[] args )
    {

    }
}
