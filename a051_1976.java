package org.example;

import java.util.Scanner;

public class a051_1976 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[][] arr = new int[N+1][N+1];

    for(int i=1;i<=M;i++){
      for(int j=1;j<=M;j++){
        arr[i][j]=sc.nextInt();
      }
    }

  }
}
