package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class a008_1253 {
  public static void main(String[] args) throws IOException {
//    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int N = sc.nextInt();
    int N = Integer.parseInt(br.readLine());
    long[] A = new long[N];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0;i<N;i++){
      A[i] = Long.parseLong(st.nextToken());
//      A[i] = sc.nextLong();
    }
    Arrays.sort(A);

    int left = 0;
    int curr = 2;
    int right = curr-1;
    int count = 0;

    while(curr <A.length){
      if(A[curr]==A[left]+A[right]){
        count++;
        curr++;
        right = curr-1;
        left=0;
      }else if(A[curr]>A[left]+A[right]){
        left++;
      }else if(A[curr]<A[left]+A[right]){
        right--;
      }
      if(left>=right){
        curr++;
        left=0;
        right=curr-1;
      }
    }
    System.out.println(count);
  }
}
