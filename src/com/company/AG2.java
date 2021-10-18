package com.company;

public class AG2 {
    public static void printArray(int[] array) {
        StringBuilder sb = new StringBuilder(array.length * 8);
        sb.append("{ ");
        for (int i : array) {
            sb.append(i).append(", ");
        }
        sb.deleteCharAt(sb.length() - 2); // letztes Komma löschen
        sb.append("}\r\n");
        System.out.println(sb.toString());

        //my code:
        System.out.print("{"+array[0]);
        for (int i=1 ; i<array.length ; i++){
            System.out.print(","+array[i]);
        }
        System.out.print("}");
    }


    public static void doThings(int[] array) {

        for (int i=2 ; i<array.length; i++){
            array[i]=array[i-1]+array[i-2];
        }

    }
}
