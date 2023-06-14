package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a009 {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());
    int S = Integer.parseInt(st.nextToken());
    int P = Integer.parseInt(st.nextToken());

    String str = bf.readLine();
    char[] ch = str.toCharArray();

    int A=0;
    int C=0;
    int G=0;
    int T=0;

    st = new StringTokenizer(bf.readLine());
    A = Integer.parseInt(st.nextToken());
    C = Integer.parseInt(st.nextToken());
    G = Integer.parseInt(st.nextToken());
    T = Integer.parseInt(st.nextToken());

    int num = A+C+G+T;

    char[] nc = new char[num];
    int i=0;
    while(i<num){
      if(A>0){
        nc[i]='A';
        A--;
        i++;
      }
      if(C>0){
        nc[i]='C';
        C--;
        i++;
      }
      if(G>0){
        nc[i]='G';
        G--;
        i++;
      }
      if(T>0){
        nc[i]='T';
        T--;
        i++;
      }
    }



  }
}
