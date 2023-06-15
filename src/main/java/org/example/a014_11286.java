package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class a014_11286 {
  public static void main(String[] args){
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    List<Integer> list = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
//    int[] arr = new int[N];

//    for(int i=0;i<N;i++){
//      arr[i]=sc.nextInt();
//    }

    int i=0;

    while(i<N){
      int m = sc.nextInt();
      if(m==0){
        if(pq.peek()!=null){
          list.add(pq.poll());
        }else{
          list.add(0);
        }
      }else{
        pq.add(m);
      }
      i++;
    }

    for(int k:list){
      System.out.println(k);
    }

  }
}
