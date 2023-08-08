package org.example;

import java.util.Scanner;

public class a042_1934 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    int[] arr = new int[T];

    for (int i = 0; i < T; i++) {
      int A = sc.nextInt();
      int B = sc.nextInt();

      if (A > B) {
        int tem = A;
        A = B;
        B = tem;
      }

      int num = 0;
      int tmpA = A;
      int tmpB = B;

      while (A % B != 0) {
        num = A % B;
        A = B;
        if (num == 0) {
          break;
        } else {
          B = num;
        }
      }
      if (num == 1) {
        arr[i] = tmpA * tmpB;
      } else {
        arr[i] = B * (tmpA / B) * (tmpB / B);
      }
    }

    for (int k = 0; k < T; k++) {
      System.out.println(arr[k]);
    }
  }
}
