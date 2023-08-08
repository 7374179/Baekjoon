package org.example;

import java.util.Scanner;

public class a016_1377 {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int[] A = new int[N];

    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
    }

    int count=0;

    for(int i=0;i<N;i++){
      count=0;
      for(int j=0;j<N-1;j++){
        if(A[j]>A[j+1]){
          count++;
          int tmp = A[j];
          A[j] = A[j+1];
          A[j+1] = tmp;
        }
      }
      if(count==0){
        System.out.println(A[i]);
        break;
      }
    }

  }
}
