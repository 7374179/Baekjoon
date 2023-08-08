package org.example;

import java.util.Scanner;

public class a084_1463 {
    int min = Integer.MAX_VALUE;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int aa = cal(N);

        System.out.println(aa);
    }

    private static int cal(int N){
        int a = three(N);
        int b = two(N);
        int c = one(N);

        return a+b+c;
    }
    private static int three(int N){
        int count = 0;
        if(N%3==0){
            N=N/3;
            count++;
        }
        return count;
    }
    private static int two(int N){
        int count = 0;
        if(N%2==0){
            N=N/2;
            count++;
        }
        return count;
    }
    private static int one(int N){
        int count = 0;
        N=N-1;
        count++;
        return count;
    }

}
