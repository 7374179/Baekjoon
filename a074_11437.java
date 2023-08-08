package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class a074_11437 {
    static ArrayList<Integer>[] tree;
    public static int parent[];
    public static int depth[];
    public static boolean visited[];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        parent = new int[N+1];
        depth = new int[N+1];
        visited = new boolean[N+1];

        for(int i=0;i<N-1;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b){
                parent[b]=a;
            }else{
                parent[a]=b;
            }
        }
        int M = sc.nextInt();
    }
    private static void BFS(int node){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(node);
        visited[node] = true;
        int level = 1;
        int now_size = 1;
        int count = 0;
        while(!queue.isEmpty()){
            int now_node = queue.poll();
            for(int next:tree[now_node]){
                if(!visited[next]){
                    visited[next] = true;
                    queue.add(next);
                    parent[next]=now_node;
                    depth[next]=level;
                }
            }
            count++;
            if(count==now_size){
                count=0;
                now_size=queue.size();
                level++;
            }
        }
    }
}
