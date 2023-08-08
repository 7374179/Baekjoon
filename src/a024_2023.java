package org.example;

import java.util.Scanner;

public class a024_2023 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    double tmp = Math.pow(10, N-1);

    for(int i=(int)tmp;i<tmp*10;i++){
      if(i%2==0||i%3==0||i%5==0){
        continue;
      }
      System.out.println(i);
    }
  }
}
