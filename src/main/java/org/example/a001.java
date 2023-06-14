package org.example;

import java.util.Scanner;

public class a001 {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();

    String sNum = scan.next();
    char[] ch = sNum.toCharArray();

    int sum=0;

    for(int i=0; i<N;i++){
      sum=sum+ch[i] -'0';
    }

    System.out.println(sum);
  }
}
