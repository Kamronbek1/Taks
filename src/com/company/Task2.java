package com.company;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 1;
        for (int i = 2; i <= n; i++) {
            boolean tub = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    tub = false;
                    break;
                }
            }
            if (tub) {
                sum *= i;
            }
        }
        int i = 0;
        while (sum % 10 == 0) {
            i++;
            sum-=sum/10;
        }
        System.out.println(sum);
    }
}
