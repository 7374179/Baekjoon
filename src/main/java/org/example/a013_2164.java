package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

public class a013_2164 {
  public static void main(String[] args){
    Queue<Integer> que1 = new LinkedList<Integer>();
    Queue<Integer> que2 = new LinkedList<Integer>();

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for(int i=1;i<=N;i++){
      que1.add(i);
    }

    while(que1.size()>1){
      while(que1.size()>1){
        que1.poll();
        que2.add(que1.poll());
      }

      que1.addAll(que2);
      que2.clear();
    }

    System.out.println(que1.peek());

//    Scanner sc = new Scanner(System.in);
//    Queue<Integer> myQueue = new LinkedList<>();
//    int N = sc.nextInt();
//    for(int i=1;i<=N;i++){
//      myQueue.add(i);
//    }
//    while(myQueue.size()>1){
//      myQueue.poll();
//      myQueue.add(myQueue.poll());
//    }
//    System.out.println(myQueue.poll());
  }
}
