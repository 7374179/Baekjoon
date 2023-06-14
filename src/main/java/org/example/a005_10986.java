package org.example;

import java.util.Scanner;

public class a005_10986 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int count = 0;

    int[] arr = new int[N];
    int[] sum = new int[N];

    for(int i=0;i<N;i++){
      arr[i]=sc.nextInt();
      if(i==0){
        sum[i]=arr[i];
      }else{
        sum[i]=sum[i-1]+arr[i];
      }
    }

    for(int i=0;i<N;i++){
      for(int j=i;j<N;j++){
        if(sum[j]%M==0){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
