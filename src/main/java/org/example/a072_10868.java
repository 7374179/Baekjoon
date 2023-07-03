package org.example;

import java.util.Scanner;

public class a072_10868 {
    static long[] tree;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int treeHeight = 0;
        int length = N;
        while(length!=0){
            length = length/2;
            treeHeight++;
        }
        int treeSize = (int)Math.pow(2, treeHeight+1);
        int leftNodeStartIndex = treeSize/2-1;
        tree = new long[treeSize+1];

        for(int i=leftNodeStartIndex+1;i<=leftNodeStartIndex+N;i++){
            tree[i]=sc.nextInt();
        }
        for(int i=0;i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(findMin(a+leftNodeStartIndex, b+leftNodeStartIndex));
        }
    }
    private static int findMin(int a, int b){
        int min = Integer.MAX_VALUE;
        while(a<=b){
            int tmp1 = (int) Math.min(tree[a], tree[a+1]);
            min = (int) Math.min(min, tmp1);
            int tmp2 = (int) Math.min(tree[b], tree[b-1]);
            min = (int) Math.min(min, tmp2);
            a++;
            b--;
        }
        return min;
    }
}
