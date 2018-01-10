package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        findLargestSmallestNumber();
        sortNumbersWithArraySort();
        sortNumbersWithCollectionSort();
        }

         public static void sortNumbersWithCollectionSort(){
         Integer[] numbers = {32,43,53,54,32,65,63,9,43,23,77,98};
        Arrays.sort(numbers);
        System.out.println("Largest Number  via sortNumbersWithCollectionSort  : " + numbers[0]);
        System.out.println("Smallest Number via sortNumbersWithCollectionSort: " + numbers[numbers.length-1]);
        System.out.println("Ordered array via sortNumbersWithCollectionSort is : " + Arrays.toString(numbers));
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Ordered array descending via sortNumbersWithCollectionSort is : " + Arrays.toString(numbers));
    }

        public static void sortNumbersWithArraySort(){
            int numbers[] = new int[]{32,43,53,54,32,65,63,9,43,23,77,98};
            Arrays.sort(numbers);
            System.out.println("Largest Number is via sortNumbersWithArraySort  : " + numbers[0]);
            System.out.println("Smallest Number is sortNumbersWithArraySort: " + numbers[numbers.length-1]);
            System.out.println("Ordered array is : " + Arrays.toString(numbers));


        }

        public static void findLargestSmallestNumber(){
            //array of 10 numbers
            int numbers[] = new int[]{32,43,53,54,3,65,63,9,43,23,144};

            //assign first element of an array to largest and smallest
            int smallest = numbers[0];
            int largetst = numbers[0];

            for(int i=1; i< numbers.length; i++)
            {
                if(numbers[i] > largetst)
                    largetst = numbers[i];
                else if (numbers[i] < smallest)
                    smallest = numbers[i];

            }

            System.out.println("Largest Number is : " + largetst);
            System.out.println("Smallest Number is : " + smallest);
        }
}


