package com.company;

public class AGArray {
    public static void printArray(int[] array) {
        StringBuilder sb = new StringBuilder(array.length * 8);
        sb.append("{ ");
        for (int i : array) {
            sb.append(i).append(", ");
        }
        sb.deleteCharAt(sb.length() - 2); // letztes Komma löschen
        sb.append("}\r\n");
        System.out.println(sb.toString());
    }

    // Code zur Inspiration
    public static int[] doubleTheArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * 2;
        }
        return result;
    }

    public static int[] addArrays(int[] first, int[] second) {
        int[] result = new int[first.length];

        // AUFGABENSTELLUNG 1:
        // Hier schreibt ihr bitte Code hin, der die first und second Arrays Stelle für Stelle addiert und in result schreibt
        // z.B. aus {3, 4, 5} plus {7, 8, 9} wird {10, 12, 14}
        for (int i=0 ; i<first.length; i++) {

            result[i] = first[i] + second[i];
        }
        //done
        return result;
    }


    public static int[] keepBigger(int[] first, int[] second) {
        int[] result = new int[first.length];

        // AUFGABENSTELLUNG 2:
        // Hier schreibt ihr bitte Code hin, der die first und second Arrays Stelle für Stelle vergleicht und die größere Zahl in result schreibt
        // z.B. aus {13, 4, 11} und {7, 8, 9} wird {13, 8, 11}
        for (int i=0 ; i<first.length; i++){
            if(first[i]>= second[i]){
                result[i]=first[i];
            }
            else {
                result[i]=second[i];
            }
        }

        return result;
    }
}
