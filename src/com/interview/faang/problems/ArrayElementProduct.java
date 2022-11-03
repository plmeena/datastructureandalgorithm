package com.interview.faang.problems;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementProduct {

    public static void main(String[] args) {
        System.out.println("Enter Array followed by index to exclude");
        Scanner scanner=new Scanner(System.in);

        String[] data=scanner.nextLine().split(" ");
        int[] numbers= new int[data.length-1];
        for (int i = 0; i < data.length-1 ; i++) {
            numbers[i]=Integer.parseInt(data[i]);
        }
        int indexToExclude=Integer.parseInt(data[data.length-1]);
       int product= productOfElements(numbers,indexToExclude);
        System.out.println("product = " + product);
    }

    public static int productOfElements(int[] a, int excludeIndex){
        int product=1;

        for (int i = 0; i < a.length; i++) {
            if(i!=excludeIndex)
                product=product*a[i];
        }

        return product;
    }

    public static int productOfElementsDandC(int[] a, int excludeIndex){
        int middle=a.length/2;
        int product=1;

        int left=multiplyElements(a,excludeIndex,product);
        int right=multiplyElements(a,excludeIndex,product);;

        int finalProduct=left*right;

        for (int i = 0; i < a.length; i++) {
            if(i!=excludeIndex)
                product=product*a[i];
        }

        return product;
    }

    static int multiplyElements(int[] a, int excludeIndex, int product){

        return product;
    }
}
