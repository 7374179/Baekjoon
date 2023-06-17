package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class a022_10989 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    
    for(int i=0;i<N;i++){
      arr[i] = sc.nextInt();
    }
    
    int max = getMaxValue(arr);
    int maxDigits = countDigits(max);
    
    Queue<Integer>[] buckets = new LinkedList[10];
    
    for(int i=0;i<10;i++){
      buckets[i] = new LinkedList<>();
    }
    
    for(int i=1;max/i>0;i=i*10){
      distributeToBucket(arr, buckets, i);
      collectFromBuckets(arr, buckets);
    }

    for(int i=0;i<N;i++){
      System.out.println(arr[i]);
    }
  }

  private static int getMaxValue(int[] arr) {
    int max = arr[0];
    for(int i=0;i<arr.length;i++){
      if(arr[i]>max){
        max = arr[i];
      }
    }
    return max;
  }

  private static int countDigits(int max) {
    if(max==0){
      return 1;
    }

    int count = 0;
    while(max>0){
      max = max/10;
      count++;
    }
    return count;
  }

  private static void distributeToBucket(int[] arr, Queue<Integer>[] buckets, int i) {
    for(int num:arr){
      int digit = (num/i)%10;
      buckets[digit].offer(num);
    }
  }

  private static void collectFromBuckets(int[] arr, Queue<Integer>[] buckets) {
    int index=0;
    for(Queue<Integer> bucket:buckets){
      while(!bucket.isEmpty()){
        arr[index++]=bucket.poll();
      }
    }
  }
}
