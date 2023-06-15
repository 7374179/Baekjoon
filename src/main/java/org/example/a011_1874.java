package org.example;

import java.util.Scanner;
import java.util.Stack;

public class a011_1874 {
  public static void main(String[] args){
    Stack<Integer> stack = new Stack<>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];

    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    int i = 0;
    int j = 1;

    stack.push(0);

    while(stack!=null){
      while(stack!=null){
        if(arr[i]>=j){
          stack.push(j);
          System.out.println("+");
        }else if(arr[i]<j){
          if(stack.peek()==arr[i]){
            stack.pop();
            System.out.println("-");
            break;
          }else{
            System.out.println("NO");
            break;
          }
        }else{
          stack.pop();
          System.out.println("-");
        }
        j++;

      }
      i++;
    }

  }
}
