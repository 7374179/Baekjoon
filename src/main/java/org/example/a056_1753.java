package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a056_1753 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }

        int[] arr = new int[V+1];
        int[] arrT = new int[V+1];

        int K = sc.nextInt();
        for(int i=1;i<=V;i++){
           if(i==K){
               arr[i]=0;
           }else{
               arr[i]=Integer.MAX_VALUE;
           }
        }
        for(int i=0;i<E;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            list.get(a).add(b);
            list.get(a).add(c);

        }





    }
}
