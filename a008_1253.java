package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class a008_1253 {
  public static void main(String[] args) throws IOException {
//    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//    int N = Integer.parseInt(bf.readLine());
//    long[] arr = new long[N];
//    int count = 0;
//
//    StringTokenizer st = new StringTokenizer(bf.readLine());
//    for(int i=0;i<N;i++){
//      arr[i]=Integer.parseInt(st.nextToken());
//    }
//
//    Arrays.sort(arr);
//
//
//
//    for(int i=2;i<N;i++){
//      int sr = 0;
//      int ed = i-1;
//      while(sr<ed){
//        if(arr[sr]+arr[ed]==arr[i]){
//          count++;
//          break;
//        }else if(arr[sr]+arr[ed]>arr[i]){
//          ed--;
//        }else{
//          sr++;
//        }
//
//      }
//    }
//    if(N==1||N==2){
//      System.out.println(0);
//    }else{
//      System.out.println(count);
//    }
//    bf.close();

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];
    int[] checked = new int[N];

    for(int i=0;i<N;i++){
      arr[i]=sc.nextInt();
    }

    int left=0;
    int curr=1;
    int sum=0;
    int tmp=left+curr;

    while(left<N){
      sum=arr[left]+arr[curr];
      while(tmp<N){
        if(sum==arr[tmp]){
          checked[arr[tmp]]++;
          curr++;
          break;
        }else{
          tmp++;
        }
      }
    }


  }
}
