package com.company;

public class AG3 {

    public static int[] fill2DArray(int[][] array) {
        // AUFGABENSTELLUNG 1:
        // Fülle das zweidimensionale Array mit aufsteigenden Ganzzahlen, d.h. in diesem Fall mit den Zahlen 0 bis 99
        int t=0;
        //int[] zeile = new int[100];
        for (int i=0 ; i< array.length; i++){
            for (int j=0 ; j<array[i].length; j++){
                array[i][j]=t;
                t++;
            }
        }
        // zur Inspiration:

        // ???
        int x=0;
        int[] zeile= new int[100];
        //for (int[] zeile : array) {
        //for (int[] i : array){
        for (int i=0 ; i<array.length ; i++){
            for (int spalte = 0; spalte < array[i].length; spalte++) {
                // ???
                zeile[x]=array[i][spalte];
                x++;
            }
        }
        return zeile;
    }

    public static void print2DArray(int[][] array) {
        // AUFGABENSTELLUNG 2:
        // Gib den Inhalt des zweidimensionalen Arrays auf der Konsole aus. Du kannst printArray dafür verwenden.
        for (int i=0 ; i<array.length; i++){
            for (int j=0 ; j<array[i].length; j++){
                System.out.print(array[i][j]+",");
            }
            System.out.println("");
        }
    }
    public static void printArray(int[] zeile) {
        StringBuilder sb = new StringBuilder(zeile.length * 8);
        sb.append("{ ");
        for (int i : zeile) {
            sb.append(i).append(", ");
        }
        sb.deleteCharAt(sb.length() - 2); // letztes Komma löschen
        sb.append("}\r\n");
        System.out.println(sb.toString());
    }
}
