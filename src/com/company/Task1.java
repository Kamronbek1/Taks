package com.company;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int[][] array = new int[7][7];
        int curX = 0, curY = 0;
        int X = 3, Y = 3;
        Scanner sc = new Scanner(System.in);
//        System.out.println("1 2 3 4 5 6 7");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                int x = sc.nextInt();
                if (x == 1) {
                    curX = i;
                    curY = j;
                }
                array[i][j] = x;
            }
        }
        System.out.println(Math.abs(X - curX) + Math.abs(Y - curY));
    }
}
