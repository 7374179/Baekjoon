package org.example;

import java.util.Scanner;

public class a039_1747 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[1000001];
    for(int i=2;i<1000001;i++){
      arr[i]=i;
    }
    for(int i=2;i<Math.sqrt(1000001);i++){
      if(arr[i]==0){
        continue;
      }
      for(int j=i*i;j<1000001;j=j+i){
        arr[j]=0;
      }
    }
    int i = N;
    while(true){
      if(arr[i]!=0){
        int result = arr[i];
        if(isPalindrome(result)){
          System.out.println(result);
          break;
        }
      }
      i++;
    }
  }
  private static boolean isPalindrome(int target){
    char temp[] = String.valueOf(target).toCharArray();
    int s = 0;
    int e = temp.length - 1;
    while(s<e){
      if(temp[s]!=temp[e]) {
        return false;
      }
        s++;
        e--;
      }
    return true;
  }

}
