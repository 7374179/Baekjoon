package org.example;

import java.util.PriorityQueue;
import java.util.Scanner;

public class a033_1715 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    PriorityQueue<Integer> que = new PriorityQueue<>();
    for(int i=0;i<N;i++){
      que.add(sc.nextInt());
    }
    int data1=0;
    int data2=0;
    int sum=0;
    while(que.size()!=1){
      data1=que.poll();
      data2=que.poll();
      sum=sum+data1+data2;
      que.add(sum);
    }

    System.out.println(sum);
  }
}
