package org.example;

import java.util.Scanner;

public class a015_2750 {
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];

    for(int i=0;i<N;i++){
      arr[i]=sc.nextInt();
    }

    for(int i=0;i<N-1;i++){
      for(int j=i+1;j<N;j++){
        if(arr[i]>arr[j]){
          int tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        }
      }
    }
    for(int i=0;i<N;i++){
      System.out.println(arr[i]);
    }
  }
}
