package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a023_11724 {
  private static List<List<Integer>> list = new ArrayList<>();
  private static boolean[] visited;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    for(int i=0;i<=N;i++){
      list.add(new ArrayList<>());
    }

    for(int i=0;i<M;i++){
      int x = sc.nextInt();
      int y = sc.nextInt();
      addEdge(x, y);
    }

    visited = new boolean[N+1];

    int count = 0;
    for(int i=1;i<=N;i++){
      if(!visited[i]){
        dfs(i);
        count++;
      }
    }

    System.out.println(count);
  }

  private static void dfs(int i) {
    visited[i] = true;
    for(int u:list.get(i)){
      if(!visited[u]){
        dfs(u);
      }
    }
  }

  private static void addEdge(int x, int y) {
    list.get(x).add(y);
    list.get(y).add(x);
  }
}
