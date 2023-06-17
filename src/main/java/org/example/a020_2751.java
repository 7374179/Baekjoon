package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class a020_2751 {
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int[] arr = new int[N];

    for(int i=0;i<N;i++){
      arr[i] = sc.nextInt();
    }

    int mid = arr.length/2;
    int[] B = Arrays.copyOf(arr, mid);
    int[] C = Arrays.copyOfRange(arr, mid+1, arr.length);

    ms(B, C, arr);

    for(int a:arr){
      System.out.println(a);
    }

  }

  private static void ms(int[] B, int[] C, int[] arr) {
    int i=0;
    int j=0;
    int k=0;

    while(i<B.length && j<C.length){
      if(B[i]<=C[j]){
        arr[k++]=B[i++];
      }else{
        arr[k++]=C[j++];
      }
    }

    while(j<C.length){
      arr[k++]=C[j++];
    }
    while(i<B.length){
      arr[k++]=B[i++];
    }
  }
}
