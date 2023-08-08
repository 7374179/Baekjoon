package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class a069_14425 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            set.add(str);
        }

        int count=0;

        for(int i=0;i<M;i++){
            String str = sc.next();
            if(set.contains(str)){
                count++;
            }
        }
        System.out.println(count);
    }
}
