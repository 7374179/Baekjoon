package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a026_1260 {
  private static List<List<Integer>> listDFS = new ArrayList<>();
  private static List<List<Integer>> listBFS = new ArrayList<>();
  private static boolean[] visitedDFS;
  private static boolean[] visitedBFS;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int V = sc.nextInt();

    for(int i=0;i<N;i++){
      listDFS.add(new ArrayList<>());
      listBFS.add(new ArrayList<>());
    }

    for(int i=0;i<M;i++){
      int x = sc.nextInt();
      int y = sc.nextInt();
      graphDFS(x, y);
      graphBFS(x, y);
    }

    int[] listDFS = new int[N];
    int[] listBFS = new int[N];

    visitedDFS = new boolean[N+1];
    visitedBFS = new boolean[N+1];

    for(int i=1;i<=N;i++){
      if(!visitedDFS[i]){
        dfs(i);
        listDFS[i]=i;
      }
    }
    for(int i=1;i<=N;i++){
      if(!visitedBFS[i]){
        bfs(i);
        listBFS[i]=i;
      }
    }
  }

  private static void graphDFS(int x, int y) {
    listDFS.get(x).add(y);
    listDFS.get(y).add(x);
  }

  private static void graphBFS(int x, int y) {
    listBFS.get(x).add(y);
    listBFS.get(y).add(x);
  }

  private static void dfs(int i) {
    visitedDFS[i]=true;
    for(int u:listDFS.get(i)){
      if(!visitedDFS[i]){
        dfs(u);
      }
    }
  }

  private static void bfs(int i) {
    visitedBFS[i]=true;
    for(int u:listBFS.get(i)){
      if(!visitedBFS[i]){
        bfs(u);
      }
    }
  }

}
