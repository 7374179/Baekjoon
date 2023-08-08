package org.example;

import java.util.Scanner;

public class a043_1850 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
//    int AA;
//    int BB;
//
//    for(int i=0;i<A;i++){
//
//    }

//    int tmp=0;
//    while(B>0){
//      tmp=A%B;
//      A=B;
//      B=tmp;
//    }
//
//    System.out.println(A);
    long C = Math.abs(A-B);
    long CC=0;
    for(long i=0;i<C;i++){
      CC=CC*10+1;
    }
    System.out.println(CC);
  }
}
