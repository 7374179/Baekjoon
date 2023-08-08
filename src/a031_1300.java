package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class a031_1300 {
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int k = sc.nextInt();
//  int[][] A = new int[N+1][N+1];
  int[] B = new int[N*N+1];

//  for(int i=1;i<N;i++){
//    for(int j=1;j<N;j++){
//      A[i][j]=i*j;
//    }
//  }

  int i=1;
  int j=1;
  int l=1;

  while(i<=N && j<=N){
    B[l++]=i*j++;
    if(j==4){
      i++;
      j=1;
    }
  }

  Arrays.sort(B);
  System.out.print(B[k]);
  }
}
