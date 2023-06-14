package org.example;

import java.util.Scanner;

public class a003 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

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

    for(int k=0;k<M;k++){
      int i = sc.nextInt();
      int j = sc.nextInt();

      if(i==1){
        System.out.println(sum[j-1]);
      }else{
        System.out.println(sum[j-1]-sum[i-2]);
      }
    }
  }
}
