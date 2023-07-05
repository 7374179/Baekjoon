package org.example;

import java.util.Scanner;

public class a077_11051 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] arr = new int[N+1][N+1];

        for(int i=0;i<=N;i++){
            arr[i][0]=1;
            arr[i][i]=1;
            arr[i][1]=i;
        }
        for(int i=2;i<=N;i++){
            for(int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                arr[i][j] = arr[i][j]%10007;
             }
        }
        System.out.println(arr[N][K]);
//        System.out.println(arr[N][K]%10007);
    }
}
