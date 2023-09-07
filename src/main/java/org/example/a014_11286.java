package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class a014_11286 {
  public static void main(String[] args) throws IOException {
//    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//    List<Integer> list = new ArrayList<Integer>();
//    Scanner sc = new Scanner(System.in);
//
//    int N = sc.nextInt();
////    int[] arr = new int[N];
//
////    for(int i=0;i<N;i++){
////      arr[i]=sc.nextInt();
////    }
//
//    int i=0;
//
//    while(i<N){
//      int m = sc.nextInt();
//      if(m==0){
//        if(pq.peek()!=null){
//          list.add(pq.poll());
//        }else{
//          list.add(0);
//        }
//      }else{
//        pq.add(m);
//      }
//      i++;
//    }
//
//    for(int k:list){
//      System.out.println(k);
//    }

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> MyQueue = new PriorityQueue<>((o1, o2) -> {
      int first_abs = Math.abs(o1);
      int second_abs = Math.abs(o2);
      if(first_abs == second_abs)
        return o1 > o2 ? 1: -1;
      else
        return first_abs - second_abs;
    });
    for(int i=0;i<N;i++){
      int request = Integer.parseInt(br.readLine());
      if(request == 0){
        if(MyQueue.isEmpty())
          System.out.println("0");
        else
          System.out.println(MyQueue.poll());
      } else {
        MyQueue.add(request);
      }
    }
  }
}
