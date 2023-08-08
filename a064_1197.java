package org.example;

import java.util.PriorityQueue;
import java.util.Scanner;

public class a064_1197 {
    static int[] parent;
    static PriorityQueue<pEdge> que;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        que = new PriorityQueue<>();
        parent = new int[V+1];
        for(int i=0;i<V;i++){
            parent[i]=i;
        }
        for(int i=0;i<E;i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            int v = sc.nextInt();
            que.add(new pEdge(s, e, v));
        }
        int useEdge = 0;
        int result = 0;
        while(useEdge < V-1){
            pEdge now = que.poll();
            if(find(now.s) != find(now.e)){
                union(now.s, now.e);
                result = result + now.v;
                useEdge++;
            }
        }
        System.out.println(result);
    }

    public static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a!=b){
            parent[b]=a;
        }
    }

    public static int find(int a){
        if(a==parent[a])
            return a;
        else return parent[a]=find(parent[a]);
    }
}

class pEdge implements Comparable<pEdge>{
    int s;
    int e;
    int v;
    pEdge(int s, int e, int v){
        this.s = s;
        this.e = e;
        this.v = v;
    }
    @Override
    public int compareTo(pEdge o){
        return this.v-o.v;
    }
}
