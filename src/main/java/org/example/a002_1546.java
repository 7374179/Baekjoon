package org.example;

import java.util.Scanner;

public class a002_1546 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double sum = 0;
    int sub = sc.nextInt();

    double[] grade = new double[sub];
    for(int i=0;i<sub;i++){
      grade[i]=sc.nextDouble();
    }

    double max = grade[0];
    for(int i=1;i<sub;i++){
      if(grade[i]>max){
        max=grade[i];
      }
    }

    for(int i=0;i<sub;i++){
      grade[i]=(grade[i]/max)*100;
      sum=sum+grade[i];
    }
    System.out.println(sum/sub);
  }
}
