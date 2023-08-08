package org.example;

import java.util.Scanner;

public class a061_11404 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[][] arr = new int[n+1][n+1];

    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if(i==j){
          arr[i][j]=0;
        }else{
//          arr[i][j]=Integer.MAX_VALUE;
          arr[i][j]=1000000;
        }
      }
    }
    for(int i=0;i<m;i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      if(arr[a][b]>c){
        arr[a][b] = c;
      }
    }

    for(int k=1;k<=n;k++){
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
          arr[i][j]=Math.min(arr[i][j], arr[i][k]+arr[k][j]);
        }
      }
    }

    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if(arr[i][j]==1000000){
          System.out.print("-1 ");
        }else{
          System.out.print(arr[i][j]+" ");
        }
      }
      System.out.println();
    }
  }
}
