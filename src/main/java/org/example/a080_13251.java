package org.example;

import java.util.Scanner;

public class a080_13251 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int K = sc.nextInt();
        int sum = a+b+c;

        int at=1;
        int bt=1;
        int ct=1;
        int sumt=1;

        for(int i=0;i<K;i++){
            at = at*(a-i);
            bt = bt*(b-i);
            ct = ct*(c-i);
            sumt=sumt*(sum-i);
        }
        double result = (at+bt+ct)/(double)sumt;

        System.out.println(result);

    }
}
