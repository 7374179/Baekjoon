package org.example;

import java.util.Scanner;

public class a079_1010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[30][30];

        for(int i=0;i<30;i++){
            arr[i][0]=1;
            arr[i][i]=1;
            arr[i][1]=i;
        }

        for(int i=2;i<30;i++){
            for(int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }

        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int N = sc.nextInt();
            int M = sc.nextInt();

            System.out.println(arr[M][N]);
        }
    }
}
