package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        findLargestSmallestNumber();
        sortNumbersWithArraySort();
        sortNumbersWithCollectionSort();
        System.out.println("Fibonacci: "+fib(75));
        nextGreatestElement();
        printUniqueCharactersResult();
        System.out.println("Max occurring character is " +
                charactersOccurance("amaliiiaaaaaa"));
        findAverageWordLength("aaa aaa cc24");

    }

    /**
     * 6. Paftenie primeste un text si trebuie sa calculeze lungimea medie a cuvintelor textului,
     * un cuvant fiind definit ca o secventa continua maximala de caractere ale alfabetului englez
     * ('a' .. 'z' , 'A' .. 'Z'). Definim lungimea medie = (lungimea totala a cuvintelor textului) / (numarul de cuvinte ale textului).
     * Scrieti un program care ii rezolva problema lui Paftenie.
     */

    public static void findAverageWordLength(String text){
        String[] strArray = text.split(" ");
        double totalChars = 0;

        for(String s: strArray){
            totalChars=totalChars+s.length();
        }
        double averageLength = totalChars/strArray.length;
        System.out.println("average length is " + averageLength);
    }

    /**
     * 4. care litera apare de cele mai multe ori intr-un string
     */
    public static String charactersOccurance(String text){
        int count[] = new int[256];
        for(int i=0;i<text.length();i++)
            count[text.charAt(i)]++;
    int max = 0;
    String result = "";
        for(int i=0;i<text.length();i++){
            if (max<count[text.charAt(i)]){
                max=count[text.charAt(i)];
                result=text.charAt(i)+" = "+max;
            }
        }
        return result;
    }


    /**
     * Implementati un algoritm care sa determine daca un string are toate caracterele unice.
     */
    //1. compare each char with the other
    public static boolean uniqueCharacters(String text){
        for(int i=0;i<text.length();i++)
            for (int j = i+1; j<text.length();j++)
                if (text.charAt(i)==text.charAt(j))
                    return false;
                    return true;
    }
    public static void printUniqueCharactersResult(){
        String firstText = "asdfghjkl";
        String secondText = "amalia";
        System.out.println("String "+ firstText+ " evaluated by uniqueCharacters is "+uniqueCharacters(firstText));
        System.out.println("String "+ secondText+ " evaluated by uniqueCharacters is "+uniqueCharacters(secondText));

        System.out.println("String "+ firstText+ " evaluated by uniqueCharactersBySorting is "+uniqueCharactersBySorting(firstText));
        System.out.println("String "+ secondText+ " evaluated by uniqueCharactersBySorting is "+uniqueCharactersBySorting(secondText));
    }

    //2 Sorting
    public static boolean uniqueCharactersBySorting(String text){
        char [] chArray = text.toCharArray();
        Arrays.sort(chArray);
        for (int i=0; i<chArray.length-1;i++){
            if(chArray[i]!= chArray[i+1])
                continue;
            else
                return false;
        }
        return  true;
    }


    /**
     * Given an array of integers, replace every element with the next greatest element
     * (greatest element on the right side) in the array. Since there is no element next to
     * the last element, replace it with -1. For example, if the array is {16, 17, 4, 3, 5, 2},
     * then it should be modified to {17, 5, 5, 5, 2, -1}.
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
        System.out.print("The modified array: ");
        printArray(arr);
        System.out.println();
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


