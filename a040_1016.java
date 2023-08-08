package org.example;

import java.util.Scanner;

public class a040_1016 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long min = sc.nextLong();
    long max = sc.nextLong();
    int count=0;

    for(long i=min;i<=max;i++){
      if(i*i<=max){
        count++;
      }else{
        break;
      }
    }
    System.out.println(max-min-count+1);
  }
}
