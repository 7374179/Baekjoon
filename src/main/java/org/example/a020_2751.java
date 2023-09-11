package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class a020_2751 {
  public static int[] A, tmp;
  public static long result;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    A = new int[N + 1];
    tmp = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      A[i] = Integer.parseInt(br.readLine());
    }
    merget_sort(1, N);
    for (int i = 1; i <= N; i++) {
      bw.write(A[i] + "\n");
    }
    bw.flush();
    bw.close();
  }
  private static void merget_sort(int s, int e){
    if(e-s<1)
      return;
    int m = s + (e - s)/2;
    merget_sort(s, m);
    merget_sort(m+1, e);
    for(int i=s;i<=e;i++){
      tmp[i] = A[i];
    }
    int k=s;
    int index1 = s;
    int index2 = m+1;
    while(index1 <= m && index2 <= e){
      if(tmp[index1] > tmp[index2]){
        A[k] = tmp[index2];
        k++;
        index2++;
      } else {
        A[k] = tmp[index1];
        k++;
        index1++;
      }
    }
    while(index1 <= m){
      A[k] = tmp[index1];
      k++;
      index1++;
    }
    while(index2 <= e){
      A[k] = tmp[index2];
      k++;
      index2++;
    }
  }
//    Scanner sc = new Scanner(System.in);
//    int N = sc.nextInt();
//
//    int[] arr = new int[N];
//
//    for(int i=0;i<N;i++){
//      arr[i] = sc.nextInt();
//    }
//
//    int mid = arr.length/2;
//    int[] B = Arrays.copyOf(arr, mid);
//    int[] C = Arrays.copyOfRange(arr, mid+1, arr.length);
//
//    Arrays.sort(B);
//    Arrays.sort(C);
//
//    ms(B, C, arr);
//
//    for(int a:arr){
//      System.out.println(a);
//    }
//
//  }

//  private static void ms(int[] B, int[] C, int[] arr) {
//    int i=0;
//    int j=0;
//    int k=0;
//
//    while(i<B.length && j<C.length){
//      if(B[i]<=C[j]){
//        arr[k++]=B[i++];
//      }else{
//        arr[k++]=C[j++];
//      }
//    }
//
//    while(j<C.length){
//      arr[k++]=C[j++];
//    }
//    while(i<B.length){
//      arr[k++]=B[i++];
//    }
//  }
}
