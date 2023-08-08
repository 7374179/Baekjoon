package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class a020_2751_1 {
  public static int[] A, tmp;
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    A = new int[N];
    tmp = new int[N];

    for(int i=0;i<N;i++){
      A[i] = sc.nextInt();
    }

    ms(0, N-1);

    for(int a:A){
      System.out.println(a);    }

  }

  private static void ms(int left, int right) {
    if(right-left<1){
      return;
    }

    int mid = left + (right-left)/2;
    ms(left, mid);
    ms(mid+1, right);

    for(int i=left;i<right;i++){
      tmp[i]=A[i];
    }

    int k=left;
    int index1=left;
    int index2=mid+1;

    while(index1<= mid && index2< right){
      if(tmp[index1]>tmp[index2]){
        A[k]=tmp[index2];
        k++;
        index2++;
      }else{
        A[k]=tmp[index1];
        k++;
        index1++;
      }
    }

    while(index1<=mid){
      A[k]=tmp[index1];
      k++;
      index1++;
    }
    while(index2<right){
      A[k++]=tmp[index2];
      k++;
      index2++;
    }
  }
}
