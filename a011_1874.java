package org.example;

import java.util.*;

public class a011_1874 {
  public static void main(String[] args){
//    Stack<Integer> stack = new Stack<>();
//    List<String> list = new ArrayList<>();
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//
//    int[] arr = new int[n];
//
//    for(int i=0;i<n;i++){
//      arr[i]=sc.nextInt();
//    }
//
//    int i = 0;
//    int j = 1;
//
//    while(i<n){
//      while(i<n){
//        if(arr[i]>=j){
//          stack.push(j);
//          list.add("+");
//        }else if(arr[i]<j){
//          if(stack.peek()==arr[i]){
//            stack.pop();
//            list.add("-");
//            break;
//          }else{
//            list.add("NO");
//            break;
//          }
//        }else{
//          stack.pop();
//          list.add("-");
//        }
//        j++;
//      }
//      i++;
//    }
//
//    Iterator it = list.iterator();
//    while(it.hasNext()){
//      if(list.contains("NO")){
//        System.out.println("NO");
//        break;
//      }else{
//        System.out.println(it.next());
//      }
//    }

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Stack<Integer> stack = new Stack<>();
    int[] arr = new int[n+1];
    for(int i=0;i<n;i++){
      int a = sc.nextInt();
      arr[i]=i;
    }
    int j=1;

    for(int i=0;i<n;i++){
      while(j<n){
        if(stack.peek()==j){
          System.out.println("-");
          stack.pop();
          j--;
        }else if(stack.peek()>j){
          System.out.println("+");
          stack.add(j);
          j++;
        }
      }
    }
  }
}

