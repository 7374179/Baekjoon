package org.example;

import java.util.Scanner;

public class a060_1219 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int start = sc.nextInt();
    int end = sc.nextInt();
    int M = sc.nextInt();

    int[] arr = new int[N+1];

    for(int i=1;i<=N;i++){
      arr[i]=Integer.MAX_VALUE;
    }
    arr[start]=0;


  }
}
