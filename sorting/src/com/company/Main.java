package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        /*findLargestSmallestNumber();
        sortNumbersWithArraySort();
        sortNumbersWithCollectionSort();*/
        //System.out.println("Fibonacci: "+fib(75));
        nextGreatestElement();

    }


    /**
     *
     */

    public static void nextGreatest(int arr[]){

        int maxFromRight = arr.length-1;

        arr[arr.length-1]=-1;
        // Replace all other elements with the next greatest
        for(int i=arr.length-2; i>=0;i--){
            int temp = arr[i];
            arr[i]= maxFromRight;
            if(maxFromRight<temp){
                maxFromRight=temp;
            }
        }
    }

    static void printArray(int arr[])
    {
        for (int i=0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }

    public static void nextGreatestElement(){
        int arr[] = {16, 17, 4, 3, 5, 2};
        nextGreatest (arr);
        System.out.println("The modified array:");
        printArray (arr);
    }
    /**
     * Fibonacci - question: why do I get negative numbers for certain inputs like 75
     */

    public static int fib(int n){
        int a = 0;
        int b = 1;

        for(int i =2; i<=n; i++){
            int temp = a;
            a = a+b;
            b = temp;
        }

        return a;
    }

    public static void sortNumbersWithCollectionSort() {
        Integer[] numbers = {32, 43, 53, 54, 32, 65, 63, 9, 43, 23, 77, 98};
        Arrays.sort(numbers);
        System.out.println("Largest Number  via sortNumbersWithCollectionSort  : " + numbers[0]);
        System.out.println("Smallest Number via sortNumbersWithCollectionSort: " + numbers[numbers.length - 1]);
        System.out.println("Ordered array via sortNumbersWithCollectionSort is : " + Arrays.toString(numbers));
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Ordered array descending via sortNumbersWithCollectionSort is : " + Arrays.toString(numbers));
    }

    public static void sortNumbersWithArraySort() {
        int numbers[] = new int[]{32, 43, 53, 54, 32, 65, 63, 9, 43, 23, 77, 98};
        Arrays.sort(numbers);
        System.out.println("Largest Number is via sortNumbersWithArraySort  : " + numbers[0]);
        System.out.println("Smallest Number is sortNumbersWithArraySort: " + numbers[numbers.length - 1]);
        System.out.println("Ordered array is : " + Arrays.toString(numbers));


    }

    public static void findLargestSmallestNumber() {
        //array of 10 numbers
        int numbers[] = new int[]{32, 43, 53, 54, 3, 65, 63, 9, 43, 23, 144};

        //assign first element of an array to largest and smallest
        int smallest = numbers[0];
        int largetst = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largetst)
                largetst = numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];

        }

        System.out.println("Largest Number is : " + largetst);
        System.out.println("Smallest Number is : " + smallest);
    }


}


