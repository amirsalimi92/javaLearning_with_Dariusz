package com.company;

public class Two {
    public static void problem(){
        int num[] = {1,2,3,4,5};
        int total = 0;
        int totall = 0;
        for (int i : num){
            total += num[i]; //if I write num[i], it doesn't working!
        }
        System.out.println(total);
        for (int j = 0; j< num.length; j++){
            totall += num[j];
        }
        System.out.println(totall);
    }
}
