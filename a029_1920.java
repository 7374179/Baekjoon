package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class a029_1920 {
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
//    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int N = sc.nextInt();
    int[] arrN = new int[N];
//    StringTokenizer st = new StringTokenizer(bf.readLine());
    for(int i=0;i<N;i++){
      arrN[i] = sc.nextInt();
    }
    Arrays.sort(arrN);

    int M = sc.nextInt();
    int[] arrM = new int[M];
//    st = new StringTokenizer(bf.readLine());
    for(int i=0;i<M;i++){
      arrM[i] = sc.nextInt();
    }

    int[] result = new int[M];

    int i=-1;
    int pl = 0;
    int pr = arrM.length-1;
    while(i<arrM.length-1){
      if(i==-1 || pl>pr) i++;
      pl = 0;
      pr = arrM.length-1;
      while(pl<=pr){
        int mid =(pl+pr)/2;
        if(arrM[i]==arrN[mid]){
          result[i] = 1;
          i++;
//          pl=0;
//          pr=arrM.length-1;
          break;
        }else if(arrM[i]<arrN[mid]){
          pr=mid-1;
        }else if(arrM[i]>arrN[mid]){
          pl=mid+1;
        }
      }
    }

    for(int k:result){
      System.out.println(k);
    }
  }
}
