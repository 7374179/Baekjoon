package org.example;

import java.util.Scanner;

public class a036_1541 {
  public static int sum=0;
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String tmp = sc.next();

    String[] parts = tmp.split("[-]");

    sum = Integer.parseInt(parts[0]);
    split(tmp);

    for(int i=1;i<parts.length;i++){
      sum = sum-Integer.parseInt(parts[i]);
    }

    System.out.println(sum);
  }

  private static void split(String tmp) {
    String[] parts = tmp.split("[+]");

    for(int i=0;i<tmp.length();i++){
      sum+=Integer.parseInt(parts[i]);
    }

  }
}
