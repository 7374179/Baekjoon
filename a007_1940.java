package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class a007_1940 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] arr = new int[N];
    int count = 0;
    int st = 0;

    for(int i=0;i<N;i++){
      arr[i]=sc.nextInt();
    }

    Arrays.sort(arr);
    int ed = arr.length-1;

    while(ed>st){
      if(arr[st]+arr[ed]==M){
        count++;
        st++;
        ed--;
      }else if(arr[st]+arr[ed]>M){
        ed--;
      }else{
        st++;
      }
    }
    System.out.println(count);
  }
}
