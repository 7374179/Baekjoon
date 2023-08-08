package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class a012_17298 {
  public static void main(String[] args){
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    List<Integer> list = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    int N =sc.nextInt();
    int[] arr = new int[N];

    for(int i=0;i<N;i++){
      arr[i]=sc.nextInt();
    }
    stack1.add(arr[0]);
    stack2.add(arr[0]);
    stack2.add(arr[1]);

    int i = 1;
    int j = 2;
    int p = 1;
    while(i<N){
      if(stack1.peek()<stack2.peek()&&j<N){
        list.add(stack2.peek());
        if(i==N-1){
          break;
        }else{
          stack1.add(arr[i+1]);
          stack2.add(arr[j]);
        }
      }else{
        stack2.add(arr[j++]);
      }
//      i++;

      if(i==N){
        i=p;
        list.add(-1);
        stack2.clear();
        stack1.add(arr[i]);
        stack2.addAll(stack1);
        i++;
        stack2.add(arr[i]);
        p++;
        j++;
      }
    }

    for(int k:list){
      System.out.print(k + " ");
    }


  }
}
