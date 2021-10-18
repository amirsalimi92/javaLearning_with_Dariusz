package com.company;

public class AG3 {
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


    public static void fill2DArray(int[][] array) {
        // AUFGABENSTELLUNG 1:
        // Fülle das zweidimensionale Array mit aufsteigenden Ganzzahlen, d.h. in diesem Fall mit den Zahlen 0 bis 99
        int t=0;
        //int[] zeile = new int[100];
        for (int i=0 ; i< array.length; i++){
            for (int j=0 ; j<array[i].length; j++){
                array[i][j]=t;
                t++;
                //zeile[t]=array[i][j];
            }
        }
        // zur Inspiration:

        // ???
        for (int[] zeile : array) {
            for (int spalte = 0; spalte < zeile.length; spalte++) {
                // ???
                zeile[spalte]=array[spalte][spalte];
            }
        }
    }

    public static void print2DArray(int[][] array) {
        // AUFGABENSTELLUNG 2:
        // Gib den Inhalt des zweidimensionalen Arrays auf der Konsole aus. Du kannst printArray dafür verwenden.
        for (int i=0 ; i<array.length; i++){
            for (int j=0 ; j<array[i].length; j++){
                System.out.print(array[i][j]+",");
            }
            System.out.println(" ");
        }
    }
}
