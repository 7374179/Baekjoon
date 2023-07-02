package org.example;

import java.util.Scanner;

public class a071_2042 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N+1];

        for(int i=1;i<=N;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<M+K;i++){
            int a = sc.nextInt();
            if(a==1){
                int b = sc.nextInt();
                int c = sc.nextInt();
                arr[b]=c;
            }else{
                int b = sc.nextInt();
                int c = sc.nextInt();
                int sum = 0;
                for(int j=b;j<=c;j++){
                    sum+=arr[j];
                }
                System.out.println(sum);
            }
        }
    }
}
