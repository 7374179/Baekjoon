package org.example;

import java.util.Scanner;

public class a063_1389 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N+1][N+1];

        for(int i=0;i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[a][b]=1;
            arr[b][a]=1;
        }

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(arr[i][j]!=1&&i!=j){
//                    arr[i][j]=Integer.MAX_VALUE;
                    arr[i][j]=10000;
                }
            }
        }

        int min = Integer.MAX_VALUE;
        int sum = 0;
        int tmp = 0;

        for(int k=1;k<=N;k++){
            for(int i=1;i<=N;i++){
                for(int j=1;j<=N;j++){
                    arr[i][j]=Math.min(arr[i][j], arr[i][k]+arr[k][j]);
                }
            }
        }

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                sum+=arr[i][j];
            }
            if(min>sum){
                min=sum;
                tmp=i;
            }
            sum=0;
        }
        System.out.println(tmp);
    }
}
