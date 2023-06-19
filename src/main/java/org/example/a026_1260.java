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

    }
  }

}
