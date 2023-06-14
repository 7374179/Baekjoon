package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a010_11003 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int L = Integer.parseInt(st.nextToken());

    int[] A = new int[N];

    st = new StringTokenizer(br.readLine());
    for(int i=0;i<N;i++){
      A[i]=Integer.parseInt(st.nextToken());
    }

    int[] arr = new int[N];

    int i = 0;
    int tmp=0;

    while(i<N){
      tmp=i-L+1;
      if(tmp<1){
        tmp=L-1;
      }
      int min = A[i];
      for(int j=i+1;j<i+L;j++){
        if(A[j]<min){
          min=A[j];
        }
      }
      for(int k=i;k<i+L;k++){
        arr[k] = min;
      }
      i++;
    }

    System.out.println(Arrays.toString(arr));
  }
}
