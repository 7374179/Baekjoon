package org.example;

import java.util.Scanner;

public class a059_11657 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N+1];

        for(int i=1;i<=N;i++){
            arr[i]=Integer.MAX_VALUE;
        }
        arr[1]=0;

        for(int i=1;i<=M;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if(arr[A]!=Integer.MAX_VALUE && arr[B]>arr[A]+C){
                arr[B]=arr[A]+C;
            }
        }

        boolean flag = true;

        for(int j=2;j<=N;j++){
            if(arr[j]==0 || arr[j]<0){
                flag=false;
            }
        }

        for(int i=2;i<=N;i++){
            if(flag){
                if(arr[i]==Integer.MAX_VALUE){
                    System.out.println(-1);
                }else{
                    System.out.println(arr[i]);
                }
            }else{
                System.out.println(-1);
                break;
            }
        }
    }
}
