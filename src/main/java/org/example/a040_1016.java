package org.example;

import java.util.Scanner;

public class a040_1016 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int min = sc.nextInt();
    int max = sc.nextInt();
    int[] arr = new int[1000001];
    for(int i=1;i<1000001;i++){
      arr[i]=i;
    }
    for(int i=2;i<1000001;i++){
      if(arr[i]==0){
        continue;
      }
      for(int j=i*i;j<1000001;j=j*i){
        arr[i]=0;
      }
    }
    int count=0;
    for(int i=min;i<max;i++){
      if(arr[i]!=0){
        count++;
      }
    }
    System.out.println(count);
  }
}
