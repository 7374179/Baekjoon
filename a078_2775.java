package org.example;

import java.util.Scanner;

public class a078_2775 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        int[][] arr = new int[Q+1][15];

        for(int i=0;i<=Q;i++){
            for(int j=1;j<=14;j++){
                arr[i][1]=1;
                arr[0][j]=j;
            }
        }

        for(int i=1;i<=Q;i++){
            for(int j=2;j<=14;j++){
                arr[i][j]=arr[i][j-1]+arr[i-1][j];
            }
        }
        for(int i=0;i<Q;i++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(arr[k][n]);
        }

    }
}
