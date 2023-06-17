package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a021_1517 {
  public static void main(String[] args) throws Exception{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(bf.readLine());

    StringTokenizer st = new StringTokenizer(bf.readLine());

    int[] A = new int[N];
    int count = 0;
    for(int i=0;i<N;i++){
      A[i] = Integer.parseInt(st.nextToken());
    }

    int left = 0;
    int right = N-1;
    int last = right;

    while(left<right){
      for(int j=right;j>left;j--){
        if(A[j-1]>A[j]){
          int tmp = A[j - 1];
          A[j - 1] = A[j];
          A[j] = tmp;
          count++;
          last = j;
        }
      }
      left = last;
      for(int j=left;j<right;j++){
        if(A[j]>A[j+1]){
          int tmp = A[j - 1];
          A[j - 1] = A[j];
          A[j] = tmp;
          count++;
          last = j;
        }
      }
      right = last;
    }

//    while(k<N-1){
//      int last = N-1;
//      for(int j=N-1;j>k;j--) {
//        if (A[j - 1] > A[j]) {
//          int tmp = A[j - 1];
//          A[j - 1] = A[j];
//          A[j] = tmp;
//          count++;
//          last = j;
//        }
//      }
//        k = last;
//
//    }

//    for(int i=0;i<N-1;i++){
//      for(int j=N-1;j>0;j--){
//        if(A[j-1]>A[j]){
//          int tmp = A[j-1];
//          A[j-1] = A[j];
//          A[j] = tmp;
//          count++;
//        }
//      }
//    }

    System.out.println(count);
  }
}
