package org.example;

import java.util.Scanner;

public class a085_14501 {
    static int N;
    static int D[][];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        D = new int[N+1][N+1];

        for(int i=1;i<=N;i++){
            int t = sc.nextInt();
            int p = sc.nextInt();
            D[0][i]=t;
            D[1][i]=p;
        }
    }
}
