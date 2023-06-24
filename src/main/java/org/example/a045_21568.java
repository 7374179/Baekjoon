package org.example;

import java.util.Scanner;

public class a045_21568 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();


    for(int i=-100;i<100;i++){
      for(int j=-100;j<100;j++){
        if(j == (C-A*i)%B){
          System.out.println(i+ " "+j);
          break;
        }else{
          System.out.println(-1);
        }
      }
    }
  }
}
