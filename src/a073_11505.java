package org.example;

import java.util.Scanner;

public class a073_11505 {
    static long[] tree;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int length = N;
        int treeHeight=0;
        while(length!=0){
            length=length/2;
            treeHeight++;
        }
        int treeSize = (int)Math.pow(2, treeHeight+1);
        int leftNodeStartIndex = treeSize/2-1;
        tree = new long[treeSize+1];

        for(int i=leftNodeStartIndex+1;i<=leftNodeStartIndex+N;i++){
            tree[i]=sc.nextInt();
        }
        for(int i=leftNodeStartIndex+1;i<=leftNodeStartIndex+M+K;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==1){

            }else if(a==2){

            }else{
                return;
            }
        }
    }
}
