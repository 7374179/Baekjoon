package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a019_11004 {
  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int[] A = new int[N];

    st = new StringTokenizer(bf.readLine());
    for(int i=0;i<N;i++){
      A[i]= Integer.parseInt(st.nextToken());
    }

    quickSort(A, 0, N-1);

    System.out.println(A[K-1]);

  }

  private static void quickSort(int[] A, int left, int right) {
    int pl = left;
    int pr = right;
    int pivot = A[(left+right)/2];

    do{
      while(A[pl]<pivot) pl++;
      while(A[pr]>pivot) pr--;
      if(pl<=pr){
        int tmp = A[pl];
        A[pl] = A[pr];
        A[pr] = tmp;
        pl++;
        pr--;
      }
    } while(pl<=pr);
    if(left<pr) quickSort(A, left, pr);
    if(pl<right) quickSort(A, pl, right);
  }
}
