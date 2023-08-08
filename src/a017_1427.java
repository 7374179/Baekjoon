package org.example;

import java.util.Scanner;

public class a017_1427 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    int[] arr = new int[str.length()];

    for(int i=0;i<str.length();i++){
      arr[i]=str.charAt(i)-'0';
    }

    for(int i=0;i<arr.length-1;i++){
      int max = i;
      for(int j=i+1;j<arr.length;j++) {
        if (arr[j] > arr[max]) {
          max = j;
        }
      }
        int tmp = arr[max];
        arr[max] = arr[i];
        arr[i] = tmp;
     }

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]);
    }
  }
}
