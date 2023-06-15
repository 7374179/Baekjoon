package org.example;

import java.util.*;

public class a011_1874 {
  public static void main(String[] args){
    Stack<Integer> stack = new Stack<>();
    List<String> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];

    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    int i = 0;
    int j = 1;

    // 이부분 때문에 Time complexity는 n^2이 된다. 나중에 줄여보자!!
    while(i<n){
      while(i<n){
        if(arr[i]>=j){
          stack.push(j);
          list.add("+");
        }else if(arr[i]<j){
          if(stack.peek()==arr[i]){
            stack.pop();
            list.add("-");
            break;
          }else{
            list.add("NO");
            break;
          }
        }else{
          stack.pop();
          list.add("-");
        }
        j++;
      }
      i++;
    }

    Iterator it = list.iterator();
    while(it.hasNext()){
      if(list.contains("NO")){
        System.out.println("NO");
        break;
      }else{
        System.out.println(it.next());
      }
    }
  }
}

