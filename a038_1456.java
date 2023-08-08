package org.example;

import java.util.Scanner;

public class a038_1456 {
  public static void main(String[] args){
//    Scanner sc = new Scanner(System.in);
//    int A = sc.nextInt();
//    int B = sc.nextInt();
//    int[] arr = new int[10000000];
//    int ptr=0;
//    arr[ptr++]=2;
//    arr[ptr++]=3;
//
//    for(int i=5;i<arr.length;i+=2){
//      boolean flag = false;
//      for(int n=1;arr[i]*arr[i]<n;n++){
//        if(i%arr[n]==0){
//          break;
//        }
//        if(!flag){
//          arr[ptr++]=i;
//          break;
//        }
//      }
//    }
//    int count=0;
//    for(int i=0;i<arr.length;i++){
//      if(A<=arr[i]*arr[i] && arr[i]*arr[i]<=B){
//        count++;
//      }
//    }
//    System.out.println(count);
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int[] arr = new int[B+1];

    for(int i=2;i<=B;i++){
      arr[i]=i;
    }
    for(int i=2;i<=Math.sqrt(B);i++){
      if(arr[i]==0){
        continue;
      }
      for(int j=i+i;j<=B;j=j+i){
        arr[j]=0;
      }
    }
    int count=0;
    for(int i=A;i<=B;i++){
      if(i==1){
        continue;
      }
      if(arr[i]==0){
        continue;
      }else{
        int tmp=1;
          tmp=tmp*arr[i];
        while(tmp<=B){
          tmp=tmp*arr[i];
          if(tmp<=B){
            count++;
          }
        }
        tmp=1;
      }


    }
    System.out.println(count);

  }
}
