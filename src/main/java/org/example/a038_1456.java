package org.example;

import java.util.Scanner;

public class a038_1456 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int[] arr = new int[10000000];
    int ptr=0;
    arr[ptr++]=2;
    arr[ptr++]=3;

    for(int i=5;i<arr.length;i+=2){
      boolean flag = false;
      for(int n=1;arr[i]*arr[i]<n;n++){
        if(i%arr[n]==0){
          break;
        }
        if(!flag){
          arr[ptr++]=i;
          break;
        }
      }
    }
    int count=0;
    for(int i=0;i<arr.length;i++){
      if(A<=arr[i]*arr[i] && arr[i]*arr[i]<=B){
        count++;
      }
    }
    System.out.println(count);
  }
}
