package org.example;

import java.util.Scanner;

public class a016_1377 {

//  public static void quickSort(int[] A, int left, int right){
//    int pl = left;
//    int pr = right;
//    int mid = (left+right)/2;
//    int count = 0;
//
//    do {
//      while (A[pl] < mid) pl++;
//      while (A[pr] > mid) pr--;
//      if (pl <= pr) {
//        int tmp = A[pl];
//        A[pl] = A[pr];
//        A[pr] = tmp;
//        count++;
//      }
//      if(count==0){
//        System.out.println(A[pl]);
//        break;
//      }
//    }while(pl<=pr);
//
//      if(left<pr)  quickSort(A, left, pr);
//      if(pl<right) quickSort(A, pl, right);
//    }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int[] A = new int[N];

    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
    }

//    quickSort(A, 0, N-1);

    int count=0;

    for(int i=0;i<N;i++){
      count=0;
      for(int j=i+1;j<N-i;j++){
        if(A[i]>A[j]){
          count++;
          int tmp = A[i];
          A[i] = A[j];
          A[j] = tmp;
        }
      }
      if(count==0){
        System.out.println(A[i]);
        break;
      }
    }

  }
}
