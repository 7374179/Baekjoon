package org.example;

import java.util.Scanner;

public class a087_11726 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[1001];
        arr[1] = 1;
        arr[2] = 2;
        for(int i=3;i<=N;i++){
            arr[i]=(arr[i-1]+arr[i-2])%10007;
        }
        System.out.println(arr[N]);
    }
}
