package org.example;

import java.util.Scanner;

public class a033_1715 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    int sum=0;
    int min=Integer.MAX_VALUE;

    for(int i=0;i<N;i++){
      arr[i]=sc.nextInt();
      sum+=arr[i];
    }

    for(int i=0;i<N-1;i++){
      for(int j=i+1;j<N;j++){
        min=Math.min(min, sum+arr[i]+arr[j]);
      }
    }
    System.out.println(min);
  }
}
