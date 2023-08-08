package org.example;

import java.util.Scanner;

public class a037_1929 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int N = sc.nextInt();
    int[] arr = new int[1000000];
    int ptr=0;
    arr[ptr++]=2;
    arr[ptr++]=3;

    for(int i=5;i<=N;i+=2){
      boolean flag = false;
      for(int a=1;arr[a]*arr[a]<=i;a++) {
        if (i % arr[a] == 0) {
          flag = true;
          break;
        }
      }
        if(!flag){
          arr[ptr++]=i;
        }

    }
    for(int i=0;i<N;i++){
      if(M<=arr[i] && arr[i]<=N){
        System.out.println(arr[i]);
      }
    }
  }
}
