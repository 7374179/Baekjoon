package org.example;

import java.util.Scanner;

public class a038_1456 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long[] arr = new long[10000001];

    for(int i=0;i<=B;i++){
      arr[i]=i;
    }
    arr[1]=0;

    for(int i=2;i<Math.sqrt(B);i++){
      if(arr[i]==0){
        continue;
      }
      for(int j=i+i;j<=B;j=j+i){
        arr[j]=0;
      }
    }

    int count=0;
    for(int i=2;i<1000001;i++){
      if(arr[i]!=0){
        long temp = arr[i];
        while((double)arr[i]<=(double)B/(double)temp){
          if((double)arr[i]>=(double)A/(double)temp){
            count++;
          }
          temp=temp*arr[i];
        }
      }
    }
    System.out.println(count);
  }
}
