package org.example;

import java.util.Scanner;

public class a094_11049 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[501][501];
        int min = Integer.MAX_VALUE;

        for(int i=0;i<N;i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            arr[r][c]=r*c;
        }




    }
}
