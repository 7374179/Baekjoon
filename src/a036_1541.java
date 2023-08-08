package org.example;

import java.util.Scanner;

public class a036_1541 {
  public static int sum=0;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String tmp = sc.next();

    split(tmp);

    System.out.println(sum);
  }

  private static void split(String tmp) {
    String[] parts = tmp.split("[-]");

    for(int i=0;i<parts.length;i++){
      String[] arr = parts[i].split("[+]");
      for(int j=0;j<arr.length;j++){
        if(i==0){
          sum+=Integer.parseInt(arr[j]);
        }else{
          sum-=Integer.parseInt(arr[j]);
        }
      }
    }

  }
}
