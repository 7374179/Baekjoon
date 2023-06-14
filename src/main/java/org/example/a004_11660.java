package org.example;

import java.util.Scanner;

public class a004_11660 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] arr = new int[N][N];
    int[][] sum = new int[N][N];

    for(int i=0;i<N;i++){
      for(int j=0;j<N;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<N;i++){
      for(int j=0;j<N;j++){
        if(j==0){
          sum[i][j]=arr[i][j];
        }else{
          sum[i][j]=sum[i][j-1]+arr[i][j];
        }
      }
    }
    int x1, x2, y1, y2;
    for(int i=0;i<N;i++){
      for(int j=0;j<N;j++){

      }
    }
  }
}
