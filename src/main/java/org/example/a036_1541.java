package org.example;

import java.util.Scanner;

public class a036_1541 {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String tmp = sc.next();

    String[] parts = tmp.split("[+-]");

    int sum = Integer.parseInt(parts[0]);

    for(int i=1;i<parts.length;i++){
      sum = sum-Integer.parseInt(parts[i]);
    }

    System.out.println(sum);
  }
}
