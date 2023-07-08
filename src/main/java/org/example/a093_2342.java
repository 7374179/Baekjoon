package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a093_2342 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<Integer>();
        while(true){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            list.add(n);
        }

        int count = 1;
        int sum = 2;


        for(int i=1;i<list.size();i++){
            if(list.get(i)==0){
                break;
            }
            if(count>0){
                if(list.get(i-1)==list.get(i)){
                    sum+=1;
                    count--;
                }else{
                    sum+=2;
                    count--;
                }
            }else{
                if(list.get(i-1)==list.get(i)){
                    sum+=1;
                }else{
                    sum+=3;
                }
            }
        }
        System.out.println(sum);
    }
}
