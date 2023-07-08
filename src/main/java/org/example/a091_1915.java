package org.example;

import java.util.Scanner;

public class a091_1915 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                String str = sc.next();
                arr[i][j]=str.charAt(i)-'0';
            }
        }

        int count = 0;
        int max = Integer.MIN_VALUE;

        int i=0;
        int j=0;

    }
}
