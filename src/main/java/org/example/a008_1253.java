package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a008_1253 {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(bf.readLine());
    long[] arr = new long[N];
    int count = 0;

    StringTokenizer st = new StringTokenizer(bf.readLine());
    for(int i=0;i<N;i++){
      arr[i]=Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr);



    for(int i=2;i<N;i++){
      int sr = 0;
      int ed = i-1;
      while(sr<ed){
        if(arr[sr]+arr[ed]==arr[i]){
          count++;
          break;
        }else if(arr[sr]+arr[ed]>arr[i]){
          ed--;
        }else{
          sr++;
        }

      }
    }
    if(N==1||N==2){
      System.out.println(0);
    }else{
      System.out.println(count);
    }
    bf.close();
  }
}
