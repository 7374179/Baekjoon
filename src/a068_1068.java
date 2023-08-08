package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class a068_1068 {
    static int N;
    static boolean[] visited;
    static int answer[];
    static ArrayList<Integer>[] list;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        visited = new boolean[N];
        list = new ArrayList[N];
        answer = new int[N];

        for(int i=0;i<list.length;i++){
            list[i]=new ArrayList<>();
        }

        for(int i=0;i<N;i++){
            answer[i]=sc.nextInt();
        }

        int del = sc.nextInt();

        for(int i=del;i<N;i++){
            answer[i]=-1;
        }
        for(int i=0;i<del;i++){
            if(answer[i]==-1){
                continue;
            }else{
                answer[answer[i]]=-1;
            }
        }
        int count = 0;
        for(int i=0;i<N;i++){
            if(answer[i]!=-1){
                count++;
            }
        }
        System.out.println(count);
    }
}
