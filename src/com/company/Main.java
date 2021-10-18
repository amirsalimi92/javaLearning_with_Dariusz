package com.company;

import com.company.Two;
import com.sun.source.tree.NewClassTree;

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        //AG3
        AG3 object = new AG3();
        int[][] aArray = new int[10][10];
        int[] a = new int[10];

        object.fill2DArray(aArray);
        object.print2DArray(aArray);
        object.printArray(a);

        /*
        //AG2
        Scanner input = new Scanner(System.in);
        int in;
        System.out.print("Enter the number of Fibonacci number: ");
        in = input.nextInt();
        AG2 obj = new AG2();
        int arrayLength = in;
        int[] aArray = new int[arrayLength];
        //how can I remove my console screen? like clear() code in python!
        for (int i = 0; i < arrayLength; i++) {
            aArray[i] = 1;

        }
        System.out.println("aArray vorher:");
        obj.printArray(aArray);
        System.out.println();

        obj.doThings(aArray);
        System.out.println("aArray nachher:");
        obj.printArray(aArray);
        System.out.println();


         */
        /*
        //AGArray Class

        AGArray obj = new AGArray();

        int arrayLength = 20;
        int[] aArray = new int[arrayLength];
        int[] bArray = new int[arrayLength];
        int[] cArray;

        for (int i = 0; i < arrayLength; i++) {
            aArray[i] = i;
            bArray[i] = arrayLength - i - 1;
        }
        System.out.println("aArray:");
        obj.printArray(aArray);
        System.out.println();
        System.out.println("bArray:");
        obj.printArray(bArray);

        cArray = obj.doubleTheArray(aArray);
        System.out.println();
        System.out.println("cArray as doubleTheArray(aArray)");
        obj.printArray(cArray);

        cArray = obj.addArrays(aArray, bArray);
        System.out.println();
        System.out.println("cArray as addArrays(aArray, bArray)");
        obj.printArray(cArray);

        cArray = obj.keepBigger(aArray, bArray);
        System.out.println();
        System.out.println("cArray as keepBigger(aArray, bArray)");
        obj.printArray(cArray);

         */

        /*
        //Dar Class
        Dar obj = new Dar();
        int[] a = new int[7];
        // int a[] = ... bitte nicht machen
        obj.printArray(a);

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        obj.printArray(a);


       do {
            a = obj.shiftRight(a);
           obj.printArray(a);
        } while (a[0] != 0); */





        /*
        //Time Class
        Scanner object = new Scanner(System.in);
        String x ;
        x = object.nextLine();
        System.out.println(x);*/
        /*Time object = new Time();9
        System.out.println(object.toMilitary());
        object.setTime(16,54,6);
        System.out.println(object.toMilitary());
        System.out.println(object.toString());*/


       /*
       //Two Class
       Two time = new Two();   //problem with for loop, ask later from Dariusz
       time.problem();*/
        
    }
}
