package org.example;

import java.util.Scanner;

public class a076_11050 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] arr = new int[N+1][N+1];

        for(int i=0;i<=N;i++){
            for(int j=0;j<=i;j++){
                if(i==j){
                    arr[i][j]=1;
                }else if(j==0){
                    arr[i][0]=1;
                }else if(j==1){
                    arr[i][1]=i;
                }else{
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                }
            }
        }
        System.out.println(arr[N][K]);
    }
}
