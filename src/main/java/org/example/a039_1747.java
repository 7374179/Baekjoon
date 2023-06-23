package org.example;

import java.util.Scanner;

public class a039_1747 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int ptr=0;
    int[] arr = new int[100000];

    arr[ptr++]=2;
    arr[ptr++]=3;

    for(int i=5;i<=N;i+=2){
      boolean flag = false;
      for(int n=0;arr[n]*arr[n]<=i;n++) {
        if (i % arr[n] == 0) {
          flag = true;
          break;
        }
      }
        if(!flag){
          arr[ptr++]=i;
        }

    }
    int sum=0;
    int count=0;

    for(int i=0;i<arr.length;i++){
      int tmp = arr[i];
      int co=0;
      while(tmp>0){
        co = tmp;
        sum = sum*10+tmp%10;
        tmp=tmp/10;
      }
      if(sum==co){
        count++;
      }
      sum=0;
    }
    System.out.println(count);
  }
}
