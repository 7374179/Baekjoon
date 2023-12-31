package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a018_11399 {
  public static void main(String[] args) throws Exception{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(bf.readLine());

    int[] P = new int[N];

    StringTokenizer st = new StringTokenizer(bf.readLine());

    for(int i=0;i<N;i++){
      P[i] = Integer.parseInt(st.nextToken());
    }

    for(int i=1;i<N;i++){
      int j;
      int tmp = P[i];
      for(j=i;j>0 && P[j-1]>tmp;j--){
        P[j] = P[j-1];
      }
      P[j]=tmp;
    }

    int sum=0;
    for(int i=1;i<N;i++){
      P[i]=P[i-1]+P[i];
      sum+=P[i];
    }

    System.out.println(sum+P[0]);
  }
}
