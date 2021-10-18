package com.company;

public class Dar {

    public static void printArray(int[] arrayToPrint) {
        for (int i : arrayToPrint) {
            System.out.print(i + ", ");
        }
        System.out.println("");
    }

    public static int[] shiftRight(int[] arrayToShift) {
        // Diese Methode soll alle Elemente im Array nach rechts verschieben

        int temp;
        int end;
        end = arrayToShift.length;
        temp=arrayToShift[0];
        for (int i=0 ; i<end-1; i++){
            arrayToShift[i] = arrayToShift[i+1];
        }
        arrayToShift[end-1] = temp;
        return arrayToShift;
    }
}
