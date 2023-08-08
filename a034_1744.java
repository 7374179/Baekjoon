package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class a034_1744 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);

    int sum1 = 0;

    for (int a : arr) {
      sum1 += a;
    }

    int sum2 = 0;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < N / 2; i++) {
      if (arr[i] < 0 && arr[i + 1] < 0) {
        sum2 += arr[i] * arr[i + 1];
      } else if (arr[i] < 0 && arr[i + 1] > 0) {
        sum2 += arr[i] + arr[i + 1];
      } else if (arr[i] < 0 && arr[i + 1] == 0) {
        sum2 += arr[i] * arr[i + 1];
      } else if (arr[i] == 0 && arr[i + 1] > 0) {
        sum2 += arr[i] + arr[i + 1];
      }
    }

  }
}
