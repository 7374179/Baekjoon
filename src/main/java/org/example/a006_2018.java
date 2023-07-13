package org.example;

import java.util.Scanner;

public class a006_2018 {
  public static void main(String[] args){
//    Scanner sc = new Scanner(System.in);
//    int N = sc.nextInt();
//
//    long[] arr = new long[N+1];
//    long[] sum = new long[N+1];
//    int count=0;
//
//    for(int i=1;i<=N;i++){
//      arr[i]=i;
//      sum[i]=sum[i-1]+arr[i];
//    }
//
//    for(int i=0;i<N;i++){
//      for(int j=i+1;j<=N;j++){
//        if(sum[j]-sum[i]>15){
//          break;
//        }
//        if(sum[j]-sum[i]==N){
//          count++;
//        }
//      }
//    }
//
//    System.out.println(count);

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
//    int[] arr = new int[N+1];
//
//    for(int i=0;i<=N;i++){
//      arr[i]=i;
//    }

    int left=0;
    int curr=1;
    int sum=0;
    int count=0;
    while(left<N){
      if(sum<N){
        sum+=curr;
        curr++;
      }else if(sum>N){
        left++;
        curr=left+1;
        sum=0;
      }else if(sum==N){
        count++;
        left++;
        curr=left+1;
        sum=0;
      }
    }
    System.out.println(count);
  }
}
