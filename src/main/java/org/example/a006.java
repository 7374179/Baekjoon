package org.example;

import java.util.Scanner;

public class a006 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    long[] arr = new long[N+1];
    long[] sum = new long[N+1];
    int count=0;

    for(int i=1;i<=N;i++){
      arr[i]=i;
      sum[i]=sum[i-1]+arr[i];
    }

    for(int i=0;i<N;i++){
      for(int j=i+1;j<=N;j++){
        if(sum[j]-sum[i]>15){
          break;
        }
        if(sum[j]-sum[i]==N){
          count++;
        }
      }
    }

    System.out.println(count);
  }
}
