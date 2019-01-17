/**
 * Developer: Saejong Jang
 *
 * Used language : Java
 */

package com.example.lib;

import java.util.HashSet;

public class Main {

    public static void main(String[] args){

        /**
         * Write a function that will reverse the given input string
        */
        Test test = new Test();
        String inputWord = "Write a function that will reverse the given input string";
        System.out.println(test.reverseWord(inputWord));

        /**
         * Write a function that accepts three integers as input and returns as output the largest of the three
         */
        int[] arr = {1,3,2,7,5,4,3,2,7,6,5,-1,-5};
        int max = arr[0];
        max = test.findMax(arr);
        System.out.println(max);

        /**
         * Write a function that calculates the factorial of an input integer using recursion
         */
        int input = 4;
        int factorialNum = test.factorial(input);
        System.out.println(factorialNum);

        /**
         * Write a function that calculates the Nth entry of the fibonacci sequence (Do not include 0 in the sequence)
         */
        int index = 3;
        System.out.println(test.calcFibonacci(index));
    }
}

class Test{

    private int factorialNum = 1; //0! == 1

    public Test(){ }

    public String reverseWord(String inputWord){
        String reveredWord = "";
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0; i<inputWord.length(); ++i){
            stringBuilder.append(inputWord.charAt(inputWord.length()-1-i));
            if(i == inputWord.length()-1) reveredWord = stringBuilder.toString();
        }
        return reveredWord;
    }

    public int findMax(int[] inputArray){
        int max = inputArray[0];
        for(int i=0; i<inputArray.length; ++i){
            if(inputArray[i] > max) max = inputArray[i];
        }
        return max;

    }

    public int factorial(int input) {
        if(input <= 0) return 1;
        if(input != 1) return factorialNum = input*factorial(--input);
        else return factorialNum;
    }

    /**
     * I won't use recursion for this one, because the BigO of fibonacci recursion is 2^n.
     */
    public int calcFibonacci(int index) {
        if(index <= 0) return 0;
        else if(index <= 2) return 1;

        int[] fibbonaci = new int[index+1];
        fibbonaci[0] = 0;
        fibbonaci[1] = 1;
        fibbonaci[2] = 1;

        for(int i=2; i<=index; ++i){
            fibbonaci[i] = fibbonaci[i-1] + fibbonaci[i-2];
        }

        return fibbonaci[index];
    }
}
