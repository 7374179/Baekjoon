package org.example;

import java.util.Scanner;

public class a062_11403 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr = new int[N+1][N+1];

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                int a = sc.nextInt();
                arr[i][j]=a;
            }
        }

        for(int k=1;k<=N;k++){
            for(int i=1;i<=N;i++){
                for(int j=1;j<=N;j++){
                    if(arr[i][k]==1 && arr[k][j]==1){
                        arr[i][j]=1;
                    }
                }
            }
        }

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
